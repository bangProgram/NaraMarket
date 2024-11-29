package com.jbproject.narapia.rest.controller.apiController;

import com.jbproject.narapia.rest.dto.payload.WinbidSearchPayload;
import com.jbproject.narapia.rest.service.UtilService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/api/util")
public class UtilApiController {

    private final UtilService utilService;

    @GetMapping("/save")
    public String saveWinbid(
    HttpServletRequest request, Model model
    , WinbidSearchPayload payload
    ) {
        try {
            utilService.saveWinbid(payload);
            return "/util/main";
        }catch (Exception e){
            return "/error/main";
        }

    }

}
