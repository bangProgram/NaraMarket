package com.jbproject.narapia.rest.dto.payload;

import com.jbproject.narapia.rest.dto.model.BidRecordModel;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class BidRecordCudPayload {

    @Schema(title = "투찰기록 ID")
    private Long id;
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
    private Double sucsfbidAmt;
    @Schema(title = "투찰금액")
    private Double bidAmt;
    @Schema(title = "순위")
    private String sucsfbidRank;
    @Schema(title = "입찰금액편차")
    private Double bidAmtDiff;
    @Schema(title = "낙찰하한율")
    private Double sucsfbidLwltRate;
    @Schema(title = "투찰예측사정율")
    private Double bidAmtRate;
    @Schema(title = "예측사정율")
    private Double sucsfbidAmtRate;


    public BidRecordCudPayload(BidRecordModel model) {

        this.id = model.getId();
        this.marketCd = model.getMarketCd();
        this.bidNtceNo = model.getBidNtceNo();
        this.bidNtceOrd = model.getBidNtceOrd();
        this.bidClsfcNo = model.getBidClsfcNo();
        this.bidNtceNm = model.getBidNtceNm();
        this.ntceInsttCd = model.getNtceInsttCd();
        this.ntceInsttNm = model.getNtceInsttNm();
        this.dminsttCd = model.getDminsttCd();
        this.dminsttNm = model.getDminsttNm();
        this.bssamt = model.getBssamt();
        this.presmptPrce = model.getPresmptPrce();
        this.rsrvtnPrceRngRate = model.getRsrvtnPrceRngRate();
        this.marketNm = model.getMarketNm();
        this.expectAmt = model.getExpectAmt();
        this.sucsfbidAmt = model.getSucsfbidAmt();
        this.bidAmt = model.getBidAmt();
        this.sucsfbidRank = model.getSucsfbidRank();
        this.bidAmtDiff = model.getBidAmtDiff();
        this.sucsfbidLwltRate = model.getSucsfbidLwltRate();
        this.bidAmtRate = model.getBidAmtRate();
        this.sucsfbidAmtRate = model.getSucsfbidAmtRate();
    }
}
