package com.jbproject.narapia.rest.entity;

import com.jbproject.narapia.rest.dto.model.WinbidDetailModel;
import com.jbproject.narapia.rest.entity.base.BaseEntity;
import com.jbproject.narapia.rest.entity.keys.WinbidAnalKey;
import com.jbproject.narapia.rest.entity.keys.WinbidDetailKey;
import io.swagger.v3.oas.annotations.media.Schema;
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
@Table(name = "tb_winbid_anal_real")
public class WinbidAnalEntity extends BaseEntity implements Persistable<WinbidAnalKey> {

    @EmbeddedId
    private WinbidAnalKey id;

    private String bidNtceNm;
    private String ntceInsttCd;
    private String ntceInsttNm;
    private String dminsttCd;
    private String dminsttNm;
    private String bidMethdNm;
    private String prearngPrceDcsnMthdNm;
    private LocalDateTime opengDt;
    private String dtilPrdctClsfcNo;
    private String dtilPrdctClsfcNoNm;
    private double prdctQty;
    private double prdctUprc;
    private double prdctAmt;
    private double bssamt;
    private double presmptPrce;
    private double presmptBssamt;
    private double sucsfbidAmt;
    private double sucsfbidLwltRate;
    private String rsrvtnPrceRngBgnRate;
    private String rsrvtnPrceRngEndRate;
    private double bssamtRate;
    private double presmptRate;

    private LocalDate fnlSucsfDate;
    private LocalDateTime rlOpengDt;
    private Integer prtcptCnum;
    private Double plnprc;
    private Double plnprcRate;


    @Builder
    public WinbidAnalEntity(
            WinbidAnalKey id, String bidNtceNm, String ntceInsttCd, String ntceInsttNm, String dminsttCd,
            String dminsttNm, String bidMethdNm, String prearngPrceDcsnMthdNm, LocalDateTime opengDt, String dtilPrdctClsfcNo,
            String dtilPrdctClsfcNoNm, double prdctQty, double prdctUprc, double prdctAmt, double bssamt,
            double presmptPrce, double presmptBssamt, double sucsfbidAmt, double sucsfbidLwltRate, String rsrvtnPrceRngBgnRate,
            String rsrvtnPrceRngEndRate, double bssamtRate, double presmptRate,
            LocalDate fnlSucsfDate, LocalDateTime rlOpengDt, Integer prtcptCnum, Double plnprc, Double plnprcRate
    ) {
        this.id = id;

        this.bidNtceNm = bidNtceNm;
        this.ntceInsttCd = ntceInsttCd;
        this.ntceInsttNm = ntceInsttNm;
        this.dminsttCd = dminsttCd;
        this.dminsttNm = dminsttNm;
        this.bidMethdNm = bidMethdNm;
        this.prearngPrceDcsnMthdNm = prearngPrceDcsnMthdNm;
        this.opengDt = opengDt;
        this.dtilPrdctClsfcNo = dtilPrdctClsfcNo;
        this.dtilPrdctClsfcNoNm = dtilPrdctClsfcNoNm;
        this.prdctQty = prdctQty;
        this.prdctUprc = prdctUprc;
        this.prdctAmt = prdctAmt;
        this.bssamt = bssamt;
        this.presmptPrce = presmptPrce;
        this.presmptBssamt = presmptBssamt;
        this.sucsfbidAmt = sucsfbidAmt;
        this.sucsfbidLwltRate = sucsfbidLwltRate;
        this.rsrvtnPrceRngBgnRate = rsrvtnPrceRngBgnRate;
        this.rsrvtnPrceRngEndRate = rsrvtnPrceRngEndRate;
        this.bssamtRate = bssamtRate;
        this.presmptRate = presmptRate;

        this.fnlSucsfDate = fnlSucsfDate;
        this.rlOpengDt = rlOpengDt;
        this.prtcptCnum = prtcptCnum;
        this.plnprc = plnprc;
        this.plnprcRate = plnprcRate;
    }

    @Override
    public WinbidAnalKey getId() {
        return id;
    }

    @Override
    public boolean isNew() {
        return getCreateDttm() == null;
    }

}
