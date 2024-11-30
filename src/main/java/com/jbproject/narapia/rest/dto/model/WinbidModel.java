package com.jbproject.narapia.rest.dto.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter @Setter @ToString
@NoArgsConstructor
public class WinbidModel {

    @Schema(title = "입찰공고번호")
    private String bidNtceNo;
    @Schema(title = "입찰공고차수")
    private String bidNtceOrd;
    @Schema(title = "입찰분류번호")
    private String bidClsfcNo;

    @Schema(title = "재입찰번호")
    private String rbidNo;
    @Schema(title = "공고구분코드")
    private String ntceDivCd;
    @Schema(title = "입찰공고명")
    private String bidNtceNm;
    @Schema(title = "참가업체수")
    private long prtcptCnum;
    @Schema(title = "최종낙찰업체명")
    private String bidwinnrNm;
    @Schema(title = "최종낙찰업체사업자등록번호")
    private String bidwinnrBizno;
    @Schema(title = "최종낙찰업체대표자명")
    private String bidwinnrCeoNm;
    @Schema(title = "최종낙찰업체주소")
    private String bidwinnrAdrs;
    @Schema(title = "최종낙찰업체전화번호")
    private String bidwinnrTelNo;
    @Schema(title = "최종낙찰금액")
    private double sucsfbidAmt;
    @Schema(title = "최종낙찰률")
    private String sucsfbidRate;
    @Schema(title = "실개찰일시")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime rlOpengDt;
    @Schema(title = "수요기관코드")
    private String dminsttCd;
    @Schema(title = "수요기관명")
    private String dminsttNm;
    @Schema(title = "등록일시")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime rgstDt;
    @Schema(title = "최종낙찰일자")
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate fnlSucsfDate;
    @Schema(title = "최종낙찰업체담당자")
    private String fnlSucsfCorpOfcl;
    @Schema(title = "연계기관명")
    private String linkInsttNm;

}
