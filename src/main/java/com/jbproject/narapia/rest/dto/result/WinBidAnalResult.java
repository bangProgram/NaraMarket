package com.jbproject.narapia.rest.dto.result;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class WinBidAnalResult {

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
}
