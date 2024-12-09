package com.jbproject.narapia.rest.entity;

import com.jbproject.narapia.rest.dto.model.BidRecordModel;
import com.jbproject.narapia.rest.dto.model.WinbidModel;
import com.jbproject.narapia.rest.entity.base.BaseEntity;
import com.jbproject.narapia.rest.entity.keys.BidRecordKey;
import com.jbproject.narapia.rest.entity.keys.WinbidKey;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
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
public class BidRecordEntity extends BaseEntity implements Persistable<BidRecordKey> {

    @EmbeddedId
    private BidRecordKey id;

    private String bidNtceNm;
    private String ntceInsttCd;
    private String ntceInsttNm;
    private String dminsttCd;
    private String dminsttNm;
    private Double bssamt;
    private Double presmptPrce;
    private String rsrvtnPrceRngRate;

    private String marketNm;
    private Double sucsfbidAmt;
    private Double bidAmt;
    private Integer sucsfbidRank;
    private Double bidAmtDiff;
    private Double sucsfbidLwltRate;
    private Double bidAmtRate;


    @Builder
    public BidRecordEntity(
            BidRecordKey id
            , String bidNtceNm, String ntceInsttCd, String ntceInsttNm, String dminsttCd, String dminsttNm
            , double bssamt, double presmptPrce, String rsrvtnPrceRngRate
            , String marketNm, double sucsfbidAmt, double bidAmt, Integer sucsfbidRank, double bidAmtDiff
            , double sucsfbidLwltRate, double bidAmtRate
    ) {
        this.id = id;
        this.bidNtceNm = bidNtceNm;
        this.ntceInsttCd = ntceInsttCd;
        this.ntceInsttNm = ntceInsttNm;
        this.dminsttCd = dminsttCd;
        this.dminsttNm = dminsttNm;
        this.bssamt = bssamt;
        this.presmptPrce = presmptPrce;
        this.rsrvtnPrceRngRate = rsrvtnPrceRngRate;
        this.marketNm = marketNm;
        this.sucsfbidAmt = sucsfbidAmt;
        this.bidAmt = bidAmt;
        this.sucsfbidRank = sucsfbidRank;
        this.bidAmtDiff = bidAmtDiff;
        this.sucsfbidLwltRate = sucsfbidLwltRate;
        this.bidAmtRate = bidAmtRate;
    }

    public BidRecordEntity(BidRecordModel model) {
        this.id = BidRecordKey.builder()
                .marketCd(model.getMarketCd())
                .bidNtceNo(model.getBidNtceNo())
                .bidNtceOrd(model.getBidNtceOrd())
                .bidClsfcNo(model.getBidClsfcNo())
                .build();

        this.bidNtceNm = model.getBidNtceNm();
        this.ntceInsttCd = model.getNtceInsttCd();
        this.ntceInsttNm = model.getNtceInsttNm();
        this.dminsttCd = model.getDminsttCd();
        this.dminsttNm = model.getDminsttNm();
        this.bssamt = model.getBssamt();
        this.presmptPrce = model.getPresmptPrce();
        this.rsrvtnPrceRngRate = model.getRsrvtnPrceRngRate();
        this.marketNm = model.getMarketNm();
        this.sucsfbidAmt = model.getSucsfbidAmt();
        this.bidAmt = model.getBidAmt();
        this.sucsfbidRank = model.getSucsfbidRank();
        this.bidAmtDiff = model.getBidAmtDiff();
        this.sucsfbidLwltRate = model.getSucsfbidLwltRate();
        this.bidAmtRate = model.getBidAmtRate();
    }

    public void update(BidRecordModel model) {

        this.bidNtceNm = model.getBidNtceNm();
        this.ntceInsttCd = model.getNtceInsttCd();
        this.ntceInsttNm = model.getNtceInsttNm();
        this.dminsttCd = model.getDminsttCd();
        this.dminsttNm = model.getDminsttNm();
        this.bssamt = model.getBssamt();
        this.presmptPrce = model.getPresmptPrce();
        this.rsrvtnPrceRngRate = model.getRsrvtnPrceRngRate();
        this.marketNm = model.getMarketNm();
        this.sucsfbidAmt = model.getSucsfbidAmt();
        this.bidAmt = model.getBidAmt();
        this.sucsfbidRank = model.getSucsfbidRank();
        this.bidAmtDiff = model.getBidAmtDiff();
        this.sucsfbidLwltRate = model.getSucsfbidLwltRate();
        this.bidAmtRate = model.getBidAmtRate();

    }


    @Override
    public BidRecordKey getId() {
        return id;
    }

    @Override
    public boolean isNew() {
        return getCreateDttm() == null;
    }
}
