package com.jbproject.narapia.rest.entity;

import com.jbproject.narapia.rest.dto.model.BidNotiModel;
import com.jbproject.narapia.rest.entity.base.BaseEntity;
import com.jbproject.narapia.rest.entity.keys.BidNotiKey;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.domain.Persistable;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "tb_bidnoti")
public class BidNotiEntity extends BaseEntity implements Persistable<BidNotiKey> {

    @EmbeddedId
    private BidNotiKey id;


    @Column(columnDefinition="varchar(20)")
    private String vat;
    @Column(columnDefinition="varchar(20)")
    private String cmmnSpldmdMethdCd;
    @Column(columnDefinition="varchar(50)")
    private String cmmnSpldmdMethdNm;
    @Column(columnDefinition="varchar(20)")
    private String dsgntCmptYn;
    @Column(columnDefinition="varchar(50)")
    private String orderPlanUntyNo;
    private String sucsfbidLwltRate;
    private LocalDateTime rgstDt;
    private String bfSpecRgstNo;
    @Column(columnDefinition="varchar(20)")
    private String sucsfbidMthdCd;
    @Column(columnDefinition="varchar(100)")
    private String sucsfbidMthdNm;
    private String indstrytyLmtYn;
//    private String purchsObjPrdctList;
    private LocalDateTime bidQlfctRgstDt;
    private String cmmnSpldmdAgrmntRcptdocMethd;
    private LocalDateTime cmmnSpldmdAgrmntClseDt;
    @Column(columnDefinition="varchar(20)")
    private String cmmnSpldmdCorpRgnLmtYn;

    private LocalDateTime bidBeginDt;
    private LocalDateTime bidClseDt;
    private LocalDateTime opengDt;


    private String ntceSpecDocUrl1;
    private String ntceSpecDocUrl2;
    private String ntceSpecFileNm1;
    private String ntceSpecFileNm2;
    @Column(columnDefinition="varchar(20)")
    private String rbidPermsnYn;
    @Column(columnDefinition="varchar(20)")
    private String prdctClsfcLmtYn;
    @Column(columnDefinition="varchar(20)")
    private String mnfctYn;
    @Column(columnDefinition="varchar(50)")
    private String prearngPrceDcsnMthdNm;
    private double asignBdgtAmt;
    private double presmptPrce;
    private String opengPlce;
    private String bidNtceDtlUrl;
    @Column(columnDefinition="varchar(50)")
    private String crdtrNm;
    @Column(columnDefinition="varchar(50)")
    private String dtilPrdctClsfcNo;
    @Column(columnDefinition="varchar(50)")
    private String dtilPrdctClsfcNoNm;
    private String prdctSpecNm;
    @Column(columnDefinition="varchar(20)")
    private String prdctQty;
    @Column(columnDefinition="varchar(20)")
    private String prdctUnit;
    private LocalDateTime dlvrTmlmtDt;

    @Column(columnDefinition="varchar(20)")
    private String reNtceYn;
    private String rgstTyNm;
    @Column(columnDefinition="varchar(50)")
    private String ntceKindNm;
    @Column(columnDefinition="varchar(20)")
    private String intrbidYn;
    private LocalDateTime bidNtceDt;
    @Column(columnDefinition="varchar(50)")
    private String refNo;
    private String bidNtceNm;
    @Column(columnDefinition="varchar(20)")
    private String ntceInsttCd;
    @Column(columnDefinition="varchar(50)")
    private String ntceInsttNm;
    @Column(columnDefinition="varchar(20)")
    private String dminsttCd;
    @Column(columnDefinition="varchar(50)")
    private String dminsttNm;
    @Column(columnDefinition="varchar(50)")
    private String bidMethdNm;
    @Column(columnDefinition="varchar(50)")
    private String cntrctCnclsMthdNm;
    @Column(columnDefinition="varchar(50)")
    private String ntceInsttOfclNm;
    private String ntceInsttOfclTelNo;
    private String ntceInsttOfclEmailAdrs;
    private String exctvNm;


    // 여기부터는 잘 안사용하는 것 같음 없는데이터 많음

