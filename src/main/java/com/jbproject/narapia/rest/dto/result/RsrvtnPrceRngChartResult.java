package com.jbproject.narapia.rest.dto.result;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import com.jbproject.narapia.rest.dto.model.WinBidAnalModel;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
public class RsrvtnPrceRngChartResult {

    @Schema(title = "기초금액 그룹")
    private String bssamtGroup;
    @Schema(title = "평균참여수")
    private Double prtcptCnumAvg;
    @Schema(title = "예비가격범위시작률")
    private String rsrvtnPrceRngRate;
    @Schema(title = "건수")
    private Long cnt;
    @Schema(title = "예측사정율")
    private Double plnprcRate;

}
