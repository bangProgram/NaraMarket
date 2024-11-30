package com.jbproject.narapia.rest.controller.webController;

import com.jbproject.narapia.rest.dto.payload.WinbidSearchPayload;
import com.jbproject.narapia.rest.service.UtilService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
@RequiredArgsConstructor
public class UtilController {

    private final UtilService utilService;

    @GetMapping("/util")
    public String goUtil(
    HttpServletRequest request, Model model
    , WinbidSearchPayload payload
    ) {

        model.addAttribute("winbidSearchPayload",payload);
        return "/util/main";
    }

}