    private String d2bMngOrgnlbdgtDedtEndDate;
    private double d2bMngAssmntUplmtRt;
    private double d2bMngAssmntLwstlmtRt;
//    @Column(columnDefinition="varchar(20)")
//    private String d2bMngStdIndstryClsfcCdList;
    private LocalDateTime d2bMngPrdctnAbltySbmsnClseDt;
    @Column(columnDefinition="varchar(50)")
    private String d2bMngProgrsSttusNm;
    @Column(columnDefinition="varchar(50)")
    private String d2bMngExetTyNm;
    @Column(columnDefinition="varchar(20)")
    private String d2bMngExetTyCd;
    @Column(columnDefinition="varchar(20)")
    private String d2bMngPrdlstCd;
    @Column(columnDefinition="varchar(50)")
    private String d2bMngItemNo;
    private String d2bMngNgttnStleNm;
    private String d2bMngNgttnPlanDate;
    @Column(columnDefinition="varchar(20)")
    private String d2bMngDmndYear;
    @Column(columnDefinition="varchar(50)")
    private String d2bMngDcsnNo;
    @Lob
    private String chgNtceRsn;
    private LocalDateTime rbidOpengDt;
    @Column(columnDefinition="varchar(20)")
    private String indutyVAT;
    @Column(columnDefinition="varchar(50)")
    private String untyNtceNo;
    private String stdNtceDocUrl;
    @Column(columnDefinition="varchar(20)")
    private String brffcBidprcPermsnYn;
    private String rsrvtnPrceReMkngMthdNm;
    private String arsltApplDocRcptMthdNm;
    private LocalDateTime arsltApplDocRcptDt;
    @Column(columnDefinition="varchar(20)")
    private String infoBizYn;
    private LocalDateTime chgDt;
    @Column(columnDefinition="varchar(50)")
    private String linkInsttNm;
    private String dminsttOfclEmailAdrs;
    private LocalDateTime d2bMngDcmtgOprtnDt;
    @Column(columnDefinition="varchar(50)")
    private String d2bMngDcmtgOprtnPlce;
    @Column(columnDefinition="varchar(20)")
    private String d2bMngRgnLmtYn;
    @Column(columnDefinition="varchar(50)")
    private String d2bMngPblctPlceNm;
    @Column(columnDefinition="varchar(50)")
    private String d2bMngCntrctKindNm;
    private String d2bMngCntrybndDedtBgnDate;
    private String d2bMngCntrybndDedtEndDate;
    @Column(columnDefinition="varchar(20)")
    private String d2bMngRsrvtnPrceBssOpenYn;
    @Column(columnDefinition="varchar(20)")
    private String d2bMngRrsrvtnPrceBssAplYn;
    private double d2bMngBssamt;
    @Column(columnDefinition="varchar(20)")
    private String d2bMngRgstEvalExmpYn;
    @Column(columnDefinition="varchar(20)")
    private String d2bMngCompCorpRsrchObjYn;
    private String d2bMngOrgnlbdgtDedtBgnDate;

    private String ntceSpecDocUrl3;
    private String ntceSpecDocUrl4;
    private String ntceSpecDocUrl5;
    private String ntceSpecDocUrl6;
    private String ntceSpecDocUrl7;
    private String ntceSpecDocUrl8;
    private String ntceSpecDocUrl9;
    private String ntceSpecDocUrl10;
    @Column(columnDefinition="varchar(200)")
    private String ntceSpecFileNm3;
    @Column(columnDefinition="varchar(200)")
    private String ntceSpecFileNm4;
    @Column(columnDefinition="varchar(200)")
    private String ntceSpecFileNm5;
    @Column(columnDefinition="varchar(200)")
    private String ntceSpecFileNm6;
    @Column(columnDefinition="varchar(200)")
    private String ntceSpecFileNm7;
    @Column(columnDefinition="varchar(200)")
    private String ntceSpecFileNm8;
    @Column(columnDefinition="varchar(200)")
    private String ntceSpecFileNm9;
    @Column(columnDefinition="varchar(200)")
    private String ntceSpecFileNm10;
    @Column(columnDefinition="varchar(20)")
    private String totPrdprcNum;
    @Column(columnDefinition="varchar(20)")
    private String drwtPrdprcNum;
    private String bidNtceUrl;
    @Column(columnDefinition="varchar(20)")
    private String bidPrtcptFeePaymntYn;
    @Column(columnDefinition="varchar(20)")
    private String bidPrtcptFee;
    @Column(columnDefinition="varchar(20)")
    private String bidGrntymnyPaymntYn;
    @Column(columnDefinition="varchar(20)")
    private String prdctUprc;
    @Column(columnDefinition="varchar(50)")
    private String dlvrDaynum;
    @Column(columnDefinition="varchar(50)")
    private String dlvryCndtnNm;
    @Column(columnDefinition="varchar(50)")
    private String rgnLmtBidLocplcJdgmBssCd;
    @Column(columnDefinition="varchar(50)")
    private String rgnLmtBidLocplcJdgmBssNm;

