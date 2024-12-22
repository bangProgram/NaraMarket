package com.jbproject.narapia.rest.repository.custom;

import com.jbproject.narapia.rest.dto.model.WinBidAnalModel;
import com.jbproject.narapia.rest.dto.payload.WinbidAnalSearchPayload;
import com.jbproject.narapia.rest.dto.result.BssamtPerRateChartResult;
import com.jbproject.narapia.rest.dto.result.WinbidAnalSearchResult;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WinbidAnalCustom  {
//    List<WinbidAnalEntity> searchWinbidAnalList(WinbidAnalSearchPayload payload);

    List<BssamtPerRateChartResult> getRsrvtnPrceRngChartList(String rsrvtnPrceRng, String dminsttCd);
    List<WinBidAnalModel> getListToChartData(WinbidAnalSearchPayload payload);
    List<WinbidAnalSearchResult> searchWinbidAnalList(WinbidAnalSearchPayload payload);
}
