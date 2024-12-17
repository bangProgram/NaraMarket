package com.jbproject.narapia.rest.dto.result;

import com.jbproject.narapia.rest.dto.BssamtPerRateChart;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BssamtPerRateChartResult {

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
