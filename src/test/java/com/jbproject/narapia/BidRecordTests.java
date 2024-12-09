package com.jbproject.narapia;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jbproject.narapia.rest.dto.payload.BidRecordCudPayload;
import com.jbproject.narapia.rest.dto.result.BidNotiResult;
import groovy.util.logging.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class BidRecordTests {

    @Test
    void test(){
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            String serialData = "{\"bidNtceNo\":\"20231223919\",\"bidNtceOrd\":\"00\",\"bidClsfcNo\":\"1\",\"bidNtceNm\":\"2024년 식품의약품안전평가원 시약 및 실험기자재 연간 단가계약[제2023-373호]\",\"ntceInsttCd\":\"1471057\",\"ntceInsttNm\":\"식품의약품안전처 식품의약품안전평가원\",\"dminsttCd\":\"1471057\",\"dminsttNm\":\"식품의약품안전처 식품의약품안전평가원\",\"bssamt\":\"93,700\",\"presmptPrce\":\"2,240,522,000\",\"rsrvtnPrceRngBgnRate\":\"-2\",\"rsrvtnPrceRngEndRate\":\"+2\",\"sucsfbidLwltRate\":\"84.245\",\"dtilPrdctClsfcNo\":\"5132020201\",\"dtilPrdctClsfcNoNm\":\"일반검사용시약\",\"prdctSpecNm\":\"Methanol(HPLC) \",\"4L\",\"prdctQty\":\"446\",\"prdctUnit\":\"EA\",\"prdctUprc\":\"0\"}";

            BidRecordCudPayload result = objectMapper.readValue(serialData, BidRecordCudPayload.class);
        }catch (Exception e){
            System.out.println("error : "+e.getMessage());
        }
    }
}