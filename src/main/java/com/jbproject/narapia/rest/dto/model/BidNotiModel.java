package com.jbproject.narapia.rest.dto.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class BidNotiModel {

    private String intrbidYn;
    private String ntceSpecDocUrl7;
    private String bidGrntymnyPaymntYn;
    private String crdtrNm;
    private String dtilPrdctClsfcNo;
    private String dtilPrdctClsfcNoNm;
    private String prdctSpecNm;
    @Schema(title = " 공고의 물품수량")
    private Double prdctQty;
    private String prdctUnit;
    @Schema(title = " 공고의 물품단가")
    private double prdctUprc;
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Schema(title = " 공고의 납품기한일시 “YYYY-MM-DD HH:MM:SS”")
    private LocalDateTime dlvrTmlmtDt;
    private String dlvrDaynum;
    private String dlvryCndtnNm;
    private String purchsObjPrdctList;
    private String untyNtceNo;
    private String cmmnSpldmdMethdCd;
    private String cmmnSpldmdMethdNm;
    private String stdNtceDocUrl;
    private String brffcBidprcPermsnYn;
    private String dsgntCmptYn;
    private String rsrvtnPrceReMkngMthdNm;
    private String arsltApplDocRcptMthdNm;
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Schema(title = " 실적심사신청서 접수마감일시 “YYYY-MM-DD HH:MM:SS”")
    private LocalDateTime arsltApplDocRcptDt;
    private String orderPlanUntyNo;
    private String sucsfbidLwltRate;
    private String ntceSpecDocUrl9;
    private String ntceSpecDocUrl10;
    private String ntceSpecFileNm1;
    private String bidMethdNm;
    private String cntrctCnclsMthdNm;
    private String ntceInsttOfclNm;
    private String ntceInsttOfclTelNo;
    private String ntceInsttOfclEmailAdrs;
    private String exctvNm;
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Schema(title = "(방위사업청 오픈API 연계데이터 포함)입찰참가등록이란 입찰사무를 효과적으로 집행하기 위하여 사전에 입찰참가자격등록을 해두었다가 필요 시 입찰에 참여하는 제도로 해당 공고에 대한 입찰참가자격의 등록이 완료되어야 하는 시점을 의미함 “YYYY-MM-DD HH:MM:SS”")
    private LocalDateTime bidQlfctRgstDt;
    private String cmmnSpldmdAgrmntRcptdocMethd;
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Schema(title = " 공동계약이 허용된 공고에 대해 공동수급체를 구성하여 입찰에 참여하고자 할 경우 구성원이 일정 분담내용에 따라 나누어 공동으로 이행하는 약속을 한 공동수급협정서를 작성하여야 하며 이때 공동수급협정서의 등록(작성) 마감 시점을 의미함”YYYY-MM-DD HH:MM:SS”")
    private LocalDateTime cmmnSpldmdAgrmntClseDt;
    private String cmmnSpldmdCorpRgnLmtYn;
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Schema(title = " 입찰서의 제출을 개시하는 일시 “YYYY-MM-DD HH:MM:SS”")
    private LocalDateTime bidBeginDt;
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Schema(title = "(방위사업청 오픈API 연계데이터 포함)입찰서의 제출을 마감하는 일시 “YYYY-MM-DD HH:MM:SS”")
    private LocalDateTime bidClseDt;
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Schema(title = "(방위사업청 오픈API 연계데이터 포함)집행관이 개찰을 수행할 수 있는 시작일시이며 개찰일시 이후에 개찰이 가능함. 실제 개찰을 수행한 시간을 의미하지 않음 “YYYY-MM-DD HH:MM:SS”")
    private LocalDateTime opengDt;
    private String ntceSpecDocUrl1;
    private String ntceSpecDocUrl2;
    private String ntceSpecDocUrl6;
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Schema(title = " 공고의 등록일시 “YYYY-MM-DD HH:MM:SS”")
    private LocalDateTime rgstDt;
    private String dminsttCd;
    private String dminsttNm;
    private String ntceInsttCd;
    private String ntceInsttNm;
    private String chgNtceRsn;
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Schema(title = " 공고종류명이 ‘재입찰’ 일 경우 재입찰공고의 개찰을 수행할 수 있는 시작일시 “YYYY-MM-DD HH:MM:SS”")
    private LocalDateTime rbidOpengDt;
    @JsonProperty("VAT")
    @Schema(title = " 부가가치세")
    private String vat;
    private String bfSpecRgstNo;
    private String infoBizYn;
    private String sucsfbidMthdCd;
    private String sucsfbidMthdNm;
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Schema(title = " 공고의 변경일시 “YYYY-MM-DD HH:MM:SS”")
    private LocalDateTime chgDt;
    private String dminsttOfclEmailAdrs;
    private String indstrytyLmtYn;
    private String ntceSpecFileNm2;
    private String ntceSpecFileNm3;
    private String ntceSpecFileNm4;
    private String ntceSpecFileNm5;
    private String ntceSpecFileNm6;
    private String ntceSpecFileNm7;
    private String ntceSpecFileNm8;
    private String ntceSpecFileNm9;
    private String ntceSpecFileNm10;
    private String rbidPermsnYn;
    private String prdctClsfcLmtYn;
    private String mnfctYn;
    private String prearngPrceDcsnMthdNm;
    private String totPrdprcNum;
    private String drwtPrdprcNum;
    @Schema(title = "(방위사업청 오픈API 연계데이터 포함)사업목적물을 달성하기 위하여 배정된 예산액 또는 설계금액(원화,원)")
    private Double asignBdgtAmt;
    @Schema(title = " 물품/공사/용역 등의 조달 계약을 체결함에 있어 국제입찰 대상여부를 판단하는 기준 등으로 삼기 위하여 예정가격이 결정되기 전에 예산에 계상된 금액 등을 기준으로 하여 부가가치세 및 조달 수수료를 제외한 금액(원화,원)")
    private Double presmptPrce;
    private String opengPlce;
    private String bidNtceDtlUrl;
    private String bidNtceUrl;
    private String bidPrtcptFeePaymntYn;
    private String bidPrtcptFee;
    private String ntceSpecDocUrl3;
    private String ntceSpecDocUrl4;
    private String ntceSpecDocUrl5;
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Schema(title = "(방위사업청 오픈API 연계데이터 포함)입찰공고서를 공고한 일시 “YYYY-MM-DD HH:MM:SS”")
    private LocalDateTime bidNtceDt;
    private String reNtceYn;
    private String rgstTyNm;
    private String ntceKindNm;
    private String bidNtceNm;
    private String indutyVAT;
    private String bidNtceNo;
    private String bidNtceOrd;
    private String ntceSpecDocUrl8;
    private String refNo;
    private String bidWgrnteeRcptClseDt;
}