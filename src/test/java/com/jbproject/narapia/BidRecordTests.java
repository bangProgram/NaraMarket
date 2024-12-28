package com.jbproject.narapia;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jbproject.narapia.rest.dto.model.BidRecordModel;
import com.jbproject.narapia.rest.dto.payload.BidRecordCudPayload;
import com.jbproject.narapia.rest.dto.payload.WinbidAnalSearchPayload;
import com.jbproject.narapia.rest.dto.result.BidNotiResult;
import com.jbproject.narapia.rest.entity.BidRecordEntity;
import com.jbproject.narapia.rest.repository.BidRecordRepository;
import com.jbproject.narapia.rest.service.BidRecordService;
import groovy.util.logging.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

@SpringBootTest
@Slf4j
public class BidRecordTests {
    @Autowired
    private BidRecordRepository bidRecordRepository;

    @Autowired
    private BidRecordService bidRecordService;

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

    @Test
    void getLatestBidRecord(){
        WinbidAnalSearchPayload payload = new WinbidAnalSearchPayload();
        List<BidRecordModel> result = bidRecordService.getLatestBidRecord(payload);
        System.out.println("result1 : "+result);
        if(!result.isEmpty()){
            System.out.println("result2 : "+result.getFirst());
        }
    }



}
