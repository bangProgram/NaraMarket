package com.jbproject.narapia.rest.dto;

import io.swagger.v3.oas.annotations.media.Schema;

public interface BssamtPerRateChart {
    String getBssamtGroup();
    Double getPrtcptCnumAvg();
    String getRsrvtnPrceRngRate();
    Long getCnt();
    Double getPlnprcRate();
}
