package com.jbproject.narapia;

import com.jbproject.narapia.rest.dto.payload.WinbidAnalSearchPayload;
import com.jbproject.narapia.rest.dto.result.BssamtPerRateChartResult;
import com.jbproject.narapia.rest.dto.result.WinbidAnalChartResult;
import com.jbproject.narapia.rest.service.WinbidAnalService;
import groovy.lang.Tuple;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class WinBidAnalTests {

    @Autowired
    private WinbidAnalService winbidAnalService;

    @Test
    void getListToChartData(){
        WinbidAnalSearchPayload payload = new WinbidAnalSearchPayload();
        payload.setDminsttCd("6280000");

        List<WinbidAnalChartResult> results = winbidAnalService.getListToChartData(payload);
        System.out.println("results : "+results);
    }

    @Test
    void getRsrvtnPrceRngChartList(){
        WinbidAnalSearchPayload payload = new WinbidAnalSearchPayload();
        List<BssamtPerRateChartResult> results = winbidAnalService.getRsrvtnPrceRngChartList("2",payload);
        System.out.println("results : "+results);

    }
}
