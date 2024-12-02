package com.jbproject.narapia.rest.dto.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import lombok.*;

import java.time.LocalDateTime;

@Getter @Setter @ToString
@NoArgsConstructor
public class BidNotiDetailModel {

    @Schema(title = "입찰공고번호", description = "입찰공고를 관리하기 위한 번호이며 조달청나라장터 공고건의 형식은 년도(4)+월(2)+순번(5)이며 자체전자조달시스템 보유기관은 각 기관별 형식 별도 사용 ")
    private String bidNtceNo;
    @Schema(title = "입찰공고차수", description = "입찰공고차수는 해당 입찰공고에 대한 재공고 및 재입찰 등이 발생되었을 경우 증가되는 수")
    private String bidNtceOrd;
    @Schema(title = "입찰분류번호", description = "공고의 입찰분류번호")
    private String bidClsfcNo;
    @Schema(title = "입찰공고명", description = "공사명 또는 사업명이라고도 하며 입찰공고 내용을 요약한 이름")
    private String bidNtceNm;
    @Schema(title = "기초금액", description = "예정가격 작성 과정에서 거래실례가격, 원가계산가격 등에 의하여 조사한 가격이나 설계가격에 대하여 계약담당공무원이 그 적정여부를 검토조정한 가격(기초금액)(원화,원)")
    private double bssamt;
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Schema(title = "기초금액공개일시", description = "기초금액공개일시 “YYYY-MM-DD HH:MM:SS”")
    private LocalDateTime bssamtOpenDt;
    @Schema(title = "예비가격범위시작률", description = "예비가격범위시작율(%)")
    private String rsrvtnPrceRngBgnRate;
    @Schema(title = "예비가격범위종료율", description = "예비가격범위종료율(%)")
    private String rsrvtnPrceRngEndRate;
    @Schema(title = "평가기준금액", description = "적정성 평가를 위한 평가기준금액(원화,원)")
    private double evlBssAmt;
    @Schema(title = "난이도계수", description = "적정성 평가를 위한 난이도계수")
    private String dfcltydgrCfcnt;
    @Schema(title = "기타경비기준율", description = "기타경비기준율(%)")
    private String etcGnrlexpnsBssRate;
    @Schema(title = "일반관리비기준율", description = "일반관리비기준율(%)")
    private String gnrlMngcstBssRate;
    @Schema(title = "이윤기준율", description = "이윤기준율(%)")
    private String prftBssRate;
    @Schema(title = "노무비기준율", description = "노무비기준율(%)")
    private String lbrcstBssRate;
    @Schema(title = "산업안전보건관리비", description = "산업안전보건관리비(원화,원)")
    private String industSftyHelthMngcst;
    @Schema(title = "퇴직공제부금비", description = "퇴직공제부금비(원화,원)")
    private String rtrfundNon;
    @Schema(title = "환경보전비", description = "환경보전비(원화,원)")
    private String envCnsrvcst;
    @Schema(title = "하도급대금지급보증수수료", description = "하도급대금지급보증수수료(원화,원)")
    private String scontrctPayprcePayGrntyFee;
    @Schema(title = "국민건강보험료", description = "국민건강보험료(원화,원)")
    private String mrfnHealthInsrprm;
    @Schema(title = "국민연금보험료", description = "국민연금보험료(원화,원)")
    private String npnInsrprm;
    @Schema(title = "비고1", description = "기초금액 공개시 업체에게 전달할 메세지사항1")
    private String rmrk1;
    @Schema(title = "비고2", description = "기초금액 공개시 업체에게 전달할 메세지사항2")
    private String rmrk2;
    @Schema(title = "가용금액", description = "수요기관 예산에서 수수료를 제외한 금액(원화,원)")
    private double usefulAmt;
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Schema(title = "입력일시", description = "공고를 저장한 일시 (YYYY-MM-DD HH24:MM:SS)")
    private LocalDateTime inptDt;

}
