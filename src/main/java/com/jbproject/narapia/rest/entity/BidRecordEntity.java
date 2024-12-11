package com.jbproject.narapia.rest.entity;

import com.jbproject.narapia.rest.dto.model.BidRecordModel;
import com.jbproject.narapia.rest.dto.model.WinbidModel;
import com.jbproject.narapia.rest.dto.payload.BidRecordCudPayload;
import com.jbproject.narapia.rest.entity.base.BaseEntity;
import com.jbproject.narapia.rest.entity.keys.WinbidKey;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.domain.Persistable;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "tb_bid_record")
public class BidRecordEntity extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "market_cd", columnDefinition = "varchar(20)")
    private String marketCd;
    @Column(name = "bid_ntce_no", columnDefinition = "varchar(20)")
    private String bidNtceNo;
    @Column(name = "bid_ntce_ord", columnDefinition = "varchar(10)")
    private String bidNtceOrd;
    @Column(name = "bid_clsfc_no", columnDefinition = "varchar(10)")
    private String bidClsfcNo;
    private String bidNtceNm;
    private String ntceInsttCd;
    private String ntceInsttNm;
    private String dminsttCd;
    private String dminsttNm;
    private Double bssamt;
    private Double presmptPrce;
    private String rsrvtnPrceRngRate;
    private String marketNm;
    private Double expectAmt;
    private Double sucsfbidAmt;
    private Double bidAmt;
    private String sucsfbidRank;
    private Double bidAmtDiff;
    private Double sucsfbidLwltRate;
    private Double bidAmtRate;
    private Double sucsfbidAmtRate;


    @Builder
    public BidRecordEntity(
            String marketCd, String bidNtceNo, String bidNtceOrd, String bidClsfcNo
            , String bidNtceNm, String ntceInsttCd, String ntceInsttNm, String dminsttCd, String dminsttNm
            , Double bssamt, Double presmptPrce, String rsrvtnPrceRngRate
            , String marketNm, Double expectAmt, Double sucsfbidAmt, Double bidAmt, String sucsfbidRank, Double bidAmtDiff
            , Double sucsfbidLwltRate, Double bidAmtRate, Double sucsfbidAmtRate
    ) {
        this.marketCd = marketCd;
        this.bidNtceNo = bidNtceNo;
        this.bidNtceOrd = bidNtceOrd;
        this.bidClsfcNo = bidClsfcNo;
        this.bidNtceNm = bidNtceNm;
        this.ntceInsttCd = ntceInsttCd;
        this.ntceInsttNm = ntceInsttNm;
        this.dminsttCd = dminsttCd;
        this.dminsttNm = dminsttNm;
        this.bssamt = bssamt;
        this.presmptPrce = presmptPrce;
        this.rsrvtnPrceRngRate = rsrvtnPrceRngRate;
        this.marketNm = marketNm;
        this.expectAmt = expectAmt;
        this.sucsfbidAmt = sucsfbidAmt;
        this.bidAmt = bidAmt;
        this.sucsfbidRank = sucsfbidRank;
        this.bidAmtDiff = bidAmtDiff;
        this.sucsfbidLwltRate = sucsfbidLwltRate;
        this.bidAmtRate = bidAmtRate;
        this.sucsfbidAmtRate = sucsfbidAmtRate;
    }

    public BidRecordEntity(BidRecordModel model) {

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

    public void update(BidRecordCudPayload payload) {

        this.marketCd = payload.getMarketCd();
        this.bidNtceNo = payload.getBidNtceNo();
        this.bidNtceOrd = payload.getBidNtceOrd();
        this.bidClsfcNo = payload.getBidClsfcNo();
        this.bidNtceNm = payload.getBidNtceNm();
        this.ntceInsttCd = payload.getNtceInsttCd();
        this.ntceInsttNm = payload.getNtceInsttNm();
        this.dminsttCd = payload.getDminsttCd();
        this.dminsttNm = payload.getDminsttNm();
        this.bssamt = payload.getBssamt();
        this.presmptPrce = payload.getPresmptPrce();
        this.rsrvtnPrceRngRate = payload.getRsrvtnPrceRngRate();
        this.marketNm = payload.getMarketNm();
        this.expectAmt = payload.getExpectAmt();
        this.sucsfbidAmt = payload.getSucsfbidAmt();
        this.bidAmt = payload.getBidAmt();
        this.sucsfbidRank = payload.getSucsfbidRank();
        this.bidAmtDiff = payload.getBidAmtDiff();
        this.sucsfbidLwltRate = payload.getSucsfbidLwltRate();
        this.bidAmtRate = payload.getBidAmtRate();
        this.sucsfbidAmtRate = payload.getSucsfbidAmtRate();
    }
}
