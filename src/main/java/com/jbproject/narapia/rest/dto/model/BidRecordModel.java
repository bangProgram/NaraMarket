package com.jbproject.narapia.rest.dto.model;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import lombok.Data;

@Data
public class BidRecordModel {
    
    
    @Schema(title = "조달사이트 코드")
    private String marketCd;
    @Schema(title = "공고번호")
    private String bidNtceNo;
    @Schema(title = "공고차수")
    private String bidNtceOrd;
    @Schema(title = "입찰분류번호")
    private String bidClsfcNo;
    @Schema(title = "공고명 ")
    private String bidNtceNm;
    @Schema(title = "공고기관코드")
    private String ntceInsttCd;
    @Schema(title = "공고기관명")
    private String ntceInsttNm;
    @Schema(title = "수요기관코드")
    private String dminsttCd;
    @Schema(title = "수요기관명")
    private String dminsttNm;
    @Schema(title = "기초금액 ")
    private double bssamt;
    @Schema(title = "추정가격")
    private double presmptPrce;
    @Schema(title = "예비가격범위 ")
    private String rsrvtnPrceRngRate;
    @Schema(title = "조달사이트명")
    private String marketNm;
    @Schema(title = "낙찰예정금액")
    private double sucsfbidAmt;
    @Schema(title = "투찰금액")
    private double bidAmt;
    @Schema(title = "순위")
    private Integer sucsfbidRank;
    @Schema(title = "입찰금액편차")
    private double bidAmtDiff;
    @Schema(title = "낙찰하한율")
    private double sucsfbidLwltRate;
    @Schema(title = "예측사정율")
    private double bidAmtRate;
    
}
