package com.jbproject.narapia.rest.common;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jbproject.narapia.rest.dto.model.ApiResponseModel;
import com.jbproject.narapia.rest.dto.model.WinbidModel;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.client.RestTemplate;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;

@Slf4j
@RequiredArgsConstructor
public class CommonUtil {

    private static final ObjectMapper objectMapper = new ObjectMapper();

    private static <T> TypeReference<ApiResponseModel<T>> createTypeReference(Class<T> clazz) {
        return new TypeReference<ApiResponseModel<T>>() {
            @Override
            public Type getType() {
                return new ParameterizedType() {
                    @Override
                    public Type getRawType() {
                        return ApiResponseModel.class;
                    }

                    @Override
                    public Type[] getActualTypeArguments() {
                        return new Type[]{clazz};  // 동적으로 전달된 클래스 타입을 사용
                    }

                    @Override
                    public Type getOwnerType() {
                        return null;
                    }
                };
            }
        };
    }

    public static  <T>  ApiResponseModel<T>  getNaraResponse(String requestUri, String rootName, Class<T> type) throws URISyntaxException, JsonProcessingException {
        URI request = new URI(requestUri);

        RestTemplate restTemplate = new RestTemplate();
        String responseEntity = restTemplate.getForObject(request, String.class);

        Map responseModel = objectMapper.readValue(responseEntity,Map.class);

        TypeReference<ApiResponseModel<T>> typeReference = createTypeReference(type);
        return objectMapper.readValue(objectMapper.writeValueAsString(responseModel.get(rootName)), typeReference);
    }
}
