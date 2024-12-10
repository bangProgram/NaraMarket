package com.jbproject.narapia.rest.dto.payload;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class BidRecordCudPayload {

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
    private Double bssamt;
    @Schema(title = "추정가격")
    private Double presmptPrce;
    @Schema(title = "예비가격범위 ")
    private String rsrvtnPrceRngRate;
    @Schema(title = "조달사이트명")
    private String marketNm;
    @Schema(title = "예정금액")
    private Double expectAmt;
    @Schema(title = "낙찰예정금액")
    private String sucsfbidAmt;
    @Schema(title = "투찰금액")
    private Double bidAmt;
    @Schema(title = "순위")
    private String sucsfbidRank;
    @Schema(title = "입찰금액편차")
    private Double bidAmtDiff;
    @Schema(title = "낙찰하한율")
    private Double sucsfbidLwltRate;
    @Schema(title = "예측사정율")
    private Double bidAmtRate;

/*
    public void setBssamt(String value) {
        if(!value.isEmpty()) {
            this.bssamt = Double.valueOf(value.replace(",",""));
        }else{
            this.bssamt = 0D;
        }
    }
    public void setPresmptPrce(String value) {
        if(!value.isEmpty()) {
            this.presmptPrce = Double.valueOf(value.replace(",",""));
        }else{
            this.presmptPrce = 0D;
        }
    }
    public void setSucsfbidAmt(String value) {
        System.out.println("test setSucsfbidAmt : "+value);
        if(!value.isEmpty()) {
            this.sucsfbidAmt = Double.valueOf(value.replace(",",""));
        }else{
            this.sucsfbidAmt = 0D;
        }
        System.out.println("test setSucsfbidAmt : "+this.sucsfbidAmt);
    }
    public void setBidAmt(String value) {
        if(!value.isEmpty()) {
            this.bidAmt = Double.valueOf(value.replace(",",""));
        }else{
            this.bidAmt = 0D;
        }
    }
    public void setBidAmtDiff(String value) {
        if(!value.isEmpty()) {
            this.bidAmtDiff = Double.valueOf(value.replace(",",""));
        }else{
            this.bidAmtDiff = 0D;
        }
    }
    public void setSucsfbidLwltRate(String value) {
        if(!value.isEmpty()) {
            this.sucsfbidLwltRate = Double.valueOf(value.replace(",",""));
        }else{
            this.sucsfbidLwltRate = 0D;
        }
    }
    public void setBidAmtRate(String value) {
        if(!value.isEmpty()) {
            this.bidAmtRate = Double.valueOf(value.replace(",",""));
        }else{
            this.bidAmtRate = 0D;
        }
    }

    */
}
