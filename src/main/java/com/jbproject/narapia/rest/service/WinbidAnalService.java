package com.jbproject.narapia.rest.service;

import com.jbproject.narapia.rest.dto.payload.WinbidAnalSearchPayload;
import com.jbproject.narapia.rest.dto.result.RsrvtnPrceRngChartResult;
import com.jbproject.narapia.rest.dto.result.WinbidAnalChartResult;

import java.util.List;

public interface WinbidAnalService {

    List<RsrvtnPrceRngChartResult> getRsrvtnPrceRngChartList(String rsrvtnPrceRng);
    List<WinbidAnalChartResult> getListToChartData(WinbidAnalSearchPayload payload);
}
