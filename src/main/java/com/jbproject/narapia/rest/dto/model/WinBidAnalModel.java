package com.jbproject.narapia.rest.dto.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import com.jbproject.narapia.rest.entity.WinbidAnalEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class WinBidAnalModel {

    @Schema(title="공고번호")
    private String bidNtceNo;
    @Schema(title="공고차수")
    private String bidNtceOrd;
    @Schema(title="공고명")
    private String bidNtceNm;
    @Schema(title="공고기관코드")
    private String ntceInsttCd;
    @Schema(title="공고기관명")
    private String ntceInsttNm;
    @Schema(title="수요기관코드")
    private String dminsttCd;
    @Schema(title="수요기관명")
    private String dminsttNm;

    @Schema(title="입찰방식명")
    private String bidMethdNm;
    @Schema(title="예정가격결정방법명")
    private String prearngPrceDcsnMthdNm;
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Schema(title="개찰일시")
    private LocalDateTime opengDt;

    @Schema(title="기초금액")
    private double bssamt;
    @Schema(title="추정가격")
    private double presmptPrce;

    @Schema(title="세부품명번호")
    private String dtilPrdctClsfcNo;
    @Schema(title="세부품명")
    private String dtilPrdctClsfcNoNm;
    @Schema(title="물품수량")
    private double prdctQty;
    @Schema(title="물품단가")
    private double prdctUprc;

    @Schema(title="낙찰가격")
    private double sucsfbidAmt;
    @Schema(title="낙찰하한율")
    private double sucsfbidLwltRate;
    @Schema(title="예비가격범위시작률")
    private String rsrvtnPrceRngBgnRate;
    @Schema(title="예비가격범위종료율")
    private String rsrvtnPrceRngEndRate;

    @Schema(title="물품가액", description = "물품가액 = 물품수량 * 물품단가")
    private double prdctAmt;
    @Schema(title="예측사정율", description = "예측사정율 = 낙찰금액  / 기초금액 / 낙찰하한율 ")
    private double rsrvtnRate;

    public static WinBidAnalModel create(WinbidAnalEntity entity) {
        WinBidAnalModel result = new WinBidAnalModel();

        result.setBidNtceNo(entity.getId().getBidNtceNo());
        result.setBidNtceOrd(entity.getId().getBidNtceOrd());

        result.setBidNtceNm(entity.getBidNtceNm());
        result.setNtceInsttCd(entity.getNtceInsttCd());
        result.setNtceInsttNm(entity.getNtceInsttNm());
        result.setDminsttCd(entity.getDminsttCd());
        result.setDminsttNm(entity.getDminsttNm());
        result.setBidMethdNm(entity.getBidMethdNm());
        result.setPrearngPrceDcsnMthdNm(entity.getPrearngPrceDcsnMthdNm());
        result.setOpengDt(entity.getOpengDt());

        result.setBssamt(entity.getBssamt());
        result.setPresmptPrce(entity.getPresmptPrce());

        result.setDtilPrdctClsfcNo(entity.getDtilPrdctClsfcNo());
        result.setDtilPrdctClsfcNoNm(entity.getDtilPrdctClsfcNoNm());
        result.setPrdctQty(entity.getPrdctQty());
        result.setPrdctUprc(entity.getPrdctUprc());

        result.setSucsfbidAmt(entity.getSucsfbidAmt());
        result.setSucsfbidLwltRate(entity.getSucsfbidLwltRate());
        result.setRsrvtnPrceRngBgnRate(entity.getRsrvtnPrceRngBgnRate());
        result.setRsrvtnPrceRngEndRate(entity.getRsrvtnPrceRngEndRate());

        result.setPrdctAmt(entity.getPrdctAmt());
        result.setRsrvtnRate(entity.getRsrvtnRate());

        return result;
    }
}