    @Builder
    public BidNotiEntity(
            BidNotiKey id, String vat, String cmmnSpldmdMethdCd, String cmmnSpldmdMethdNm, String dsgntCmptYn,
            String orderPlanUntyNo, String sucsfbidLwltRate, LocalDateTime rgstDt, String bfSpecRgstNo, String sucsfbidMthdCd,
            String sucsfbidMthdNm, String indstrytyLmtYn, LocalDateTime bidQlfctRgstDt, String cmmnSpldmdAgrmntRcptdocMethd,
            LocalDateTime cmmnSpldmdAgrmntClseDt, String cmmnSpldmdCorpRgnLmtYn, LocalDateTime bidBeginDt, LocalDateTime bidClseDt, LocalDateTime opengDt,
            String ntceSpecDocUrl1, String ntceSpecDocUrl2, String ntceSpecFileNm1, String ntceSpecFileNm2, String rbidPermsnYn,
            String prdctClsfcLmtYn, String mnfctYn, String prearngPrceDcsnMthdNm, double asignBdgtAmt, double presmptPrce,
            String opengPlce, String bidNtceDtlUrl, String crdtrNm, String dtilPrdctClsfcNo, String dtilPrdctClsfcNoNm,
            String prdctSpecNm, String prdctQty, String prdctUnit, LocalDateTime dlvrTmlmtDt, String reNtceYn,
            String rgstTyNm, String ntceKindNm, String intrbidYn, LocalDateTime bidNtceDt, String refNo,
            String bidNtceNm, String ntceInsttCd, String ntceInsttNm, String dminsttCd, String dminsttNm,
            String bidMethdNm, String cntrctCnclsMthdNm, String ntceInsttOfclNm, String ntceInsttOfclTelNo, String ntceInsttOfclEmailAdrs,
            String exctvNm, String d2bMngOrgnlbdgtDedtEndDate, double d2bMngAssmntUplmtRt, double d2bMngAssmntLwstlmtRt,
            LocalDateTime d2bMngPrdctnAbltySbmsnClseDt, String d2bMngProgrsSttusNm, String d2bMngExetTyNm, String d2bMngExetTyCd, String d2bMngPrdlstCd,
            String d2bMngItemNo, String d2bMngNgttnStleNm, String d2bMngNgttnPlanDate, String d2bMngDmndYear, String d2bMngDcsnNo,
            String chgNtceRsn, LocalDateTime rbidOpengDt, String indutyVAT, String untyNtceNo, String stdNtceDocUrl,
            String brffcBidprcPermsnYn, String rsrvtnPrceReMkngMthdNm, String arsltApplDocRcptMthdNm, LocalDateTime arsltApplDocRcptDt, String infoBizYn,
            LocalDateTime chgDt, String linkInsttNm, String dminsttOfclEmailAdrs, LocalDateTime d2bMngDcmtgOprtnDt, String d2bMngDcmtgOprtnPlce,
            String d2bMngRgnLmtYn, String d2bMngPblctPlceNm, String d2bMngCntrctKindNm, String d2bMngCntrybndDedtBgnDate, String d2bMngCntrybndDedtEndDate,
            String d2bMngRsrvtnPrceBssOpenYn, String d2bMngRrsrvtnPrceBssAplYn, double d2bMngBssamt, String d2bMngRgstEvalExmpYn, String d2bMngCompCorpRsrchObjYn,
            String d2bMngOrgnlbdgtDedtBgnDate, String ntceSpecDocUrl3, String ntceSpecDocUrl4, String ntceSpecDocUrl5, String ntceSpecDocUrl6,
            String ntceSpecDocUrl7, String ntceSpecDocUrl8, String ntceSpecDocUrl9, String ntceSpecDocUrl10, String ntceSpecFileNm3,
            String ntceSpecFileNm4, String ntceSpecFileNm5, String ntceSpecFileNm6, String ntceSpecFileNm7, String ntceSpecFileNm8,
            String ntceSpecFileNm9, String ntceSpecFileNm10, String totPrdprcNum, String drwtPrdprcNum, String bidNtceUrl,
            String bidPrtcptFeePaymntYn, String bidPrtcptFee, String bidGrntymnyPaymntYn, String prdctUprc, String dlvrDaynum,
            String dlvryCndtnNm, String rgnLmtBidLocplcJdgmBssCd, String rgnLmtBidLocplcJdgmBssNm
    ) {
        this.id = id;
        this.vat = vat;
        this.cmmnSpldmdMethdCd = cmmnSpldmdMethdCd;
        this.cmmnSpldmdMethdNm = cmmnSpldmdMethdNm;
        this.dsgntCmptYn = dsgntCmptYn;
        this.orderPlanUntyNo = orderPlanUntyNo;
        this.sucsfbidLwltRate = sucsfbidLwltRate;
        this.rgstDt = rgstDt;
        this.bfSpecRgstNo = bfSpecRgstNo;
        this.sucsfbidMthdCd = sucsfbidMthdCd;
        this.sucsfbidMthdNm = sucsfbidMthdNm;
        this.indstrytyLmtYn = indstrytyLmtYn;
//        this.purchsObjPrdctList = purchsObjPrdctList;
        this.bidQlfctRgstDt = bidQlfctRgstDt;
        this.cmmnSpldmdAgrmntRcptdocMethd = cmmnSpldmdAgrmntRcptdocMethd;
        this.cmmnSpldmdAgrmntClseDt = cmmnSpldmdAgrmntClseDt;
        this.cmmnSpldmdCorpRgnLmtYn = cmmnSpldmdCorpRgnLmtYn;
        this.bidBeginDt = bidBeginDt;
        this.bidClseDt = bidClseDt;
        this.opengDt = opengDt;
        this.ntceSpecDocUrl1 = ntceSpecDocUrl1;
        this.ntceSpecDocUrl2 = ntceSpecDocUrl2;
        this.ntceSpecFileNm1 = ntceSpecFileNm1;
        this.ntceSpecFileNm2 = ntceSpecFileNm2;
        this.rbidPermsnYn = rbidPermsnYn;
        this.prdctClsfcLmtYn = prdctClsfcLmtYn;
        this.mnfctYn = mnfctYn;
        this.prearngPrceDcsnMthdNm = prearngPrceDcsnMthdNm;
        this.asignBdgtAmt = asignBdgtAmt;
        this.presmptPrce = presmptPrce;
        this.opengPlce = opengPlce;
        this.bidNtceDtlUrl = bidNtceDtlUrl;
        this.crdtrNm = crdtrNm;
        this.dtilPrdctClsfcNo = dtilPrdctClsfcNo;
        this.dtilPrdctClsfcNoNm = dtilPrdctClsfcNoNm;
        this.prdctSpecNm = prdctSpecNm;
        this.prdctQty = prdctQty;
        this.prdctUnit = prdctUnit;
        this.dlvrTmlmtDt = dlvrTmlmtDt;
        this.reNtceYn = reNtceYn;
        this.rgstTyNm = rgstTyNm;
        this.ntceKindNm = ntceKindNm;
        this.intrbidYn = intrbidYn;
        this.bidNtceDt = bidNtceDt;
        this.refNo = refNo;
        this.bidNtceNm = bidNtceNm;
        this.ntceInsttCd = ntceInsttCd;
        this.ntceInsttNm = ntceInsttNm;
        this.dminsttCd = dminsttCd;
        this.dminsttNm = dminsttNm;
        this.bidMethdNm = bidMethdNm;
        this.cntrctCnclsMthdNm = cntrctCnclsMthdNm;
        this.ntceInsttOfclNm = ntceInsttOfclNm;
        this.ntceInsttOfclTelNo = ntceInsttOfclTelNo;
        this.ntceInsttOfclEmailAdrs = ntceInsttOfclEmailAdrs;
        this.exctvNm = exctvNm;
        this.d2bMngOrgnlbdgtDedtEndDate = d2bMngOrgnlbdgtDedtEndDate;
        this.d2bMngAssmntUplmtRt = d2bMngAssmntUplmtRt;
        this.d2bMngAssmntLwstlmtRt = d2bMngAssmntLwstlmtRt;
//        this.d2bMngStdIndstryClsfcCdList = d2bMngStdIndstryClsfcCdList;
        this.d2bMngPrdctnAbltySbmsnClseDt = d2bMngPrdctnAbltySbmsnClseDt;
        this.d2bMngProgrsSttusNm = d2bMngProgrsSttusNm;
        this.d2bMngExetTyNm = d2bMngExetTyNm;
        this.d2bMngExetTyCd = d2bMngExetTyCd;
        this.d2bMngPrdlstCd = d2bMngPrdlstCd;
        this.d2bMngItemNo = d2bMngItemNo;
        this.d2bMngNgttnStleNm = d2bMngNgttnStleNm;
        this.d2bMngNgttnPlanDate = d2bMngNgttnPlanDate;
        this.d2bMngDmndYear = d2bMngDmndYear;
        this.d2bMngDcsnNo = d2bMngDcsnNo;
        this.chgNtceRsn = chgNtceRsn;
        this.rbidOpengDt = rbidOpengDt;
        this.indutyVAT = indutyVAT;
        this.untyNtceNo = untyNtceNo;
        this.stdNtceDocUrl = stdNtceDocUrl;
        this.brffcBidprcPermsnYn = brffcBidprcPermsnYn;
        this.rsrvtnPrceReMkngMthdNm = rsrvtnPrceReMkngMthdNm;
        this.arsltApplDocRcptMthdNm = arsltApplDocRcptMthdNm;
        this.arsltApplDocRcptDt = arsltApplDocRcptDt;
        this.infoBizYn = infoBizYn;
        this.chgDt = chgDt;
        this.linkInsttNm = linkInsttNm;
        this.dminsttOfclEmailAdrs = dminsttOfclEmailAdrs;
        this.d2bMngDcmtgOprtnDt = d2bMngDcmtgOprtnDt;
        this.d2bMngDcmtgOprtnPlce = d2bMngDcmtgOprtnPlce;
        this.d2bMngRgnLmtYn = d2bMngRgnLmtYn;
        this.d2bMngPblctPlceNm = d2bMngPblctPlceNm;
        this.d2bMngCntrctKindNm = d2bMngCntrctKindNm;
        this.d2bMngCntrybndDedtBgnDate = d2bMngCntrybndDedtBgnDate;
        this.d2bMngCntrybndDedtEndDate = d2bMngCntrybndDedtEndDate;
        this.d2bMngRsrvtnPrceBssOpenYn = d2bMngRsrvtnPrceBssOpenYn;
        this.d2bMngRrsrvtnPrceBssAplYn = d2bMngRrsrvtnPrceBssAplYn;
        this.d2bMngBssamt = d2bMngBssamt;
        this.d2bMngRgstEvalExmpYn = d2bMngRgstEvalExmpYn;
        this.d2bMngCompCorpRsrchObjYn = d2bMngCompCorpRsrchObjYn;
        this.d2bMngOrgnlbdgtDedtBgnDate = d2bMngOrgnlbdgtDedtBgnDate;
        this.ntceSpecDocUrl3 = ntceSpecDocUrl3;
        this.ntceSpecDocUrl4 = ntceSpecDocUrl4;
        this.ntceSpecDocUrl5 = ntceSpecDocUrl5;
        this.ntceSpecDocUrl6 = ntceSpecDocUrl6;
        this.ntceSpecDocUrl7 = ntceSpecDocUrl7;
        this.ntceSpecDocUrl8 = ntceSpecDocUrl8;
        this.ntceSpecDocUrl9 = ntceSpecDocUrl9;
        this.ntceSpecDocUrl10 = ntceSpecDocUrl10;
        this.ntceSpecFileNm3 = ntceSpecFileNm3;
        this.ntceSpecFileNm4 = ntceSpecFileNm4;
        this.ntceSpecFileNm5 = ntceSpecFileNm5;
        this.ntceSpecFileNm6 = ntceSpecFileNm6;
        this.ntceSpecFileNm7 = ntceSpecFileNm7;
        this.ntceSpecFileNm8 = ntceSpecFileNm8;
        this.ntceSpecFileNm9 = ntceSpecFileNm9;
        this.ntceSpecFileNm10 = ntceSpecFileNm10;
        this.totPrdprcNum = totPrdprcNum;
        this.drwtPrdprcNum = drwtPrdprcNum;
        this.bidNtceUrl = bidNtceUrl;
        this.bidPrtcptFeePaymntYn = bidPrtcptFeePaymntYn;
        this.bidPrtcptFee = bidPrtcptFee;
        this.bidGrntymnyPaymntYn = bidGrntymnyPaymntYn;
        this.prdctUprc = prdctUprc;
        this.dlvrDaynum = dlvrDaynum;
        this.dlvryCndtnNm = dlvryCndtnNm;
        this.rgnLmtBidLocplcJdgmBssCd = rgnLmtBidLocplcJdgmBssCd;
        this.rgnLmtBidLocplcJdgmBssNm = rgnLmtBidLocplcJdgmBssNm;
    }

