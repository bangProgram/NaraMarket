package com.jbproject.narapia.rest.dto.result;

import lombok.Data;

import java.util.List;

@Data
public class ChartResults {

    List<WinbidAnalChartResult> chartResults;
    List<BssamtPerRateChartResult> dminsttResultsTwo;
    List<BssamtPerRateChartResult> dminsttResultsThree;

}
