package com.jbproject.narapia.rest.controller.apiController;

import com.jbproject.narapia.rest.dto.payload.WinbidAnalSearchPayload;
import com.jbproject.narapia.rest.dto.result.WinbidAnalSearchResult;
import com.jbproject.narapia.rest.service.BidNotiService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/api/winbidAnal")
public class WinbidAnalApiController {

    private final BidNotiService bidNotiService;

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
}
