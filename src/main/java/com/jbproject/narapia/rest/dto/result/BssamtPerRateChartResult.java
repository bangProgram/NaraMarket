package com.jbproject.narapia.rest.dto.result;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.jbproject.narapia.rest.dto.BssamtPerRateChart;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BssamtPerRateChartResult extends DefaultChartModel{

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
