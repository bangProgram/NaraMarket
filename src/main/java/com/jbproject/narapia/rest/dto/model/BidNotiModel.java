package com.jbproject.narapia.rest.dto.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class BidNotiModel {


    @Schema(title = "(방위사업청 오픈API 연계데이터 포함)입찰공고를 관리하기 위한 번호이며 조달청나라장터 공고건의 형식은 년도(4)+월(2)+순번(5)이며 자체전자조달시스템 보유기관은 각 기관별 형식 별도 사용")
    private String bidNtceNo;
    @Schema(title = "(방위사업청 오픈API 연계데이터 포함)입찰공고차수는 해당 입찰공고에 대한 재공고 및 재입찰 등이 발생되었을 경우 증가되는 수")
    private String bidNtceOrd;


    @JsonProperty("VAT")
    @Schema(title = " 부가가치세")
    private String vat;
    @Schema(title = " 공동수급이라 함은 구성원을 2인 이상으로 하여 수급인이 해당계약을 공동으로 수행하기 위하여 잠정적으로 결성한 실체를 의미하며 공동수급체가도급을 받아 이행하는 방식을 구분하는 코드로1:공동이행, 2:분담이행, 3:공동+분담이행, 4:공동수급불허, 5:공동 or 분담, 6:주계약자관리방식으로 구분됨")
    private String cmmnSpldmdMethdCd;
    @Schema(title = "(방위사업청 오픈API 연계데이터 포함)공동수급이라 함은 구성원을 2인 이상으로 하여 수급인이 해당계약을 공동으로 수행하기 위하여 잠정적으로 결성한 실체를 의미하며 공동수급체가도급을 받아 이행하는 방식을 구분하는 명임")
    private String cmmnSpldmdMethdNm;
    @Schema(title = "(방위사업청 오픈API 연계데이터 포함)공고의 지명경쟁여부(Y/N)")
    private String dsgntCmptYn;
    @Schema(title = " 업무구분코드(1)-업무유형코드(3)-발주년도(4)-기관코드(7)-발주계획순번(6) 로 구성됨")
    private String orderPlanUntyNo;
    @Schema(title = "(방위사업청 오픈API 연계데이터 포함)개찰시 사용하는 낙찰하한율(%)")
    private String sucsfbidLwltRate;
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Schema(title = " 공고의 등록일시 “YYYY-MM-DD HH:MM:SS”")
    private LocalDateTime rgstDt;
    @Schema(title = " 공고의 사전규격등록번호")
    private String bfSpecRgstNo;
    @Schema(title = "(방위사업청 오픈API 연계데이터 포함)낙찰방법명에 대한 코드")
    private String sucsfbidMthdCd;
    @Schema(title = "(방위사업청 오픈API 연계데이터 포함)낙찰자를 결정하는 방법")
    private String sucsfbidMthdNm;
    @Schema(title = "(방위사업청 오픈API 연계 데이터 포함) 해당 공고 입찰 시 업종(면허)제한을 두는지의 여부. 예시)Y")
    private String indstrytyLmtYn;
    @Schema(title = " 공고의 구매대상물품목록으로 [입찰분류번호^세부품명번호(세부물품분류번호)^세부품명(세부물품분류명)],[입찰분류번호^세부품명번호(세부물품분류번호)^세부품명(세부물품분류명)] 제공")
    private String purchsObjPrdctList;
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Schema(title = "(방위사업청 오픈API 연계데이터 포함)입찰참가등록이란 입찰사무를 효과적으로 집행하기 위하여 사전에 입찰참가자격등록을 해두었다가 필요 시 입찰에 참여하는 제도로 해당 공고에 대한 입찰참가자격의 등록이 완료되어야 하는 시점을 의미함 “YYYY-MM-DD HH:MM:SS”")
    private LocalDateTime bidQlfctRgstDt;
    @Schema(title = " 공동수급협정서의 접수방식을 받지 않을 것인지 전자문서로 받을 것인지 또는 수기로 받을 것인지에 따라 “없음”,“전자문서”,“수기”")
    private String cmmnSpldmdAgrmntRcptdocMethd;
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Schema(title = " 공동계약이 허용된 공고에 대해 공동수급체를 구성하여 입찰에 참여하고자 할 경우 구성원이 일정 분담내용에 따라 나누어 공동으로 이행하는 약속을 한 공동수급협정서를 작성하여야 하며 이때 공동수급협정서의 등록(작성) 마감 시점을 의미함”YYYY-MM-DD HH:MM:SS”")
    private LocalDateTime cmmnSpldmdAgrmntClseDt;
    @Schema(title = " 공동수급협정시 구성원의 지역제한을 적용할지 여부. 지역제한인경우 협정 구성업체가 참가제한지역에 포함되어야 함.(Y/N)")
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


    @Schema(title = " 공고의 공고규격서URL")
    private String ntceSpecDocUrl1;
    @Schema(title = " 공고의 공고규격서URL")
    private String ntceSpecDocUrl2;
    @Schema(title = " 공고의 공고규격파일명")
    private String ntceSpecFileNm1;
    @Schema(title = " 공고의 공고규격파일명")
    private String ntceSpecFileNm2;
    @Schema(title = " 입찰이 유찰되는 경우 재공고 없이 다시 입찰(Y/N)")
    private String rbidPermsnYn;
    @Schema(title = " 물품공고의 경우 물품분류번호로 제한할 경우 Y, 물품분류번호 제한없으면 N")
    private String prdctClsfcLmtYn;
    @Schema(title = " 물품분류로 투찰제한시 제조물품으로 제한할 지 여부.")
    private String mnfctYn;
    @Schema(title = " 예정가격의 결정을 위해 복수예정가격방식으로 산정하는지 단일 예정가격으로 산정하는지를 구분하는 명")
    private String prearngPrceDcsnMthdNm;
    @Schema(title = "(방위사업청 오픈API 연계데이터 포함)사업목적물을 달성하기 위하여 배정된 예산액 또는 설계금액(원화,원)")
    private double asignBdgtAmt;
    @Schema(title = " 물품/공사/용역 등의 조달 계약을 체결함에 있어 국제입찰 대상여부를 판단하는 기준 등으로 삼기 위하여 예정가격이 결정되기 전에 예산에 계상된 금액 등을 기준으로 하여 부가가치세 및 조달 수수료를 제외한 금액(원화,원)")
    private double presmptPrce;
    @Schema(title = "(방위사업청 오픈API 연계데이터 포함)집행관이 개찰을 하는 장소")
    private String opengPlce;
    @Schema(title = " 나라장터시스템의 입찰공고 상세화면 링크")
    private String bidNtceDtlUrl;
    @Schema(title = " 입찰보증금 항목의")
    private String crdtrNm;
    @Schema(title = " 물품분류번호(8자리) + 물품식별번호(앞2자리) [물품목록정보의 관리 및 이용에 관한 규정 제12조]")
    private String dtilPrdctClsfcNo;
    @Schema(title = " 세부품명번호 10자리에 대한 한글명")
    private String dtilPrdctClsfcNoNm;
    @Schema(title = "(방위사업청 오픈API 연계데이터 포함)공고의 물품규격명")
    private String prdctSpecNm;
    @Schema(title = " 공고의 물품수량")
    private String prdctQty;
    @Schema(title = " 공고의 물품단위")
    private String prdctUnit;
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Schema(title = " 공고의 납품기한일시 “YYYY-MM-DD HH:MM:SS”")
    private LocalDateTime dlvrTmlmtDt;

    @Schema(title = " 본 입찰공고의 재공고 여부(Y/N)")
    private String reNtceYn;
    @Schema(title = " 입찰공고가")
    private String rgstTyNm;
    @Schema(title = "(방위사업청 오픈API 연계데이터 포함)공고의 공고상태명으로 일반, 변경, 취소, 재입찰, 연기, 긴급, 갱신, 긴급갱신 구분")
    private String ntceKindNm;
    @Schema(title = "(방위사업청 오픈API 연계데이터 포함)국제입찰대상인지의 여부를 나타내며 국제입찰 대상은 내외국인 또는 외국인을 대상으로 하여 물품, 공사 및 용역을 조달하기 위하여 행하는 입찰을 말하며 수의계약을 포함한다. 국가계약법 제4조에 의해 추정가격이 고시금액(국제입찰 적용 대상 기준금액으로 기획재정부장관 및 행정자치부장관이 매 2년마다 고시한 금액을 말하며 WTO 또는 양자간(FTA) 정부조달협정에 따르면 국제입찰 대상 기준 금액이 SDR(Special Dr")
    private String intrbidYn;
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Schema(title = "(방위사업청 오픈API 연계데이터 포함)입찰공고서를 공고한 일시 “YYYY-MM-DD HH:MM:SS”")
    private LocalDateTime bidNtceDt;
    @Schema(title = " 조달청 입찰공고의 경우 참조공고번호는 자체 전자조달시스템에서 관리하는 공고번호를 의미하며 자체전자조달시스템의 경우 참조공고번호는 나라장터(G2B) 입찰공고번호를 의미함")
    private String refNo;
    @Schema(title = "(방위사업청 오픈API 연계데이터 포함)공사명 또는 사업명이라고도 하며 입찰공고 내용을 요약한 이름")
    private String bidNtceNm;
    @Schema(title = " 공고를 하는 기관의 코드로 행자부코드(행정자치부에서 부여한 기관코드)가 있는 경우 행자부코드가 행자부코드가 없는 경우 조달청에서 부여한 공고기관 코드가 표기됨")
    private String ntceInsttCd;
    @Schema(title = " 수요기관의 의뢰를 받아 공고하는 기관의 명")
    private String ntceInsttNm;
    @Schema(title = "(방위사업청 오픈API 연계데이터 포함)실제 수요기관의 코드로 행자부코드(행정자치부에서 부여한 기관코드)가 있는 경우 행자부코드가 행자부코드가 없는 경우 조달청에서 부여한 수요기관")
    private String dminsttCd;
    @Schema(title = "(방위사업청 오픈API 연계데이터 포함)중앙조달인 경우 조달사업에 관한 법률 제2조(정의)에 따라 수요물자의 구매 공급 또는 시설공사 계약의 체결을 조달청장에게 요청할 수 있도록 조달청장")
    private String dminsttNm;
    @Schema(title = "(방위사업청 오픈API 연계데이터 포함)공고의 입찰방식명 직찰 전자입찰,전자입찰/직찰,전자/직찰/우편/상시,직찰/우편/상시,우편/상시,전자시담,복수견적(역경매),직찰/우편,전자시담(다자간)")
    private String bidMethdNm;
    @Schema(title = "(방위사업청 오픈API 연계데이터 포함)계약체결의 방법을 구분하는 명일반경쟁계약은 계약 대상 물품의 규격 및 시방서와 계약조건 등을 널리 공고하여 일정한 자격을 가진 불특정 다수인의 입찰희망자를 모두 경쟁 입찰하는 계약방법제한경쟁계약은 일반•지명경쟁계약제도의 단점을 보완하기 위해 실적제한, 기술보유제한, 특정물품제한, 지역제한 등을 두는 계약방법*지명경쟁계약은 계약상대자의 신용과 실적 등에 있어 적당하다고 인정하는 특정 다수의 경쟁 참가자를 지명하여")
    private String cntrctCnclsMthdNm;
    @Schema(title = "(방위사업청 오픈API 연계데이터 포함)공고기관의 공고를 담당하는 담당자의 명")
    private String ntceInsttOfclNm;
    @Schema(title = "(방위사업청 오픈API 연계데이터 포함)공고기관의 공고를 담당하는 담당자의 전화번호")
    private String ntceInsttOfclTelNo;
    @Schema(title = " 공고기관의 공고를 담당하는 담당자의 이메일주소")
    private String ntceInsttOfclEmailAdrs;
    @Schema(title = " 공고의 집행관명")
    private String exctvNm;


    // 여기부터는 잘 안사용하는 것 같음 없는데이터 많음

    @Schema(title = "방위사업청 오픈API 연계데이터)당해 연도 내 납품기한 일자")
    private String d2bMngOrgnlbdgtDedtEndDate;
    @Schema(title = "방위사업청 오픈API 연계데이터)예정가격을 기초금액으로 나눈 비율(상한)")
    private double d2bMngAssmntUplmtRt;
    @Schema(title = "(방위사업청 오픈API 연계데이터)예정가격을 기초금액으로 나눈 비율(하한)")
    private double d2bMngAssmntLwstlmtRt;
    @Schema(title = "(방위사업청 오픈API 연계데이터)한국표준산업분류 : 생산단위(사업체단위, 기업체단위 등)가 주로 수행하는 산업 활동을 그 유사성에 따라 체계적으로 유형화한 것 포맷 : 산업분류코드 : 산업")
    private String d2bMngStdIndstryClsfcCdList;
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Schema(title = "(방위사업청 오픈API 연계데이터)방위사업청 중앙조달 품목 중 생산능력확인제도에 해당하는 입찰공고에서 생산능력확인서류를 제출해야 하는 마감일시 “YYYY-MM-DD HH:MM:SS”")
    private LocalDateTime d2bMngPrdctnAbltySbmsnClseDt;
    @Schema(title = "(방위사업청 오픈API 연계데이터)방위사업청 입찰공고의 진행 상태 정보(진행중/공개협상완료/견적서제출마감/조달판단중/판단완료/공고확정/…)")
    private String d2bMngProgrsSttusNm;
    @Schema(title = "(방위사업청 오픈API 연계데이터)방위사업청 입찰 집행유형명. F(제조),N(제조/구매),M(구매),A(용역),L(리스),Z(기타),C(공사),K(공급),Z(기타)")
    private String d2bMngExetTyNm;
    @Schema(title = "(방위사업청 오픈API 연계데이터)방위사업청 입찰 집행유형 코드. F(제조),N(제조/구매),M(구매),A(용역),L(리스),Z(기타),C(공사),K(공급),Z(기타)")
    private String d2bMngExetTyCd;
    @Schema(title = "(방위사업청 오픈API 연계데이터)해당 입찰공고를 통해 계약될 물품의 품목코드")
    private String d2bMngPrdlstCd;
    @Schema(title = "(방위사업청 오픈API 연계데이터)방위사업청 입찰공고의 항목 번호")
    private String d2bMngItemNo;
    @Schema(title = "(방위사업청 오픈API 연계데이터)해당 입찰건의 협상 방법명(일반협상/전자협상)")
    private String d2bMngNgttnStleNm;
    @Schema(title = "(방위사업청 오픈API 연계데이터)방위사업청 공개수의협상공고일 경우, 협상 공고 일자 정보 ”YYYY-MM-DD”")
    private String d2bMngNgttnPlanDate;
    @Schema(title = "(방위사업청 오픈API 연계데이터)해당 입찰건의 요구년도")
    private String d2bMngDmndYear;
    @Schema(title = "(방위사업청 오픈API 연계데이터)해당 입찰건의 판단번호")
    private String d2bMngDcsnNo;
    @Schema(title = " 공고종류명(공고의 공고상태명) 이 변경일 경우 변경공고사유 , 취소일 경우 취소공고사유(연계공고건는 제외)")
    private String chgNtceRsn;
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Schema(title = " 공고종류명이 ‘재입찰’ 일 경우 재입찰공고의 개찰을 수행할 수 있는 시작일시 “YYYY-MM-DD HH:MM:SS”")
    private LocalDateTime rbidOpengDt;
    @Schema(title = " 주공종부가가치세")
    private String indutyVAT;
    @Schema(title = " 입찰공고를 구분하는 번호로 입찰공고번호이며 형식은 년도(4)+월(2)+순번(5)")
    private String untyNtceNo;
    @Schema(title = " 공고의 표준공고문URL")
    private String stdNtceDocUrl;
    @Schema(title = " 지역제한 공고에 한해서 지사 투찰을 허용할지 여부. 투찰제어시 사용(Y/N)")
    private String brffcBidprcPermsnYn;
    @Schema(title = " 공고의 예비가격재작성방법명")
    private String rsrvtnPrceReMkngMthdNm;
    @Schema(title = " 공고의 실적신청서접수방법명")
    private String arsltApplDocRcptMthdNm;
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Schema(title = " 실적심사신청서 접수마감일시 “YYYY-MM-DD HH:MM:SS”")
    private LocalDateTime arsltApplDocRcptDt;
    @Schema(title = " 정보화사업여부")
    private String infoBizYn;
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Schema(title = " 공고의 변경일시 “YYYY-MM-DD HH:MM:SS”")
    private LocalDateTime chgDt;
    @Schema(title = "(방위사업청 오픈API 연계데이터 포함)나라장터에 연계를 통하여 입찰 및 계약을 등록한 기관명. * 방위사업청, 한국전력공사 등 (자체)전자조달시스템을 운영하는 기관명")
    private String linkInsttNm;
    @Schema(title = " 수요기관 담당자의 이메일주소")
    private String dminsttOfclEmailAdrs;
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Schema(title = "(방위사업청 오픈API 연계데이터)해당 공고에 대한 현장/입찰/과업 설명회를 실시하는 일시 ”YYYY-MM-DD HH:MM:SS”")
    private LocalDateTime d2bMngDcmtgOprtnDt;
    @Schema(title = "(방위사업청 오픈API 연계데이터) 해당 공고에 대한 설명회를 실시하는 경우 현장/입찰/과업 설명회를 실시하는 장소")
    private String d2bMngDcmtgOprtnPlce;
    @Schema(title = "(방위사업청 오픈API 연계데이터)해당 공고 입찰 시 지역제한을 두는지의 여부. 예시)Y")
    private String d2bMngRgnLmtYn;
    @Schema(title = "(방위사업청 오픈API 연계데이터)해당 입찰공고가 게재될 위치(Default : 인터넷) 계약관(공고기관)이 임의로 입력 가능한 데이터")
    private String d2bMngPblctPlceNm;
    @Schema(title = "(방위사업청 오픈API 연계데이터)방위사업청 기준 계약종류명(물가조정단가계약/성과기반계약/원가절감보상계약/유인부원가정산계약/유인부확정계약/일반개산계약/일반확정계약/장기옵션계약/중도확정계약/특정비목불확정계약/한도액계약)")
    private String d2bMngCntrctKindNm;
    @Schema(title = "(방위사업청 오픈API 연계데이터)다음 회계 연도에 지출할 것을 전제로 국회의 승인을 얻어 지출원인행위(계약)를 할 수 있으나 지출년도에 다시 국회의 승인을 얻어야 하는 예산의 납기 시작일")
    private String d2bMngCntrybndDedtBgnDate;
    @Schema(title = "(방위사업청 오픈API 연계데이터)다음 회계 연도에 지출할 것을 전제로 국회의 승인을 얻어 지출원인행위(계약)를 할 수 있으나 지출년도에 다시 국회의 승인을 얻어야 하는 예산의 납기 종료일")
    private String d2bMngCntrybndDedtEndDate;
    @Schema(title = "(방위사업청 오픈API 연계데이터)해당 입찰공고의 기초 예비가격 공개 여부(공개 : Y / 미공개 : N)")
    private String d2bMngRsrvtnPrceBssOpenYn;
    @Schema(title = "(방위사업청 오픈API 연계데이터)해당 입찰공고의 기초 예비가격 적용 여부(적용 : Y / 미적용 : N)")
    private String d2bMngRrsrvtnPrceBssAplYn;
    @Schema(title = "(방위사업청 오픈API 연계데이터)예정가격 작성 과정에서 거래실례가격, 원가계산가격 등에 의하여 조사한 가격이나 설계가격에 대하여 계약담당공무원이 그 적정여부를 검토조정한 가격(원화")
    private double d2bMngBssamt;
    @Schema(title = "(방위사업청 오픈API 연계데이터)입찰참가자가 해당 입찰에 참여할 수 있는지 자격조건을 계약담당공무원이 심사하는지의 여부. (Y:입찰참가등록 후 등록심사 없이 입찰서제출 N:입찰참가등록")
    private String d2bMngRgstEvalExmpYn;
    @Schema(title = "(방위사업청 오픈API 연계데이터)방위사업법 시행규칙에 따라 무기체계, 구성장비 또는 구성품을 연구개발로 획득하기 위하여 2개의 연구개발 주관기관 또는 시제업체를 선정하여 추진하는 사업(복수 연구개발사업)에 해당 되는지 여부(대상 : Y / 비대상 : N)")
    private String d2bMngCompCorpRsrchObjYn;
    @Schema(title = "(방위사업청 오픈API 연계데이터)당해 연도 내 납품기한 일자")
    private String d2bMngOrgnlbdgtDedtBgnDate;

    @Schema(title = " 공고의 공고규격서URL")
    private String ntceSpecDocUrl3;
    @Schema(title = " 공고의 공고규격서URL")
    private String ntceSpecDocUrl4;
    @Schema(title = " 공고의 공고규격서URL")
    private String ntceSpecDocUrl5;
    @Schema(title = " 공고의 공고규격서URL")
    private String ntceSpecDocUrl6;
    @Schema(title = " 공고의 공고규격서URL")
    private String ntceSpecDocUrl7;
    @Schema(title = " 공고의 공고규격서URL")
    private String ntceSpecDocUrl8;
    @Schema(title = " 공고의 공고규격서URL")
    private String ntceSpecDocUrl9;
    @Schema(title = " 공고의 공고규격서URL")
    private String ntceSpecDocUrl10;
    @Schema(title = " 공고의 공고규격파일명")
    private String ntceSpecFileNm3;
    @Schema(title = " 공고의 공고규격파일명")
    private String ntceSpecFileNm4;
    @Schema(title = " 공고의 공고규격파일명")
    private String ntceSpecFileNm5;
    @Schema(title = " 공고의 공고규격파일명")
    private String ntceSpecFileNm6;
    @Schema(title = " 공고의 공고규격파일명")
    private String ntceSpecFileNm7;
    @Schema(title = " 공고의 공고규격파일명")
    private String ntceSpecFileNm8;
    @Schema(title = " 공고의 공고규격파일명")
    private String ntceSpecFileNm9;
    @Schema(title = " 공고의 공고규격파일명")
    private String ntceSpecFileNm10;
    @Schema(title = " 공고의 총예가건수")
    private String totPrdprcNum;
    @Schema(title = " 공고의 추첨예가건수")
    private String drwtPrdprcNum;
    @Schema(title = " 해당 입찰공고를 인터넷상에서 확인할 수 있는 URL주소")
    private String bidNtceUrl;
    @Schema(title = " 입찰참가 의사가 있는 자가 납부하여야하는 수수료의 유무 및 납부방법을 표기하는 것으로")
    private String bidPrtcptFeePaymntYn;
    @Schema(title = " 입찰에 참가하기위해 납부하는 수수료(원화,원)")
    private String bidPrtcptFee;
    @Schema(title = " 입찰보증금을 나라장터에서 전자로 납부가능하게 할지 여부(Y/N)")
    private String bidGrntymnyPaymntYn;
    @Schema(title = " 공고의 물품단가")
    private String prdctUprc;
    @Schema(title = " 공고의 납품일수")
    private String dlvrDaynum;
    @Schema(title = " 인도 받을 장소")
    private String dlvryCndtnNm;
    @Schema(title = "파악불가")
    private String rgnLmtBidLocplcJdgmBssCd;
    @Schema(title = "파악불가")
    private String rgnLmtBidLocplcJdgmBssNm;
}