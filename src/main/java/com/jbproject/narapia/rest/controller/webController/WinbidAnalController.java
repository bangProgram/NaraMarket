package com.jbproject.narapia.rest.controller.webController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jbproject.narapia.rest.dto.payload.BidNotiSearchPayload;
import com.jbproject.narapia.rest.dto.payload.WinbidAnalSearchPayload;
import com.jbproject.narapia.rest.dto.result.*;
import com.jbproject.narapia.rest.service.WinbidAnalService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@Slf4j
@RequiredArgsConstructor
public class WinbidAnalController {

    private final WinbidAnalService winbidAnalService;

    private final ObjectMapper objectMapper = new ObjectMapper();

    @GetMapping("/winbidAnal")
    public String goWinbidAnal(
            HttpServletRequest request, Model model
            , WinbidAnalSearchPayload winbidAnalSearchPayload
    ) throws JsonProcessingException {
        List<BssamtPerRateChartResult> chartResultsTwo = winbidAnalService.getRsrvtnPrceRngChartList("2",winbidAnalSearchPayload);
        List<BssamtPerRateChartResult> chartResultsThree = winbidAnalService.getRsrvtnPrceRngChartList("3",winbidAnalSearchPayload);
        String jsonDataTwo = objectMapper.writeValueAsString(chartResultsTwo);
        String jsonDataThree = objectMapper.writeValueAsString(chartResultsThree);

        System.out.println("jsonDataTwo : "+jsonDataTwo);

        model.addAttribute("winbidAnalSearchPayload", winbidAnalSearchPayload);
        model.addAttribute("chartResultsTwo", jsonDataTwo);
        model.addAttribute("chartResultsThree", jsonDataThree);

        return "/winbidAnal/main";
    }
}
