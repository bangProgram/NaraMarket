package com.jbproject.narapia.rest.service.impl;

import com.jbproject.narapia.rest.common.CommonUtil;
import com.jbproject.narapia.rest.constants.ServerConstant;
import com.jbproject.narapia.rest.dto.model.*;
import com.jbproject.narapia.rest.dto.payload.*;
import com.jbproject.narapia.rest.entity.*;
import com.jbproject.narapia.rest.entity.keys.*;
import com.jbproject.narapia.rest.repository.*;
import com.jbproject.narapia.rest.service.UtilService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.*;

import static org.springframework.util.StringUtils.hasText;

@Service
@Slf4j
@RequiredArgsConstructor
public class UtilServiceImpl implements UtilService {

    @Value("${naramarket.secret}")
    private String naraSecret;

    private final WinbidRepository winbidRepository;
    private final WinbidDetailRepository winbidDetailRepository;

    private final BidNotiRepository bidNotiRepository;
    private final BidNotiDetailRepository bidNotiDetailRepository;

    private final BidNotiProductRepository bidNotiProductRepository;
    private final WinbidAnalRepository winbidAnalRepository;

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

                Optional<WinbidEntity> entity = winbidRepository.findById(key);
                if(entity.isPresent()){
                    WinbidEntity modEntity = entity.get();
                    modEntity.update(item);

                    winbidRepository.save(modEntity);
                }else{
                    WinbidEntity newEntity = new WinbidEntity(item);

                    winbidRepository.save(newEntity);
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

                Optional<WinbidDetailEntity> entity = winbidDetailRepository.findById(key);
                if(entity.isPresent()){
                    WinbidDetailEntity modEntity = entity.get();
                    modEntity.update(item);

                    winbidDetailRepository.save(modEntity);
                }else{
                    WinbidDetailEntity newEntity = new WinbidDetailEntity(item);

                    winbidDetailRepository.save(newEntity);
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

    public void saveBidNoti(BidNotiSearchPayload payload) throws Exception {
        String apiUrl = ServerConstant.NARA_MAIN_URL;
        String path = ServerConstant.NARA_BIDNOTI_PATH;
        String method = ServerConstant.BIDNOTI_GOODS_METHOD;

        String parameter = setParameter(payload);

        // URL과 파라미터 조합
        String requestUri = apiUrl + path + method + parameter;

        ApiResponseModel<BidNotiModel> responseModel = CommonUtil.getNaraResponse(requestUri, "response", BidNotiModel.class);
        ApiResponseModel.Body<BidNotiModel> body = responseModel.getBody();

        List<BidNotiModel> items = body.getItems();
        int totalCnt = body.getTotalCount();
        int rowCnt = payload.getNumOfRows();
        int curPageNo = payload.getPageNo();

        while (totalCnt > 0){

            for(BidNotiModel item : items){
                BidNotiKey key = BidNotiKey.builder()
                        .bidNtceNo(item.getBidNtceNo())
                        .bidNtceOrd(item.getBidNtceOrd())
                        .build();

                Optional<BidNotiEntity> entity = bidNotiRepository.findById(key);
                if(entity.isPresent()){
                    BidNotiEntity modEntity = entity.get();
                    modEntity.update(item);

                    bidNotiRepository.save(modEntity);
                }else{
                    BidNotiEntity newEntity = new BidNotiEntity(item);

                    bidNotiRepository.save(newEntity);
                }

                if(hasText(item.getPurchsObjPrdctList())){
                    List<String> prdctList = Arrays.stream(item.getPurchsObjPrdctList().split(",")).toList();

                    for(String product : prdctList){
                        String[] dataList = product.replace("[","").replace("]","").split("\\^");

                        System.out.println("product : "+product);
                        System.out.println("dataList : "+dataList.length);

                        if(dataList.length ==  3){
                            String order = dataList[0];
                            String code = dataList[1];
                            String productNm = dataList[2];
                            if(!hasText(order) || !hasText(code)) {
                                continue;
                            }

                            BidNotiProductKey productKey = BidNotiProductKey.builder()
                                    .bidNtceNo(item.getBidNtceNo())
                                    .bidNtceOrd(item.getBidNtceOrd())
                                    .productOrder(order)
                                    .productCode(code)
                                    .build();

                            Optional<BidNotiProductEntity> productEntity = bidNotiProductRepository.findById(productKey);

                            if(productEntity.isPresent()){
                                BidNotiProductEntity modProductEntity = productEntity.get();

                                modProductEntity.update(productNm);
                                bidNotiProductRepository.save(modProductEntity);
                            }else{
                                BidNotiProductEntity newProductEntity = BidNotiProductEntity.builder()
                                        .id(productKey)
                                        .product(productNm)
                                        .build();

                                bidNotiProductRepository.save(newProductEntity);
                            }
                        }

                    }
                }
            }
            totalCnt = totalCnt - rowCnt;

            Thread.sleep(ServerConstant.NARA_DELAY_MILLI_SEC);

            if(totalCnt > 0){
                curPageNo += 1;
                payload.setPageNo(curPageNo);

                parameter = setParameter(payload);
                requestUri = apiUrl + path + method + parameter;
                responseModel = CommonUtil.getNaraResponse(requestUri, "response", BidNotiModel.class);
                body = responseModel.getBody();
                items = body.getItems();
            }

        }

    }

    public void saveBidNotiDetail(BidNotiDetailSearchPayload payload) throws Exception {
        String apiUrl = ServerConstant.NARA_MAIN_URL;
        String path = ServerConstant.NARA_BIDNOTI_PATH;
        String method = ServerConstant.BIDNOTI_GOODS_DETAIL_METHOD;

        String parameter = setParameter(payload);

        // URL과 파라미터 조합
        String requestUri = apiUrl + path + method + parameter;

        ApiResponseModel<BidNotiDetailModel> responseModel = CommonUtil.getNaraResponse(requestUri, "response", BidNotiDetailModel.class);
        ApiResponseModel.Body<BidNotiDetailModel> body = responseModel.getBody();

        List<BidNotiDetailModel> items = body.getItems();
        int totalCnt = body.getTotalCount();
        int rowCnt = payload.getNumOfRows();
        int curPageNo = payload.getPageNo();

        while (totalCnt > 0) {

            for (BidNotiDetailModel item : items) {
                BidNotiDetailKey key = BidNotiDetailKey.builder()
                        .bidNtceNo(item.getBidNtceNo())
                        .bidNtceOrd(item.getBidNtceOrd())
                        .bidClsfcNo(item.getBidClsfcNo())
                        .build();

                Optional<BidNotiDetailEntity> entity = bidNotiDetailRepository.findById(key);
                if (entity.isPresent()) {
                    BidNotiDetailEntity modEntity = entity.get();
                    modEntity.update(item);

                    bidNotiDetailRepository.save(modEntity);
                } else {
                    BidNotiDetailEntity newEntity = new BidNotiDetailEntity(item);

                    bidNotiDetailRepository.save(newEntity);
                }

            }
            totalCnt = totalCnt - rowCnt;

            Thread.sleep(ServerConstant.NARA_DELAY_MILLI_SEC);

            if (totalCnt > 0) {
                curPageNo += 1;
                payload.setPageNo(curPageNo);

                parameter = setParameter(payload);
                requestUri = apiUrl + path + method + parameter;
                responseModel = CommonUtil.getNaraResponse(requestUri, "response", BidNotiDetailModel.class);
                body = responseModel.getBody();
                items = body.getItems();
            }

        }
    }

    public String setParameter(NaraSearchPayload payload){

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
