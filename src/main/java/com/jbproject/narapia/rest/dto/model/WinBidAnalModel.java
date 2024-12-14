package com.jbproject.narapia.rest.dto.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import com.jbproject.narapia.rest.entity.WinbidAnalEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import java.time.LocalDate;
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
    private Double prdctQty;
    @Schema(title = "물품단가")
    private Double prdctUprc;
    @Schema(title = "물품총액")
    private Double prdctAmt;
    @Schema(title = "기초금액")
    private Double bssamt;
    @Schema(title = "추정가격")
    private Double presmptPrce;
    @Schema(title = "추정가격을 통한 기초금액 추정금액")
    private Double presmptBssamt;
    @Schema(title = "낙찰가격")
    private Double sucsfbidAmt;
    @Schema(title = "낙찰하한율")
    private Double sucsfbidLwltRate;
    @Schema(title = "예비가격범위시작률")
    private String rsrvtnPrceRngBgnRate;
    @Schema(title = "예비가격범위종료율")
    private String rsrvtnPrceRngEndRate;
    @Schema(title = "물품가액 ( 결과 객체에 추가할 것 : 물품가액 = 물품수량 * 물품단가 )")
    private Double bssamtRate;
    @Schema(title = "예측사정율 ( 결과 객체에 추가할 것 : 예측사정율 = 낙찰금액  / 기초금액 / 낙찰하한율 )")
    private Double presmptRate;

    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Schema(title = "최종 낙찰일")
    private LocalDate fnlSucsfDate;
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Schema(title = "개찰 일자")
    private LocalDateTime rlOpengDt;
    @Schema(title = "참가업체수")
    private Integer prtcptCnum;
    @Schema(title = "예정가격")
    private Double plnprc;
    @Schema(title = "예정가격/예측사정율")
    private Double plnprcRate;

    public static WinBidAnalModel create(WinbidAnalEntity entity) {
        WinBidAnalModel result = new WinBidAnalModel();

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
        result.setBssamt(entity.getBssamt());
        result.setPresmptPrce(entity.getPresmptPrce());
        result.setPresmptBssamt(entity.getPresmptBssamt());
        result.setSucsfbidAmt(entity.getSucsfbidAmt());
        result.setSucsfbidLwltRate(entity.getSucsfbidLwltRate());
        result.setRsrvtnPrceRngBgnRate(entity.getRsrvtnPrceRngBgnRate());
        result.setRsrvtnPrceRngEndRate(entity.getRsrvtnPrceRngEndRate());
        result.setBssamtRate(entity.getBssamtRate());
        result.setPresmptRate(entity.getPresmptRate());

        result.setFnlSucsfDate(entity.getFnlSucsfDate());
        result.setRlOpengDt(entity.getRlOpengDt());
        result.setPrtcptCnum(entity.getPrtcptCnum());
        result.setPlnprc(entity.getPlnprc());
        result.setPlnprcRate(entity.getPlnprcRate());

        return result;
    }
}
