package com.jbproject.narapia.rest.entity;


import com.jbproject.narapia.rest.dto.model.BidNotiDetailModel;
import com.jbproject.narapia.rest.dto.model.WinbidDetailModel;
import com.jbproject.narapia.rest.entity.base.BaseEntity;
import com.jbproject.narapia.rest.entity.keys.BidNotiDetailKey;
import com.jbproject.narapia.rest.entity.keys.WinbidDetailKey;
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
@Table(name = "tb_bidnoti_detail")
public class BidNotiDetailEntity extends BaseEntity implements Persistable<BidNotiDetailKey> {

    @EmbeddedId
    private BidNotiDetailKey id;

    private String bidNtceNm;
    private double bssamt;
    private LocalDateTime bssamtOpenDt;
    private String rsrvtnPrceRngBgnRate;
    private String rsrvtnPrceRngEndRate;
    private double evlBssAmt;
    private String dfcltydgrCfcnt;
    private String etcGnrlexpnsBssRate;
    private String gnrlMngcstBssRate;
    private String prftBssRate;
    private String lbrcstBssRate;
    private String industSftyHelthMngcst;
    private String rtrfundNon;
    private String envCnsrvcst;
    private String scontrctPayprcePayGrntyFee;
    private String mrfnHealthInsrprm;
    private String npnInsrprm;
    private String rmrk1;
    private String rmrk2;
    private double usefulAmt;
    private LocalDateTime inptDt;

    @Builder
    public BidNotiDetailEntity(
            BidNotiDetailKey id, String bidNtceNm, double bssamt, LocalDateTime bssamtOpenDt
            , String rsrvtnPrceRngBgnRate, String rsrvtnPrceRngEndRate, double evlBssAmt, String dfcltydgrCfcnt, String etcGnrlexpnsBssRate
            , String gnrlMngcstBssRate, String prftBssRate, String lbrcstBssRate, String industSftyHelthMngcst, String rtrfundNon
            , String envCnsrvcst, String scontrctPayprcePayGrntyFee, String mrfnHealthInsrprm, String npnInsrprm, String rmrk1
            , String rmrk2, double usefulAmt, LocalDateTime inptDt
    ) {
        this.id = id;
        this.bidNtceNm = bidNtceNm;
        this.bssamt = bssamt;
        this.bssamtOpenDt = bssamtOpenDt;
        this.rsrvtnPrceRngBgnRate = rsrvtnPrceRngBgnRate;
        this.rsrvtnPrceRngEndRate = rsrvtnPrceRngEndRate;
        this.evlBssAmt = evlBssAmt;
        this.dfcltydgrCfcnt = dfcltydgrCfcnt;
        this.etcGnrlexpnsBssRate = etcGnrlexpnsBssRate;
        this.gnrlMngcstBssRate = gnrlMngcstBssRate;
        this.prftBssRate = prftBssRate;
        this.lbrcstBssRate = lbrcstBssRate;
        this.industSftyHelthMngcst = industSftyHelthMngcst;
        this.rtrfundNon = rtrfundNon;
        this.envCnsrvcst = envCnsrvcst;
        this.scontrctPayprcePayGrntyFee = scontrctPayprcePayGrntyFee;
        this.mrfnHealthInsrprm = mrfnHealthInsrprm;
        this.npnInsrprm = npnInsrprm;
        this.rmrk1 = rmrk1;
        this.rmrk2 = rmrk2;
        this.usefulAmt = usefulAmt;
        this.inptDt = inptDt;
    }

    public BidNotiDetailEntity(BidNotiDetailModel model) {
        this.id = BidNotiDetailKey.builder()
                .bidNtceNo(model.getBidNtceNo())
                .bidNtceOrd(model.getBidNtceOrd())
                .bidClsfcNo(model.getBidClsfcNo())
                .build();

        this.bidNtceNm = model.getBidNtceNm();
        this.bssamt = model.getBssamt();
        this.bssamtOpenDt = model.getBssamtOpenDt();
        this.rsrvtnPrceRngBgnRate = model.getRsrvtnPrceRngBgnRate();
        this.rsrvtnPrceRngEndRate = model.getRsrvtnPrceRngEndRate();
        this.evlBssAmt = model.getEvlBssAmt();
        this.dfcltydgrCfcnt = model.getDfcltydgrCfcnt();
        this.etcGnrlexpnsBssRate = model.getEtcGnrlexpnsBssRate();
        this.gnrlMngcstBssRate = model.getGnrlMngcstBssRate();
        this.prftBssRate = model.getPrftBssRate();
        this.lbrcstBssRate = model.getLbrcstBssRate();
        this.industSftyHelthMngcst = model.getIndustSftyHelthMngcst();
        this.rtrfundNon = model.getRtrfundNon();
        this.envCnsrvcst = model.getEnvCnsrvcst();
        this.scontrctPayprcePayGrntyFee = model.getScontrctPayprcePayGrntyFee();
        this.mrfnHealthInsrprm = model.getMrfnHealthInsrprm();
        this.npnInsrprm = model.getNpnInsrprm();
        this.rmrk1 = model.getRmrk1();
        this.rmrk2 = model.getRmrk2();
        this.usefulAmt = model.getUsefulAmt();
        this.inptDt = model.getInptDt();
    }

    public void update(BidNotiDetailModel model) {

        this.bidNtceNm = model.getBidNtceNm();
        this.bssamt = model.getBssamt();
        this.bssamtOpenDt = model.getBssamtOpenDt();
        this.rsrvtnPrceRngBgnRate = model.getRsrvtnPrceRngBgnRate();
        this.rsrvtnPrceRngEndRate = model.getRsrvtnPrceRngEndRate();
        this.evlBssAmt = model.getEvlBssAmt();
        this.dfcltydgrCfcnt = model.getDfcltydgrCfcnt();
        this.etcGnrlexpnsBssRate = model.getEtcGnrlexpnsBssRate();
        this.gnrlMngcstBssRate = model.getGnrlMngcstBssRate();
        this.prftBssRate = model.getPrftBssRate();
        this.lbrcstBssRate = model.getLbrcstBssRate();
        this.industSftyHelthMngcst = model.getIndustSftyHelthMngcst();
        this.rtrfundNon = model.getRtrfundNon();
        this.envCnsrvcst = model.getEnvCnsrvcst();
        this.scontrctPayprcePayGrntyFee = model.getScontrctPayprcePayGrntyFee();
        this.mrfnHealthInsrprm = model.getMrfnHealthInsrprm();
        this.npnInsrprm = model.getNpnInsrprm();
        this.rmrk1 = model.getRmrk1();
        this.rmrk2 = model.getRmrk2();
        this.usefulAmt = model.getUsefulAmt();
        this.inptDt = model.getInptDt();
    }


    @Override
    public BidNotiDetailKey getId() {
        return id;
    }

    @Override
    public boolean isNew() {
        return getCreateDttm() == null;
    }
}
