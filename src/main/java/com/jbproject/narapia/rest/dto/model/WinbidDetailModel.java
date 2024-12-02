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
public class WinbidDetailModel {

    @Schema(title = "입찰공고번호")
    private String bidNtceNo;
    @Schema(title = "입찰공고차수")
    private String bidNtceOrd;
    @Schema(title = "입찰분류번호")
    private String bidClsfcNo;
    @Schema(title = "복수예가순번")
    private String compnoRsrvtnPrceSno;

    @Schema(title = "재입찰번호")
    private String rbidNo;
    @Schema(title = "입찰공고명")
    private String bidNtceNm;
    @Schema(title = "예정가격")
    private double plnprc;
    @Schema(title = "기초금액")
    private double bssamt;
    @Schema(title = "총예가건수")
    private long totRsrvtnPrceNum;
    @Schema(title = "기초예정가격")
    private double bsisPlnprc;
    @Schema(title = "추첨여부")
    private String drwtYn;
    @Schema(title = "추첨횟수")
    private int drwtNum;
    @Schema(title = "최종낙찰자선정적용기준내용")
    private String bidwinrSlctnAplBssCntnts;
    @Schema(title = "실개찰일시")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime rlOpengDt;
    @Schema(title = "기초금액기준상위건수")
    private int bssamtBssUpNum;
    @Schema(title = "복수예비가격작성일시")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime compnoRsrvtnPrceMkngDt;
    @Schema(title = "입력일시")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime inptDt;
    @Schema(title = "예정가격순공사비")
    @JsonProperty("PrearngPrcePurcnstcst")
    private long prearngPrcePurcnstcst;

}
