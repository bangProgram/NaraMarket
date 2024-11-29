package com.jbproject.narapia.rest.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jbproject.narapia.rest.constants.ServerConstant;
import com.jbproject.narapia.rest.dto.model.ApiResponseModel;
import com.jbproject.narapia.rest.dto.payload.WinbidSearchPayload;
import com.jbproject.narapia.rest.repository.WindbidRepository;
import com.jbproject.narapia.rest.service.UtilService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriBuilder;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.io.InputStreamReader;
import java.net.URI;
import java.net.URL;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.util.*;
import java.util.function.Function;

import static org.springframework.util.StringUtils.hasText;

@Service
@Slf4j
@RequiredArgsConstructor
@Transactional
public class UtilServiceImpl implements UtilService {

    @Value("${naramarket.secret}")
    private String naraSecret;

    private final WindbidRepository windbidRepository;

    public void saveWinbid(WinbidSearchPayload payload) throws Exception {
        System.out.println("test");
        ObjectMapper objectMapper = new ObjectMapper();

        String apiUrl = ServerConstant.NARA_MAIN_URL;
        String path = ServerConstant.WINBID_PATH;
        String method = ServerConstant.WINBID_MAIN_PATH;
        payload.setNumOfRows("10");
        payload.setPageNo("1");
        payload.setInqryDiv("4");
        payload.setBidNtceNo("20230301028");

        String parameter = setParameter(payload);

        System.out.println("test1");
        // URL과 파라미터 조합
        String requestUri = apiUrl + path + method + parameter;
        System.out.println("test2");

        UriComponents uri = UriComponentsBuilder
                .fromUriString(apiUrl)
                .path(path+method)
                .queryParam("serviceKey", "qD8YVKAXvCbeS6RBeEUljGCFc1TZmIpdU%2B6pHSPegrp2pneNvgKA%2BasdTjCFqaYTRgcfKlYURMpU3b57bxgx%2Fg%3D%3D")
                .queryParam("numOfRows", payload.getNumOfRows())
                .queryParam("pageNo", payload.getPageNo())
                .queryParam("inqryDiv", payload.getInqryDiv())
                .queryParam("type", payload.getType())
                .queryParam("bidNtceNo", payload.getBidNtceNo())
                .build(false);

        RestTemplate restTemplate1 = new RestTemplate();

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<String> entity = new HttpEntity<>(headers);


        System.out.println("uri = " + uri);

        RestTemplate restTemplate2 = new RestTemplate();
        ResponseEntity<String> responseEntity1 = restTemplate1.exchange(uri.toUriString(), HttpMethod.GET, entity, String.class);

        System.out.println("GET result: " + responseEntity1);

        // HTTP GET 요청 보내기
        System.out.println("requestUri : "+requestUri);
        ResponseEntity<String> responseEntity = restTemplate2.getForEntity(requestUri, String.class);

        // 응답 값
        String responseBody = responseEntity.getBody();
        System.out.println("GET Response: " + responseBody);



//        Thread.sleep(Integer.parseInt(ServerUtilConstant.CORP_MERGE_DELAY.getValue()));
    }

    public String setParameter(WinbidSearchPayload payload) {
        String result = "?serviceKey=qD8YVKAXvCbeS6RBeEUljGCFc1TZmIpdU%2B6pHSPegrp2pneNvgKA%2BasdTjCFqaYTRgcfKlYURMpU3b57bxgx%2Fg%3D%3D";


        if(hasText(payload.getNumOfRows())){
            result += "&numOfRows="+payload.getNumOfRows();
        }
        if(hasText(payload.getPageNo())){
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
            result += "&bidNtceNo="+payload.getBidNtceNo();
        }

        return result;
    }

    public Map<String,Object> setParameterMap(WinbidSearchPayload payload) {
        Map<String,Object> result = new HashMap<>();

        if(hasText(payload.getNumOfRows())){
            result.put("numOfRows",payload.getNumOfRows());
        }
        if(hasText(payload.getPageNo())){
            result.put("pageNo",payload.getPageNo());
        }
        if(hasText(payload.getInqryDiv())){
            result.put("inqryDiv",payload.getInqryDiv());
        }
        if(hasText(payload.getType())){
            result.put("type",payload.getType());
        }
        if(hasText(payload.getInqryBgnDt())){
            result.put("inqryBgnDt",payload.getInqryBgnDt());
        }
        if(hasText(payload.getInqryEndDt())){
            result.put("inqryEndDt",payload.getInqryEndDt());
        }
        if(hasText(payload.getBidNtceNo())){
            result.put("bidNtceNo",payload.getBidNtceNo());
        }

        return result;
    }

}
