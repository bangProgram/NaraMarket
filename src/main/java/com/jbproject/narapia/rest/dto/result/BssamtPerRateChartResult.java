package com.jbproject.narapia.rest.dto.result;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.jbproject.narapia.rest.dto.BssamtPerRateChart;
import com.jbproject.narapia.rest.dto.model.WinBidAnalModel;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import java.time.format.DateTimeFormatter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BssamtPerRateChartResult extends DefaultChartModel{

    @Schema(title = "기초금액 그룹")
    private String bssamtGroup;
    @Schema(title = "수요기관 코드")
    private String dminsttCd;
    @Schema(title = "수요기관 명")
    private String dminsttNm;
    @Schema(title = "평균참여수")
    private Double prtcptCnumAvg;
    @Schema(title = "예비가격범위시작률")
    private String rsrvtnPrceRngRate;
    @Schema(title = "건수")
    private Long cnt;
    @Schema(title = "예측사정율")
    private Double plnprcRate;

}
