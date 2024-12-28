package com.jbproject.narapia.rest.dto.result;

import com.jbproject.narapia.rest.dto.model.BidRecordModel;
import com.jbproject.narapia.rest.dto.model.WinBidAnalModel;
import lombok.Data;

import java.util.List;

@Data
public class ChartResults {

    private List<WinbidAnalChartResult> chartResults;
    private List<BssamtPerRateChartResult> dminsttResultsTwo;
    private List<BssamtPerRateChartResult> dminsttResultsThree;
    private List<BidRecordModel> bidRecordModels;

}
