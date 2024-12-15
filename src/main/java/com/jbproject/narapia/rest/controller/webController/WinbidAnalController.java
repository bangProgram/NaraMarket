package com.jbproject.narapia.rest.controller.webController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jbproject.narapia.rest.dto.payload.BidNotiSearchPayload;
import com.jbproject.narapia.rest.dto.payload.WinbidAnalSearchPayload;
import com.jbproject.narapia.rest.dto.result.BidNotiResult;
import com.jbproject.narapia.rest.dto.result.WinBidAnalResult;
import com.jbproject.narapia.rest.dto.result.WinbidAnalChartResult;
import com.jbproject.narapia.rest.dto.result.WinbidAnalSearchResult;
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
        winbidAnalSearchPayload.setDminsttCd("6280000");
        List<WinbidAnalChartResult> chartResults = winbidAnalService.getListToChartData(winbidAnalSearchPayload);
        String jsonData = objectMapper.writeValueAsString(chartResults);

        model.addAttribute("winbidAnalSearchPayload", winbidAnalSearchPayload);
        System.out.println("Json : "+jsonData);
        model.addAttribute("chartResults", jsonData);

        return "/winbidAnal/main";
    }
}
