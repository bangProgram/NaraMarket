package com.jbproject.narapia.rest.controller.webController;

import com.jbproject.narapia.rest.dto.payload.BidNotiSearchPayload;
import com.jbproject.narapia.rest.dto.payload.WinbidAnalSearchPayload;
import com.jbproject.narapia.rest.dto.result.BidNotiResult;
import com.jbproject.narapia.rest.dto.result.WinBidAnalResult;
import com.jbproject.narapia.rest.dto.result.WinbidAnalSearchResult;
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

    @GetMapping("/winbidAnal")
    public String goWinbidAnal(
            HttpServletRequest request, Model model
            , WinbidAnalSearchPayload winbidAnalSearchPayload
    ){
        model.addAttribute("winbidAnalSearchPayload", winbidAnalSearchPayload);

        return "/winbidAnal/main";
    }
}
