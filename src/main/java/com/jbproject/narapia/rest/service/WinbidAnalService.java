package com.jbproject.narapia.rest.service;

import com.jbproject.narapia.rest.dto.payload.WinbidAnalSearchPayload;
import com.jbproject.narapia.rest.dto.result.BssamtPerRateChartResult;
import com.jbproject.narapia.rest.dto.result.WinbidAnalChartResult;
import groovy.lang.Tuple;

import java.util.List;

public interface WinbidAnalService {
    List<BssamtPerRateChartResult> getRsrvtnPrceRngChartList(String rsrvtnPrceRng, WinbidAnalSearchPayload payload);
    List<WinbidAnalChartResult> getListToChartData(WinbidAnalSearchPayload payload);
}
