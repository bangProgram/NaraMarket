package com.jbproject.narapia.rest.dto.result;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import com.jbproject.narapia.rest.common.CommonUtil;
import com.jbproject.narapia.rest.entity.WinbidAnalEntity;
import com.jbproject.narapia.rest.entity.keys.WinbidAnalKey;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class WinBidAnalResult {

    @Schema(title="공고번호")
    private String bidNtceNo;
    @Schema(title="공고차수")
    private String bidNtceOrd;
    @Schema(title = "입찰분류번호")
    private String bidClsfcNo;


    @Schema(title = "공고명")
    private String bidNtceNm;
    @Schema(title = "공고기관코드")
    private String ntceInsttCd;
    @Schema(title = "공고기관명")
    private String ntceInsttNm;
    @Schema(title = "수요기관코드")
    private String dminsttCd;
    @Schema(title = "수요기관명")
    private String dminsttNm;
    @Schema(title = "입찰방식명")
    private String bidMethdNm;
    @Schema(title = "예정가격결정방법명")
    private String prearngPrceDcsnMthdNm;
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Schema(title = "개찰일시")
    private LocalDateTime opengDt;
    @Schema(title = "세부품명번호")
    private String dtilPrdctClsfcNo;
    @Schema(title = "세부품명")
    private String dtilPrdctClsfcNoNm;
    @Schema(title = "물품수량")
    private double prdctQty;
    @Schema(title = "물품단가")
    private double prdctUprc;
    @Schema(title = "물품총액")
    private double prdctAmt;
    @Schema(title = "기초금액")
    private String bssamt;
    @Schema(title = "추정가격")
    private String presmptPrce;
    @Schema(title = "추정가격을 통한 기초금액 추정금액")
    private String presmptBssamt;
    @Schema(title = "낙찰가격")
    private String sucsfbidAmt;
    @Schema(title = "낙찰하한율")
    private double sucsfbidLwltRate;
    @Schema(title = "예비가격범위시작률")
    private String rsrvtnPrceRngBgnRate;
    @Schema(title = "예비가격범위종료율")
    private String rsrvtnPrceRngEndRate;
    @Schema(title = "물품가액 ( 결과 객체에 추가할 것 : 물품가액 = 물품수량 * 물품단가 )")
    private double bssamtRate;
    @Schema(title = "예측사정율 ( 결과 객체에 추가할 것 : 예측사정율 = 낙찰금액  / 기초금액 / 낙찰하한율 )")
    private double presmptRate;

    public static WinBidAnalResult create(WinbidAnalEntity entity) {
        WinBidAnalResult result = new WinBidAnalResult();

        result.setBidNtceNo(entity.getId().getBidNtceNo());
        result.setBidNtceOrd(entity.getId().getBidNtceOrd());
        result.setBidClsfcNo(entity.getId().getBidClsfcNo());

        result.setBidNtceNm(entity.getBidNtceNm());
        result.setNtceInsttCd(entity.getNtceInsttCd());
        result.setNtceInsttNm(entity.getNtceInsttNm());
        result.setDminsttCd(entity.getDminsttCd());
        result.setDminsttNm(entity.getDminsttNm());
        result.setBidMethdNm(entity.getBidMethdNm());
        result.setPrearngPrceDcsnMthdNm(entity.getPrearngPrceDcsnMthdNm());
        result.setOpengDt(entity.getOpengDt());
        result.setDtilPrdctClsfcNo(entity.getDtilPrdctClsfcNo());
        result.setDtilPrdctClsfcNoNm(entity.getDtilPrdctClsfcNoNm());
        result.setPrdctQty(entity.getPrdctQty());
        result.setPrdctUprc(entity.getPrdctUprc());
        result.setPrdctAmt(entity.getPrdctAmt());
        result.setBssamt(CommonUtil.convertDouble(entity.getBssamt()));
        result.setPresmptPrce(CommonUtil.convertDouble(entity.getPresmptPrce()));
        result.setPresmptBssamt(CommonUtil.convertDouble(entity.getPresmptBssamt()));
        result.setSucsfbidAmt(CommonUtil.convertDouble(entity.getSucsfbidAmt()));
        result.setSucsfbidLwltRate(entity.getSucsfbidLwltRate());
        result.setRsrvtnPrceRngBgnRate(entity.getRsrvtnPrceRngBgnRate());
        result.setRsrvtnPrceRngEndRate(entity.getRsrvtnPrceRngEndRate());
        result.setBssamtRate(entity.getBssamtRate());
        result.setPresmptRate(entity.getPresmptRate());

        return result;
    }
}