    public BidNotiEntity(BidNotiModel model) {
        this.id = BidNotiKey.builder()
                .bidNtceNo(model.getBidNtceNo())
                .bidNtceOrd(model.getBidNtceOrd())
                .build();

        this.vat = model.getVat();
        this.cmmnSpldmdMethdCd = model.getCmmnSpldmdMethdCd();
        this.cmmnSpldmdMethdNm = model.getCmmnSpldmdMethdNm();
        this.dsgntCmptYn = model.getDsgntCmptYn();
        this.orderPlanUntyNo = model.getOrderPlanUntyNo();
        this.sucsfbidLwltRate = model.getSucsfbidLwltRate();
        this.rgstDt = model.getRgstDt();
        this.bfSpecRgstNo = model.getBfSpecRgstNo();
        this.sucsfbidMthdCd = model.getSucsfbidMthdCd();
        this.sucsfbidMthdNm = model.getSucsfbidMthdNm();
        this.indstrytyLmtYn = model.getIndstrytyLmtYn();
//        this.purchsObjPrdctList = model.getPurchsObjPrdctList();
        this.bidQlfctRgstDt = model.getBidQlfctRgstDt();
        this.cmmnSpldmdAgrmntRcptdocMethd = model.getCmmnSpldmdAgrmntRcptdocMethd();
        this.cmmnSpldmdAgrmntClseDt = model.getCmmnSpldmdAgrmntClseDt();
        this.cmmnSpldmdCorpRgnLmtYn = model.getCmmnSpldmdCorpRgnLmtYn();
        this.bidBeginDt = model.getBidBeginDt();
        this.bidClseDt = model.getBidClseDt();
        this.opengDt = model.getOpengDt();
        this.ntceSpecDocUrl1 = model.getNtceSpecDocUrl1();
        this.ntceSpecDocUrl2 = model.getNtceSpecDocUrl2();
        this.ntceSpecFileNm1 = model.getNtceSpecFileNm1();
        this.ntceSpecFileNm2 = model.getNtceSpecFileNm2();
        this.rbidPermsnYn = model.getRbidPermsnYn();
        this.prdctClsfcLmtYn = model.getPrdctClsfcLmtYn();
        this.mnfctYn = model.getMnfctYn();
        this.prearngPrceDcsnMthdNm = model.getPrearngPrceDcsnMthdNm();
        this.asignBdgtAmt = model.getAsignBdgtAmt();
        this.presmptPrce = model.getPresmptPrce();
        this.opengPlce = model.getOpengPlce();
        this.bidNtceDtlUrl = model.getBidNtceDtlUrl();
        this.crdtrNm = model.getCrdtrNm();
        this.dtilPrdctClsfcNo = model.getDtilPrdctClsfcNo();
        this.dtilPrdctClsfcNoNm = model.getDtilPrdctClsfcNoNm();
        this.prdctSpecNm = model.getPrdctSpecNm();
        this.prdctQty = model.getPrdctQty();
        this.prdctUnit = model.getPrdctUnit();
        this.dlvrTmlmtDt = model.getDlvrTmlmtDt();
        this.reNtceYn = model.getReNtceYn();
        this.rgstTyNm = model.getRgstTyNm();
        this.ntceKindNm = model.getNtceKindNm();
        this.intrbidYn = model.getIntrbidYn();
        this.bidNtceDt = model.getBidNtceDt();
        this.refNo = model.getRefNo();
        this.bidNtceNm = model.getBidNtceNm();
        this.ntceInsttCd = model.getNtceInsttCd();
        this.ntceInsttNm = model.getNtceInsttNm();
        this.dminsttCd = model.getDminsttCd();
        this.dminsttNm = model.getDminsttNm();
        this.bidMethdNm = model.getBidMethdNm();
        this.cntrctCnclsMthdNm = model.getCntrctCnclsMthdNm();
        this.ntceInsttOfclNm = model.getNtceInsttOfclNm();
        this.ntceInsttOfclTelNo = model.getNtceInsttOfclTelNo();
        this.ntceInsttOfclEmailAdrs = model.getNtceInsttOfclEmailAdrs();
        this.exctvNm = model.getExctvNm();
        this.d2bMngOrgnlbdgtDedtEndDate = model.getD2bMngOrgnlbdgtDedtEndDate();
        this.d2bMngAssmntUplmtRt = model.getD2bMngAssmntUplmtRt();
        this.d2bMngAssmntLwstlmtRt = model.getD2bMngAssmntLwstlmtRt();
//        this.d2bMngStdIndstryClsfcCdList = model.getD2bMngStdIndstryClsfcCdList();
        this.d2bMngPrdctnAbltySbmsnClseDt = model.getD2bMngPrdctnAbltySbmsnClseDt();
        this.d2bMngProgrsSttusNm = model.getD2bMngProgrsSttusNm();
        this.d2bMngExetTyNm = model.getD2bMngExetTyNm();
        this.d2bMngExetTyCd = model.getD2bMngExetTyCd();
        this.d2bMngPrdlstCd = model.getD2bMngPrdlstCd();
        this.d2bMngItemNo = model.getD2bMngItemNo();
        this.d2bMngNgttnStleNm = model.getD2bMngNgttnStleNm();
        this.d2bMngNgttnPlanDate = model.getD2bMngNgttnPlanDate();
        this.d2bMngDmndYear = model.getD2bMngDmndYear();
        this.d2bMngDcsnNo = model.getD2bMngDcsnNo();
        this.chgNtceRsn = model.getChgNtceRsn();
        this.rbidOpengDt = model.getRbidOpengDt();
        this.indutyVAT = model.getIndutyVAT();
        this.untyNtceNo = model.getUntyNtceNo();
        this.stdNtceDocUrl = model.getStdNtceDocUrl();
        this.brffcBidprcPermsnYn = model.getBrffcBidprcPermsnYn();
        this.rsrvtnPrceReMkngMthdNm = model.getRsrvtnPrceReMkngMthdNm();
        this.arsltApplDocRcptMthdNm = model.getArsltApplDocRcptMthdNm();
        this.arsltApplDocRcptDt = model.getArsltApplDocRcptDt();
        this.infoBizYn = model.getInfoBizYn();
        this.chgDt = model.getChgDt();
        this.linkInsttNm = model.getLinkInsttNm();
        this.dminsttOfclEmailAdrs = model.getDminsttOfclEmailAdrs();
        this.d2bMngDcmtgOprtnDt = model.getD2bMngDcmtgOprtnDt();
        this.d2bMngDcmtgOprtnPlce = model.getD2bMngDcmtgOprtnPlce();
        this.d2bMngRgnLmtYn = model.getD2bMngRgnLmtYn();
        this.d2bMngPblctPlceNm = model.getD2bMngPblctPlceNm();
        this.d2bMngCntrctKindNm = model.getD2bMngCntrctKindNm();
        this.d2bMngCntrybndDedtBgnDate = model.getD2bMngCntrybndDedtBgnDate();
        this.d2bMngCntrybndDedtEndDate = model.getD2bMngCntrybndDedtEndDate();
        this.d2bMngRsrvtnPrceBssOpenYn = model.getD2bMngRsrvtnPrceBssOpenYn();
        this.d2bMngRrsrvtnPrceBssAplYn = model.getD2bMngRrsrvtnPrceBssAplYn();
        this.d2bMngBssamt = model.getD2bMngBssamt();
        this.d2bMngRgstEvalExmpYn = model.getD2bMngRgstEvalExmpYn();
        this.d2bMngCompCorpRsrchObjYn = model.getD2bMngCompCorpRsrchObjYn();
        this.d2bMngOrgnlbdgtDedtBgnDate = model.getD2bMngOrgnlbdgtDedtBgnDate();
        this.ntceSpecDocUrl3 = model.getNtceSpecDocUrl3();
        this.ntceSpecDocUrl4 = model.getNtceSpecDocUrl4();
        this.ntceSpecDocUrl5 = model.getNtceSpecDocUrl5();
        this.ntceSpecDocUrl6 = model.getNtceSpecDocUrl6();
        this.ntceSpecDocUrl7 = model.getNtceSpecDocUrl7();
        this.ntceSpecDocUrl8 = model.getNtceSpecDocUrl8();
        this.ntceSpecDocUrl9 = model.getNtceSpecDocUrl9();
        this.ntceSpecDocUrl10 = model.getNtceSpecDocUrl10();
        this.ntceSpecFileNm3 = model.getNtceSpecFileNm3();
        this.ntceSpecFileNm4 = model.getNtceSpecFileNm4();
        this.ntceSpecFileNm5 = model.getNtceSpecFileNm5();
        this.ntceSpecFileNm6 = model.getNtceSpecFileNm6();
        this.ntceSpecFileNm7 = model.getNtceSpecFileNm7();
        this.ntceSpecFileNm8 = model.getNtceSpecFileNm8();
        this.ntceSpecFileNm9 = model.getNtceSpecFileNm9();
        this.ntceSpecFileNm10 = model.getNtceSpecFileNm10();
        this.totPrdprcNum = model.getTotPrdprcNum();
        this.drwtPrdprcNum = model.getDrwtPrdprcNum();
        this.bidNtceUrl = model.getBidNtceUrl();
        this.bidPrtcptFeePaymntYn = model.getBidPrtcptFeePaymntYn();
        this.bidPrtcptFee = model.getBidPrtcptFee();
        this.bidGrntymnyPaymntYn = model.getBidGrntymnyPaymntYn();
        this.prdctUprc = model.getPrdctUprc();
        this.dlvrDaynum = model.getDlvrDaynum();
        this.dlvryCndtnNm = model.getDlvryCndtnNm();
        this.rgnLmtBidLocplcJdgmBssCd = model.getRgnLmtBidLocplcJdgmBssCd();
        this.rgnLmtBidLocplcJdgmBssNm = model.getRgnLmtBidLocplcJdgmBssNm();
    }

