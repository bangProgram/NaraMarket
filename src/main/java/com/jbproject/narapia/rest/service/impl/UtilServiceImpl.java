package com.jbproject.narapia.rest.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jbproject.narapia.rest.common.CommonUtil;
import com.jbproject.narapia.rest.constants.ServerConstant;
import com.jbproject.narapia.rest.dto.model.ApiResponseModel;
import com.jbproject.narapia.rest.dto.model.WinbidDetailModel;
import com.jbproject.narapia.rest.dto.model.WinbidModel;
import com.jbproject.narapia.rest.dto.payload.WinbidDetailSearchPayload;
import com.jbproject.narapia.rest.dto.payload.WinbidSearch;
import com.jbproject.narapia.rest.dto.payload.WinbidSearchPayload;
import com.jbproject.narapia.rest.entity.WinbidDetailEntity;
import com.jbproject.narapia.rest.entity.WinbidEntity;
import com.jbproject.narapia.rest.entity.keys.WinbidDetailKey;
import com.jbproject.narapia.rest.entity.keys.WinbidKey;
import com.jbproject.narapia.rest.repository.WindbidDetailRepository;
import com.jbproject.narapia.rest.repository.WindbidRepository;
import com.jbproject.narapia.rest.service.UtilService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
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

    private final WindbidDetailRepository windbidDetailRepository;

    public void saveWinbid(WinbidSearchPayload payload) throws Exception {

        String apiUrl = ServerConstant.NARA_MAIN_URL;
        String path = ServerConstant.WINBID_PATH;
        String method = ServerConstant.WINBID_METHOD;

        String parameter = setParameter(payload);

        // URL과 파라미터 조합
        String requestUri = apiUrl + path + method + parameter;

        ApiResponseModel<WinbidModel> responseModel = CommonUtil.getNaraResponse(requestUri, "response",WinbidModel.class);

        ApiResponseModel.Body<WinbidModel> body = responseModel.getBody();

        List<WinbidModel> items = body.getItems();
        int totalCnt = body.getTotalCount();
        int rowCnt = payload.getNumOfRows();
        int curPageNo = payload.getPageNo();



        while (totalCnt > 0){

            for(WinbidModel item : items){
                WinbidKey key = WinbidKey.builder()
                        .bidClsfcNo(item.getBidClsfcNo())
                        .bidNtceNo(item.getBidNtceNo())
                        .bidNtceOrd(item.getBidNtceOrd())
                        .build();

                Optional<WinbidEntity> entity = windbidRepository.findById(key);
                if(entity.isPresent()){
                    WinbidEntity modEntity = entity.get();
                    modEntity.update(item);

                    windbidRepository.save(modEntity);
                }else{
                    WinbidEntity newEntity = new WinbidEntity(item);

                    windbidRepository.save(newEntity);
                }
            }
            totalCnt = totalCnt - rowCnt;

            Thread.sleep(ServerConstant.NARA_DELAY_MILLI_SEC);

            if(totalCnt > 0){
                curPageNo += 1;
                payload.setPageNo(curPageNo);

                parameter = setParameter(payload);
                requestUri = apiUrl + path + method + parameter;
                responseModel = CommonUtil.getNaraResponse(requestUri, "response",WinbidModel.class);
                body = responseModel.getBody();
                items = body.getItems();
            }

        }


    }

    public void saveWinbidDetail(WinbidDetailSearchPayload payload) throws Exception {
        String apiUrl = ServerConstant.NARA_MAIN_URL;
        String path = ServerConstant.WINBID_PATH;
        String method = ServerConstant.WINBID_DETAIL_METHOD;

        String parameter = setParameter(payload);

        // URL과 파라미터 조합
        String requestUri = apiUrl + path + method + parameter;

        ApiResponseModel<WinbidDetailModel> responseModel = CommonUtil.getNaraResponse(requestUri, "response",WinbidDetailModel.class);
        ApiResponseModel.Body<WinbidDetailModel> body = responseModel.getBody();

        List<WinbidDetailModel> items = body.getItems();
        int totalCnt = body.getTotalCount();
        int rowCnt = payload.getNumOfRows();
        int curPageNo = payload.getPageNo();

        while (totalCnt > 0){

            for(WinbidDetailModel item : items){
                WinbidDetailKey key = WinbidDetailKey.builder()
                        .bidClsfcNo(item.getBidClsfcNo())
                        .bidNtceNo(item.getBidNtceNo())
                        .bidNtceOrd(item.getBidNtceOrd())
                        .compnoRsrvtnPrceSno(item.getCompnoRsrvtnPrceSno())
                        .build();

                Optional<WinbidDetailEntity> entity = windbidDetailRepository.findById(key);
                if(entity.isPresent()){
                    WinbidDetailEntity modEntity = entity.get();
                    modEntity.update(item);

                    windbidDetailRepository.save(modEntity);
                }else{
                    WinbidDetailEntity newEntity = new WinbidDetailEntity(item);

                    windbidDetailRepository.save(newEntity);
                }
            }
            totalCnt = totalCnt - rowCnt;

            Thread.sleep(ServerConstant.NARA_DELAY_MILLI_SEC);

            if(totalCnt > 0){
                curPageNo += 1;
                payload.setPageNo(curPageNo);

                parameter = setParameter(payload);
                requestUri = apiUrl + path + method + parameter;
                responseModel = CommonUtil.getNaraResponse(requestUri, "response",WinbidDetailModel.class);
                body = responseModel.getBody();
                items = body.getItems();
            }

        }


    }

    public String setParameter(WinbidSearch payload){

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
            result += "&bidNtceNo="+payload.getBidNtceNo();
        }

        /*
        if(payload instanceof WinbidSearchPayload){
        }
        if(payload instanceof WinbidDetailSearchPayload){
        }
        */

        return result;
    }

}
