package com.jbproject.narapia.rest.dto.result;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import com.jbproject.narapia.rest.common.CommonUtil;
import com.jbproject.narapia.rest.dto.model.WinBidAnalModel;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WinbidAnalChartResult extends DefaultChartModel {

    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Schema(title = "개찰 일시")
    private LocalDateTime opengDt;

    @Schema(title = "예비가격범위시작률")
    private String rsrvtnPrceRngBgnRate;
    @Schema(title = "예비가격범위종료율")
    private String rsrvtnPrceRngEndRate;

    @Schema(title = "예측사정율")
    private Double plnprcRate;

    public static WinbidAnalChartResult create(WinBidAnalModel model) {
        WinbidAnalChartResult result = new WinbidAnalChartResult();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");

        result.setXDataGroup(model.getOpengDt().format(formatter));
        result.setYDataGroup(String.valueOf(model.getPlnprcRate()));

        result.setOpengDt(model.getOpengDt());
        result.setRsrvtnPrceRngBgnRate(model.getRsrvtnPrceRngBgnRate());
        result.setRsrvtnPrceRngEndRate(model.getRsrvtnPrceRngEndRate());
        result.setPlnprcRate(model.getPlnprcRate());

        return result;
    }
}
