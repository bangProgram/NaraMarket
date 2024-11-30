package com.jbproject.narapia.rest.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jbproject.narapia.rest.dto.model.WinbidDetailModel;
import com.jbproject.narapia.rest.dto.model.WinbidModel;
import com.jbproject.narapia.rest.entity.base.BaseEntity;
import com.jbproject.narapia.rest.entity.keys.WinbidDetailKey;
import com.jbproject.narapia.rest.entity.keys.WinbidKey;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.domain.Persistable;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "tb_winbid_detail")
public class WinbidDetailEntity extends BaseEntity implements Persistable<WinbidDetailKey> {

    @EmbeddedId
    private WinbidDetailKey id;

    private String rbidNo;
    private String bidNtceNm;
    private double plnprc;
    private double bssamt;
    private long totRsrvtnPrceNum;
    private double bsisPlnprc;
    private String drwtYn;
    private int drwtNum;
    private String bidwinrSlctnAplBssCntnts;
    private LocalDateTime rlOpengDt;
    private int bssamtBssUpNum;
    private LocalDateTime compnoRsrvtnPrceMkngDt;
    private LocalDateTime inptDt;
    private long prearngPrcePurcnstcst;

    @Builder
    public WinbidDetailEntity(
            WinbidDetailKey id, String rbidNo, String bidNtceNm, double plnprc
            , double bssamt, long totRsrvtnPrceNum, double bsisPlnprc, String drwtYn
            , int drwtNum, String bidwinrSlctnAplBssCntnts, LocalDateTime rlOpengDt, int bssamtBssUpNum
            , LocalDateTime compnoRsrvtnPrceMkngDt, LocalDateTime inptDt, long prearngPrcePurcnstcst
    ) {
        this.id = id;
        this.rbidNo = rbidNo;
        this.bidNtceNm = bidNtceNm;
        this.plnprc = plnprc;
        this.bssamt = bssamt;
        this.totRsrvtnPrceNum = totRsrvtnPrceNum;
        this.bsisPlnprc = bsisPlnprc;
        this.drwtYn = drwtYn;
        this.drwtNum = drwtNum;
        this.bidwinrSlctnAplBssCntnts = bidwinrSlctnAplBssCntnts;
        this.rlOpengDt = rlOpengDt;
        this.bssamtBssUpNum = bssamtBssUpNum;
        this.compnoRsrvtnPrceMkngDt = compnoRsrvtnPrceMkngDt;
        this.inptDt = inptDt;
        this.prearngPrcePurcnstcst = prearngPrcePurcnstcst;
    }

    public WinbidDetailEntity(WinbidDetailModel model) {
        this.id = WinbidDetailKey.builder()
                .bidClsfcNo(model.getBidClsfcNo())
                .bidNtceNo(model.getBidNtceNo())
                .bidNtceOrd(model.getBidNtceOrd())
                .compnoRsrvtnPrceSno(model.getCompnoRsrvtnPrceSno())
                .build();

        this.rbidNo = model.getRbidNo();
        this.bidNtceNm = model.getBidNtceNm();
        this.plnprc = model.getPlnprc();
        this.bssamt = model.getBssamt();
        this.totRsrvtnPrceNum = model.getTotRsrvtnPrceNum();
        this.bsisPlnprc = model.getBsisPlnprc();
        this.drwtYn = model.getDrwtYn();
        this.drwtNum = model.getDrwtNum();
        this.bidwinrSlctnAplBssCntnts = model.getBidwinrSlctnAplBssCntnts();
        this.rlOpengDt = model.getRlOpengDt();
        this.bssamtBssUpNum = model.getBssamtBssUpNum();
        this.compnoRsrvtnPrceMkngDt = model.getCompnoRsrvtnPrceMkngDt();
        this.inptDt = model.getInptDt();
        this.prearngPrcePurcnstcst = model.getPrearngPrcePurcnstcst();
    }

    public void update(WinbidDetailModel model) {
        this.rbidNo = model.getRbidNo();
        this.bidNtceNm = model.getBidNtceNm();
        this.plnprc = model.getPlnprc();
        this.bssamt = model.getBssamt();
        this.totRsrvtnPrceNum = model.getTotRsrvtnPrceNum();
        this.bsisPlnprc = model.getBsisPlnprc();
        this.drwtYn = model.getDrwtYn();
        this.drwtNum = model.getDrwtNum();
        this.bidwinrSlctnAplBssCntnts = model.getBidwinrSlctnAplBssCntnts();
        this.rlOpengDt = model.getRlOpengDt();
        this.bssamtBssUpNum = model.getBssamtBssUpNum();
        this.compnoRsrvtnPrceMkngDt = model.getCompnoRsrvtnPrceMkngDt();
        this.inptDt = model.getInptDt();
        this.prearngPrcePurcnstcst = model.getPrearngPrcePurcnstcst();
    }


    @Override
    public WinbidDetailKey getId() {
        return id;
    }

    @Override
    public boolean isNew() {
        return getCreateDttm() == null;
    }
}
