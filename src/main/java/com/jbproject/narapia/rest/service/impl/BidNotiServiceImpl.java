package com.jbproject.narapia.rest.service.impl;

import com.jbproject.narapia.rest.common.CommonUtil;
import com.jbproject.narapia.rest.constants.ServerConstant;
import com.jbproject.narapia.rest.dto.model.ApiResponseModel;
import com.jbproject.narapia.rest.dto.model.BidNotiDetailModel;
import com.jbproject.narapia.rest.dto.model.BidNotiModel;
import com.jbproject.narapia.rest.dto.payload.BidNotiSearchPayload;
import com.jbproject.narapia.rest.dto.payload.WinbidAnalSearchPayload;
import com.jbproject.narapia.rest.dto.result.BidNotiResult;
import com.jbproject.narapia.rest.dto.result.WinBidAnalResult;
import com.jbproject.narapia.rest.repository.WinbidRepository;
import com.jbproject.narapia.rest.service.BidNotiService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
@Transactional
public class BidNotiServiceImpl implements BidNotiService {

    @Value("${naramarket.secret}")
    private String naraSecret;

    private final WinbidRepository winbidRepository;

    public BidNotiResult searchBidnoti(BidNotiSearchPayload payload) {
        try {

            String bidNotiUrl = CommonUtil.naraUrlProvide(
                    ServerConstant.NARA_BIDNOTI_PATH
                    , ServerConstant.BIDNOTI_GOODS_METHOD
                    , payload
            );

            String bidNotiDetailUrl = CommonUtil.naraUrlProvide(
                    ServerConstant.NARA_BIDNOTI_PATH
                    , ServerConstant.BIDNOTI_GOODS_DETAIL_METHOD
                    , payload
            );

            ApiResponseModel<BidNotiModel> bidNotiRes = CommonUtil.getNaraResponse(bidNotiUrl, "response", BidNotiModel.class);
            ApiResponseModel<BidNotiDetailModel> bidNotiDetailRes = CommonUtil.getNaraResponse(bidNotiDetailUrl, "response", BidNotiDetailModel.class);

            BidNotiResult result = new BidNotiResult();

            if(bidNotiRes.getBody().getItems() != null) {
                BidNotiModel bidNotiModel = bidNotiRes.getBody().getItems().getFirst();
                result.setBidNtceNo(bidNotiModel.getBidNtceNo());
                result.setBidNtceOrd(bidNotiModel.getBidNtceOrd());
                result.setBidNtceNm(bidNotiModel.getBidNtceNm());
                result.setNtceInsttCd(bidNotiModel.getNtceInsttCd());
                result.setNtceInsttNm(bidNotiModel.getNtceInsttNm());
                result.setDminsttCd(bidNotiModel.getDminsttCd());
                result.setDminsttNm(bidNotiModel.getDminsttNm());
                result.setBidMethdNm(bidNotiModel.getBidMethdNm());
                result.setPrearngPrceDcsnMthdNm(bidNotiModel.getPrearngPrceDcsnMthdNm());
                result.setPresmptPrce(CommonUtil.convertDouble(bidNotiModel.getPresmptPrce()));
                result.setSucsfbidLwltRate(bidNotiModel.getSucsfbidLwltRate());

                result.setDtilPrdctClsfcNo(bidNotiModel.getDtilPrdctClsfcNo());
                result.setDtilPrdctClsfcNoNm(bidNotiModel.getDtilPrdctClsfcNoNm());
                result.setPrdctSpecNm(bidNotiModel.getPrdctSpecNm());
                result.setPrdctQty(CommonUtil.convertDouble(bidNotiModel.getPrdctQty()));
                result.setPrdctUnit(bidNotiModel.getPrdctUnit());
                result.setPrdctUprc(CommonUtil.convertDouble(bidNotiModel.getPrdctUprc()));
            }
            if(bidNotiDetailRes.getBody().getItems() != null) {
                BidNotiDetailModel bidNotiDetailModel = bidNotiDetailRes.getBody().getItems().getFirst();

                result.setBidNtceNm(bidNotiDetailModel.getBidNtceNm());
                result.setBssamt(CommonUtil.convertDouble(bidNotiDetailModel.getBssamt()));
                result.setRsrvtnPrceRngBgnRate(bidNotiDetailModel.getRsrvtnPrceRngBgnRate());
                result.setRsrvtnPrceRngEndRate(bidNotiDetailModel.getRsrvtnPrceRngEndRate());
            }

            System.out.println("result : "+result);
            return result;
        }catch (Exception e){
            log.error("searchBidnoti Error : {} ",e.getLocalizedMessage());
            throw new RuntimeException();
        }
    }

    public List<WinBidAnalResult> searchWinbidAnalList(WinbidAnalSearchPayload payload) {
        return winbidRepository.searchWinbidAnalList(payload);
    }

}
