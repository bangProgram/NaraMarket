package com.jbproject.narapia.rest.repository.custom;

import com.jbproject.narapia.rest.dto.model.WinBidAnalModel;
import com.jbproject.narapia.rest.dto.payload.WinbidAnalSearchPayload;
import com.jbproject.narapia.rest.dto.result.BssamtPerRateChartResult;
import com.jbproject.narapia.rest.dto.result.WinbidAnalSearchResult;

import java.util.List;

public interface WinbidAnalCustom  {
//    List<WinbidAnalEntity> searchWinbidAnalList(WinbidAnalSearchPayload payload);

    List<BssamtPerRateChartResult> getRsrvtnPrceRngChartList(String rsrvtnPrceRng);
    List<WinBidAnalModel> getListToChartData(WinbidAnalSearchPayload payload);
    List<WinbidAnalSearchResult> searchWinbidAnalList(WinbidAnalSearchPayload payload);
}
