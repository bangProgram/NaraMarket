package com.jbproject.narapia.rest.controller.webController;

import com.jbproject.narapia.rest.dto.payload.BidNotiSearchPayload;
import com.jbproject.narapia.rest.dto.payload.WinbidAnalSearchPayload;
import com.jbproject.narapia.rest.dto.result.BidNotiResult;
import com.jbproject.narapia.rest.dto.result.WinBidAnalResult;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
@RequiredArgsConstructor
public class BidNotiController {

    @GetMapping("/bidNoti")
    public String goNotification(
            HttpServletRequest request, Model model
            , BidNotiSearchPayload bidNotiSearchPayload
            , WinbidAnalSearchPayload winbidAnalSearchPayload
            , BidNotiResult bidNotiResult
    ){
        model.addAttribute("bidNotiResult",bidNotiResult);
        model.addAttribute("bidNotiSearchPayload", bidNotiSearchPayload);
        model.addAttribute("winbidAnalSearchPayload", winbidAnalSearchPayload);

        return "/bidNoti/main";
    }
}
