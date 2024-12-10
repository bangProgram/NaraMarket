package com.jbproject.narapia.rest.dto.model;

import com.jbproject.narapia.rest.dto.payload.BidRecordCudPayload;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BidRecordModel {

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
    private Integer sucsfbidRank;
    @Schema(title = "입찰금액편차")
    private Double bidAmtDiff;
    @Schema(title = "낙찰하한율")
    private Double sucsfbidLwltRate;
    @Schema(title = "예측사정율")
    private Double bidAmtRate;

}
