package com.jbproject.narapia.rest.dto.result;

import lombok.Data;

import java.math.BigDecimal;
import java.math.RoundingMode;

@Data
public class WinbidAnalSearchResult {

    private Double bssamtRateData;
    private BigDecimal bssamtRate;
    private Long rateCount;

}
