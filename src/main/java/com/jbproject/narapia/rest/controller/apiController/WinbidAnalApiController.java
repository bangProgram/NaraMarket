package com.jbproject.narapia.rest.controller.apiController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jbproject.narapia.rest.dto.payload.WinbidAnalSearchPayload;
import com.jbproject.narapia.rest.dto.result.BssamtPerRateChartResult;
import com.jbproject.narapia.rest.dto.result.ChartResults;
import com.jbproject.narapia.rest.dto.result.WinbidAnalChartResult;
import com.jbproject.narapia.rest.dto.result.WinbidAnalSearchResult;
import com.jbproject.narapia.rest.service.BidNotiService;
import com.jbproject.narapia.rest.service.WinbidAnalService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/api/winbidAnal")
public class WinbidAnalApiController {

    private final BidNotiService bidNotiService;
    private final WinbidAnalService winbidAnalService;
    private final ObjectMapper objectMapper = new ObjectMapper();

    @PostMapping("/search/anal")
    public String searchBidnoti(
            HttpServletRequest request, Model model
            , WinbidAnalSearchPayload winbidAnalSearchPayload
    ){

        List<WinbidAnalSearchResult> winbidAnalSearchResults = bidNotiService.searchWinbidAnalList(winbidAnalSearchPayload);
        model.addAttribute("winbidAnalSearchResults",winbidAnalSearchResults);

        String type = winbidAnalSearchPayload.getSearchType();

        return "/winbidAnal/main::#"+type+"_winbidAnalTable";
    }

    @PostMapping("/datePerRateChart")
    @ResponseBody
    public String getDatePerRateChart(
            HttpServletRequest request, Model model
            ,WinbidAnalSearchPayload winbidAnalSearchPayload
    ) throws JsonProcessingException {
        // 폼 데이터를 기반으로 chartResults 데이터 생성

        ChartResults results = new ChartResults();

        results.setChartResults( winbidAnalService.getListToChartData(winbidAnalSearchPayload));
        results.setDminsttResultsTwo(winbidAnalService.getRsrvtnPrceRngChartList("2",winbidAnalSearchPayload));
        results.setDminsttResultsThree(winbidAnalService.getRsrvtnPrceRngChartList("3",winbidAnalSearchPayload));

        return objectMapper.writeValueAsString(results); // 예시: 해당 코드로 데이터를 생성
    }
}