    public void update(BidNotiModel model) {
        this.vat = model.getVat();
        this.cmmnSpldmdMethdCd = model.getCmmnSpldmdMethdCd();
        this.cmmnSpldmdMethdNm = model.getCmmnSpldmdMethdNm();
        this.dsgntCmptYn = model.getDsgntCmptYn();
        this.orderPlanUntyNo = model.getOrderPlanUntyNo();
        this.sucsfbidLwltRate = model.getSucsfbidLwltRate();
        this.rgstDt = model.getRgstDt();
        this.bfSpecRgstNo = model.getBfSpecRgstNo();
        this.sucsfbidMthdCd = model.getSucsfbidMthdCd();
        this.sucsfbidMthdNm = model.getSucsfbidMthdNm();
        this.indstrytyLmtYn = model.getIndstrytyLmtYn();
//        this.purchsObjPrdctList = model.getPurchsObjPrdctList();
        this.bidQlfctRgstDt = model.getBidQlfctRgstDt();
        this.cmmnSpldmdAgrmntRcptdocMethd = model.getCmmnSpldmdAgrmntRcptdocMethd();
        this.cmmnSpldmdAgrmntClseDt = model.getCmmnSpldmdAgrmntClseDt();
        this.cmmnSpldmdCorpRgnLmtYn = model.getCmmnSpldmdCorpRgnLmtYn();
        this.bidBeginDt = model.getBidBeginDt();
        this.bidClseDt = model.getBidClseDt();
        this.opengDt = model.getOpengDt();
        this.ntceSpecDocUrl1 = model.getNtceSpecDocUrl1();
        this.ntceSpecDocUrl2 = model.getNtceSpecDocUrl2();
        this.ntceSpecFileNm1 = model.getNtceSpecFileNm1();
        this.ntceSpecFileNm2 = model.getNtceSpecFileNm2();
        this.rbidPermsnYn = model.getRbidPermsnYn();
        this.prdctClsfcLmtYn = model.getPrdctClsfcLmtYn();
        this.mnfctYn = model.getMnfctYn();
        this.prearngPrceDcsnMthdNm = model.getPrearngPrceDcsnMthdNm();
        this.asignBdgtAmt = model.getAsignBdgtAmt();
        this.presmptPrce = model.getPresmptPrce();
        this.opengPlce = model.getOpengPlce();
        this.bidNtceDtlUrl = model.getBidNtceDtlUrl();
        this.crdtrNm = model.getCrdtrNm();
        this.dtilPrdctClsfcNo = model.getDtilPrdctClsfcNo();
        this.dtilPrdctClsfcNoNm = model.getDtilPrdctClsfcNoNm();
        this.prdctSpecNm = model.getPrdctSpecNm();
        this.prdctQty = model.getPrdctQty();
        this.prdctUnit = model.getPrdctUnit();
        this.dlvrTmlmtDt = model.getDlvrTmlmtDt();
        this.reNtceYn = model.getReNtceYn();
        this.rgstTyNm = model.getRgstTyNm();
        this.ntceKindNm = model.getNtceKindNm();
        this.intrbidYn = model.getIntrbidYn();
        this.bidNtceDt = model.getBidNtceDt();
        this.refNo = model.getRefNo();
        this.bidNtceNm = model.getBidNtceNm();
        this.ntceInsttCd = model.getNtceInsttCd();
        this.ntceInsttNm = model.getNtceInsttNm();
        this.dminsttCd = model.getDminsttCd();
        this.dminsttNm = model.getDminsttNm();
        this.bidMethdNm = model.getBidMethdNm();
        this.cntrctCnclsMthdNm = model.getCntrctCnclsMthdNm();
        this.ntceInsttOfclNm = model.getNtceInsttOfclNm();
        this.ntceInsttOfclTelNo = model.getNtceInsttOfclTelNo();
        this.ntceInsttOfclEmailAdrs = model.getNtceInsttOfclEmailAdrs();
        this.exctvNm = model.getExctvNm();
        this.d2bMngOrgnlbdgtDedtEndDate = model.getD2bMngOrgnlbdgtDedtEndDate();
        this.d2bMngAssmntUplmtRt = model.getD2bMngAssmntUplmtRt();
        this.d2bMngAssmntLwstlmtRt = model.getD2bMngAssmntLwstlmtRt();
//        this.d2bMngStdIndstryClsfcCdList = model.getD2bMngStdIndstryClsfcCdList();
        this.d2bMngPrdctnAbltySbmsnClseDt = model.getD2bMngPrdctnAbltySbmsnClseDt();
        this.d2bMngProgrsSttusNm = model.getD2bMngProgrsSttusNm();
        this.d2bMngExetTyNm = model.getD2bMngExetTyNm();
        this.d2bMngExetTyCd = model.getD2bMngExetTyCd();
        this.d2bMngPrdlstCd = model.getD2bMngPrdlstCd();
        this.d2bMngItemNo = model.getD2bMngItemNo();
        this.d2bMngNgttnStleNm = model.getD2bMngNgttnStleNm();
        this.d2bMngNgttnPlanDate = model.getD2bMngNgttnPlanDate();
        this.d2bMngDmndYear = model.getD2bMngDmndYear();
        this.d2bMngDcsnNo = model.getD2bMngDcsnNo();
        this.chgNtceRsn = model.getChgNtceRsn();
        this.rbidOpengDt = model.getRbidOpengDt();
        this.indutyVAT = model.getIndutyVAT();
        this.untyNtceNo = model.getUntyNtceNo();
        this.stdNtceDocUrl = model.getStdNtceDocUrl();
        this.brffcBidprcPermsnYn = model.getBrffcBidprcPermsnYn();
        this.rsrvtnPrceReMkngMthdNm = model.getRsrvtnPrceReMkngMthdNm();
        this.arsltApplDocRcptMthdNm = model.getArsltApplDocRcptMthdNm();
        this.arsltApplDocRcptDt = model.getArsltApplDocRcptDt();
        this.infoBizYn = model.getInfoBizYn();
        this.chgDt = model.getChgDt();
        this.linkInsttNm = model.getLinkInsttNm();
        this.dminsttOfclEmailAdrs = model.getDminsttOfclEmailAdrs();
        this.d2bMngDcmtgOprtnDt = model.getD2bMngDcmtgOprtnDt();
        this.d2bMngDcmtgOprtnPlce = model.getD2bMngDcmtgOprtnPlce();
        this.d2bMngRgnLmtYn = model.getD2bMngRgnLmtYn();
        this.d2bMngPblctPlceNm = model.getD2bMngPblctPlceNm();
        this.d2bMngCntrctKindNm = model.getD2bMngCntrctKindNm();
        this.d2bMngCntrybndDedtBgnDate = model.getD2bMngCntrybndDedtBgnDate();
        this.d2bMngCntrybndDedtEndDate = model.getD2bMngCntrybndDedtEndDate();
        this.d2bMngRsrvtnPrceBssOpenYn = model.getD2bMngRsrvtnPrceBssOpenYn();
        this.d2bMngRrsrvtnPrceBssAplYn = model.getD2bMngRrsrvtnPrceBssAplYn();
        this.d2bMngBssamt = model.getD2bMngBssamt();
        this.d2bMngRgstEvalExmpYn = model.getD2bMngRgstEvalExmpYn();
        this.d2bMngCompCorpRsrchObjYn = model.getD2bMngCompCorpRsrchObjYn();
        this.d2bMngOrgnlbdgtDedtBgnDate = model.getD2bMngOrgnlbdgtDedtBgnDate();
        this.ntceSpecDocUrl3 = model.getNtceSpecDocUrl3();
        this.ntceSpecDocUrl4 = model.getNtceSpecDocUrl4();
        this.ntceSpecDocUrl5 = model.getNtceSpecDocUrl5();
        this.ntceSpecDocUrl6 = model.getNtceSpecDocUrl6();
        this.ntceSpecDocUrl7 = model.getNtceSpecDocUrl7();
        this.ntceSpecDocUrl8 = model.getNtceSpecDocUrl8();
        this.ntceSpecDocUrl9 = model.getNtceSpecDocUrl9();
        this.ntceSpecDocUrl10 = model.getNtceSpecDocUrl10();
        this.ntceSpecFileNm3 = model.getNtceSpecFileNm3();
        this.ntceSpecFileNm4 = model.getNtceSpecFileNm4();
        this.ntceSpecFileNm5 = model.getNtceSpecFileNm5();
        this.ntceSpecFileNm6 = model.getNtceSpecFileNm6();
        this.ntceSpecFileNm7 = model.getNtceSpecFileNm7();
        this.ntceSpecFileNm8 = model.getNtceSpecFileNm8();
        this.ntceSpecFileNm9 = model.getNtceSpecFileNm9();
        this.ntceSpecFileNm10 = model.getNtceSpecFileNm10();
        this.totPrdprcNum = model.getTotPrdprcNum();
        this.drwtPrdprcNum = model.getDrwtPrdprcNum();
        this.bidNtceUrl = model.getBidNtceUrl();
        this.bidPrtcptFeePaymntYn = model.getBidPrtcptFeePaymntYn();
        this.bidPrtcptFee = model.getBidPrtcptFee();
        this.bidGrntymnyPaymntYn = model.getBidGrntymnyPaymntYn();
        this.prdctUprc = model.getPrdctUprc();
        this.dlvrDaynum = model.getDlvrDaynum();
        this.dlvryCndtnNm = model.getDlvryCndtnNm();
        this.rgnLmtBidLocplcJdgmBssCd = model.getRgnLmtBidLocplcJdgmBssCd();
        this.rgnLmtBidLocplcJdgmBssNm = model.getRgnLmtBidLocplcJdgmBssNm();
    }

    @Override
    public BidNotiKey getId() {
        return id;
    }

    @Override
    public boolean isNew() {
        return getCreateDttm() == null;
    }
}
