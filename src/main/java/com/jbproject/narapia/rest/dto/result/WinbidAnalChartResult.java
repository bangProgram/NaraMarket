package com.jbproject.narapia.rest.dto.result;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import com.jbproject.narapia.rest.common.CommonUtil;
import com.jbproject.narapia.rest.dto.model.WinBidAnalModel;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class WinbidAnalChartResult {

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

        result.setOpengDt(model.getOpengDt());
        result.setRsrvtnPrceRngBgnRate(model.getRsrvtnPrceRngBgnRate());
        result.setRsrvtnPrceRngEndRate(model.getRsrvtnPrceRngEndRate());
        result.setPlnprcRate(model.getPlnprcRate());

        return result;
    }
}
