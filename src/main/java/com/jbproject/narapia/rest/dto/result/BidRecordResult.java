package com.jbproject.narapia.rest.dto.result;

import com.jbproject.narapia.rest.common.CommonUtil;
import com.jbproject.narapia.rest.dto.model.BidRecordModel;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class BidRecordResult {

    private Long id;
    private String marketCd;
    private String bidNtceNo;
    private String bidNtceOrd;
    private String bidClsfcNo;
    private String bidNtceNm;
    private String ntceInsttCd;
    private String ntceInsttNm;
    private String dminsttCd;
    private String dminsttNm;
    private String bssamt;
    private String presmptPrce;
    private String rsrvtnPrceRngRate;
    private String marketNm;
    private String expectAmt;
    private String sucsfbidAmt;
    private String bidAmt;
    private String sucsfbidRank;
    private String bidAmtDiff;
    private Double sucsfbidLwltRate;
    private Double bidAmtRate;
    private Double sucsfbidAmtRate;

    public static BidRecordResult create(BidRecordModel model){
        BidRecordResult result = new BidRecordResult();
        result.setId(model.getId());
        result.setMarketCd(model.getMarketCd());
        result.setBidNtceNo(model.getBidNtceNo());
        result.setBidNtceOrd(model.getBidNtceOrd());
        result.setBidClsfcNo(model.getBidClsfcNo());
        result.setBidNtceNm(model.getBidNtceNm());
        result.setNtceInsttCd(model.getNtceInsttCd());
        result.setNtceInsttNm(model.getNtceInsttNm());
        result.setDminsttCd(model.getDminsttCd());
        result.setDminsttNm(model.getDminsttNm());
        result.setBssamt(CommonUtil.convertDouble(model.getBssamt()));
        result.setPresmptPrce(CommonUtil.convertDouble(model.getPresmptPrce()));
        result.setRsrvtnPrceRngRate(model.getRsrvtnPrceRngRate());
        result.setMarketNm(model.getMarketNm());
        result.setExpectAmt(CommonUtil.convertDouble(model.getExpectAmt()));
        result.setSucsfbidAmt(CommonUtil.convertDouble(model.getSucsfbidAmt()));
        result.setBidAmt(CommonUtil.convertDouble(model.getBidAmt()));
        result.setSucsfbidRank(model.getSucsfbidRank());
        result.setBidAmtDiff(CommonUtil.convertDouble(model.getBidAmtDiff()));
        result.setSucsfbidLwltRate(model.getSucsfbidLwltRate());
        result.setBidAmtRate(model.getBidAmtRate());
        result.setSucsfbidAmtRate(model.getSucsfbidAmtRate());

        return result;
    }
}
