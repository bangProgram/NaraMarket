package com.jbproject.narapia.rest.controller.webController;

import com.jbproject.narapia.rest.dto.payload.NotiSearchPayload;
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

    @GetMapping("/noti")
    public String goNotification(
            HttpServletRequest request, Model model
            , NotiSearchPayload payload
    ){
        return "/noti/main";
    }
}
