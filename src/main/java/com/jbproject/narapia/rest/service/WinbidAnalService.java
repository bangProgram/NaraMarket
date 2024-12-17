package com.jbproject.narapia.rest.service;

import com.jbproject.narapia.rest.dto.payload.WinbidAnalSearchPayload;
import com.jbproject.narapia.rest.dto.result.BssamtPerRateChartResult;
import com.jbproject.narapia.rest.dto.result.WinbidAnalChartResult;

import java.util.List;

public interface WinbidAnalService {

    List<BssamtPerRateChartResult> getBssamtPerRateChartChartList(String rsrvtnPrceRng);
    List<WinbidAnalChartResult> getListToChartData(WinbidAnalSearchPayload payload);
}
