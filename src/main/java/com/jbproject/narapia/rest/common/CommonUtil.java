package com.jbproject.narapia.rest.common;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jbproject.narapia.rest.constants.ServerConstant;
import com.jbproject.narapia.rest.dto.model.ApiResponseModel;
import com.jbproject.narapia.rest.dto.model.WinbidModel;
import com.jbproject.narapia.rest.dto.payload.BidNotiSearchPayload;
import com.jbproject.narapia.rest.dto.payload.NaraSearchPayload;
import com.jbproject.narapia.rest.entity.CommCodeEntity;
import com.jbproject.narapia.rest.repository.CommCodeRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.DecimalFormat;
import java.util.List;
import java.util.Map;

import static org.springframework.util.StringUtils.hasText;

@Slf4j
@Component
@RequiredArgsConstructor
public class CommonUtil {

    public static String naraSecret;
    private static CommCodeRepository commCodeRepository;

    @Autowired
    public CommonUtil(CommCodeRepository commCodeRepository) {
        this.commCodeRepository = commCodeRepository;
    }

    @Value("${naramarket.secret}")
    public void setName(String naraSecret) {
        this.naraSecret = naraSecret;
    }

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
        System.out.println("test : "+request);
        String responseEntity = restTemplate.getForObject(request, String.class);
        System.out.println("test : "+responseEntity);

        Map responseModel = objectMapper.readValue(responseEntity,Map.class);
        System.out.println("test : "+responseModel);

        TypeReference<ApiResponseModel<T>> typeReference = createTypeReference(type);
        return objectMapper.readValue(objectMapper.writeValueAsString(responseModel.get(rootName)), typeReference);
    }

    public static String naraUrlProvide(String path, String method, NaraSearchPayload payload){
        String resultUrl = "";
        String main = ServerConstant.NARA_MAIN_URL;

        String parameter = setParameter(payload);

        // URL과 파라미터 조합
        resultUrl = main + path + method + parameter;

        return resultUrl;
    }

    private static String setParameter(NaraSearchPayload payload){

        String result = "?serviceKey="+naraSecret;

        if(payload.getNumOfRows() != 0){
            result += "&numOfRows="+payload.getNumOfRows();
        }
        if(payload.getPageNo() != 0){
            result += "&pageNo="+payload.getPageNo();
        }
        if(hasText(payload.getInqryDiv())){
            result += "&inqryDiv="+payload.getInqryDiv();
        }
        if(hasText(payload.getType())){
            result += "&type="+payload.getType();
        }
        if(hasText(payload.getInqryBgnDt())){
            result += "&inqryBgnDt="+payload.getInqryBgnDt();
        }
        if(hasText(payload.getInqryEndDt())){
            result += "&inqryEndDt="+payload.getInqryEndDt();
        }
        if(hasText(payload.getBidNtceNo())){
            result += "&bidNtceNo="+payload.getBidNtceNo().replaceAll(" ","");
        }

        return result;
    }

    public static String convertDouble(double value){
        DecimalFormat formatter = new DecimalFormat("###,###.##");

        return formatter.format(value);
    }

    public static List<CommCodeEntity> getCommCodeListByGroupCode(String groupCode) {
        return commCodeRepository.findByGroupCodeOrderBySeqAsc(groupCode);
    }

}
