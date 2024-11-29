package com.jbproject.narapia.rest.dto.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class WinbidDetailModel {

    @Schema(title = "입찰공고번호")
    private String bidNtceNo;
    @Schema(title = "입찰공고차수")
    private String bidNtceOrd;
    @Schema(title = "입찰분류번호")
    private String bidClsfcNo;

    @Schema(title = "재입찰번호")
    private String rbidNtceNo;
    @Schema(title = "입찰공고명")
    private String bidNtceNm;
    @Schema(title = "예정가격")
    private String plnprc;
    @Schema(title = "기초금액")
    private String bssamt;
    @Schema(title = "총예가건수")
    private String totRsrvtnPrceNum;
    @Schema(title = "복수예가순번")
    private String compnoRsrvtnPrceSno;
    @Schema(title = "기초예정가격")
    private String bsisPlnprc;
    @Schema(title = "추첨여부")
    private String drwtYn;
    @Schema(title = "추첨횟수")
    private String drwtNum;
    @Schema(title = "최종낙찰자선정적용기준내용")
    private String bidwinrSlctnAplBssCntnts;
    @Schema(title = "실개찰일시")
    private String rlOpengDt;
    @Schema(title = "기초금액기준상위건수")
    private String bssamtBssUpNum;
    @Schema(title = "복수예비가격작성일시")
    private String compnoRsrvtnPrceMkngDt;
    @Schema(title = "입력일시")
    private String inptDt;
    @Schema(title = "예정가격순공사비")
    private String PrearngPrcePurcnstcst;


}
