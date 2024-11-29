package com.jbproject.narapia.rest.entity;

import com.jbproject.narapia.rest.dto.model.WinbidModel;
import com.jbproject.narapia.rest.entity.base.BaseEntity;
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

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "tb_winbid")
public class WinbidEntity extends BaseEntity implements Persistable<WinbidKey> {

    @EmbeddedId
    private WinbidKey id;

    private String rbidNo;
    private String ntceDivCd;
    private String bidNtceNm;
    private String prtcptCnum;
    private String bidwinnrNm;
    private String bidwinnrBizno;
    private String bidwinnrCeoNm;
    private String bidwinnrAdrs;
    private String bidwinnrTelNo;
    private String sucsfbidAmt;
    private String sucsfbidRate;
    private String rlOpengDt;
    private String dminsttCd;
    private String dminsttNm;
    private String rgstDt;
    private String fnlSucsfDate;
    private String fnlSucsfCorpOfcl;
    private String linkInsttNm;


    @Builder
    public WinbidEntity(
            WinbidKey id, String rbidNo, String ntceDivCd, String bidNtceNm
            , String prtcptCnum, String bidwinnrNm, String bidwinnrBizno, String bidwinnrCeoNm
            , String bidwinnrAdrs, String bidwinnrTelNo, String sucsfbidAmt, String sucsfbidRate
            , String rlOpengDt, String dminsttCd, String dminsttNm, String rgstDt
            , String fnlSucsfDate, String fnlSucsfCorpOfcl, String linkInsttNm
    ) {
        this.id = id;
        this.rbidNo = rbidNo;
        this.ntceDivCd = ntceDivCd;
        this.bidNtceNm = bidNtceNm;
        this.prtcptCnum = prtcptCnum;
        this.bidwinnrNm = bidwinnrNm;
        this.bidwinnrBizno = bidwinnrBizno;
        this.bidwinnrCeoNm = bidwinnrCeoNm;
        this.bidwinnrAdrs = bidwinnrAdrs;
        this.bidwinnrTelNo = bidwinnrTelNo;
        this.sucsfbidAmt = sucsfbidAmt;
        this.sucsfbidRate = sucsfbidRate;
        this.rlOpengDt = rlOpengDt;
        this.dminsttCd = dminsttCd;
        this.dminsttNm = dminsttNm;
        this.rgstDt = rgstDt;
        this.fnlSucsfDate = fnlSucsfDate;
        this.fnlSucsfCorpOfcl = fnlSucsfCorpOfcl;
        this.linkInsttNm = linkInsttNm;
    }

    public WinbidEntity(WinbidModel model) {
        this.id = WinbidKey.builder()
                .bidNtceOrd(model.getBidNtceOrd())
                .bidNtceNo(model.getBidNtceNo())
                .bidClsfcNo(model.getBidClsfcNo())
                .build();

        this.rbidNo = model.getRbidNo();
        this.ntceDivCd = model.getNtceDivCd();
        this.bidNtceNm = model.getBidNtceNm();
        this.prtcptCnum = model.getPrtcptCnum();
        this.bidwinnrNm = model.getBidwinnrNm();
        this.bidwinnrBizno = model.getBidwinnrBizno();
        this.bidwinnrCeoNm = model.getBidwinnrCeoNm();
        this.bidwinnrAdrs = model.getBidwinnrAdrs();
        this.bidwinnrTelNo = model.getBidwinnrTelNo();
        this.sucsfbidAmt = model.getSucsfbidAmt();
        this.sucsfbidRate = model.getSucsfbidRate();
        this.rlOpengDt = model.getRlOpengDt();
        this.dminsttCd = model.getDminsttCd();
        this.dminsttNm = model.getDminsttNm();
        this.rgstDt = model.getRgstDt();
        this.fnlSucsfDate = model.getFnlSucsfDate();
        this.fnlSucsfCorpOfcl = model.getFnlSucsfCorpOfcl();
        this.linkInsttNm = model.getLinkInsttNm();
    }

    public void update(WinbidModel model){

        this.rbidNo = model.getRbidNo();
        this.ntceDivCd = model.getNtceDivCd();
        this.bidNtceNm = model.getBidNtceNm();
        this.prtcptCnum = model.getPrtcptCnum();
        this.bidwinnrNm = model.getBidwinnrNm();
        this.bidwinnrBizno = model.getBidwinnrBizno();
        this.bidwinnrCeoNm = model.getBidwinnrCeoNm();
        this.bidwinnrAdrs = model.getBidwinnrAdrs();
        this.bidwinnrTelNo = model.getBidwinnrTelNo();
        this.sucsfbidAmt = model.getSucsfbidAmt();
        this.sucsfbidRate = model.getSucsfbidRate();
        this.rlOpengDt = model.getRlOpengDt();
        this.dminsttCd = model.getDminsttCd();
        this.dminsttNm = model.getDminsttNm();
        this.rgstDt = model.getRgstDt();
        this.fnlSucsfDate = model.getFnlSucsfDate();
        this.fnlSucsfCorpOfcl = model.getFnlSucsfCorpOfcl();
        this.linkInsttNm = model.getLinkInsttNm();

    }


    @Override
    public WinbidKey getId() {
        return id;
    }

    @Override
    public boolean isNew() {
        return getCreateDttm() == null;
    }
}
