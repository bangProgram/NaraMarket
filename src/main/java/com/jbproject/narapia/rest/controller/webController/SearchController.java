package com.jbproject.narapia.rest.controller.webController;

import com.jbproject.narapia.rest.dto.payload.SearchPayload;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
@RequiredArgsConstructor
public class SearchController {



    @GetMapping("/search")
    public String goSearch(
            HttpServletRequest request, Model model
            , SearchPayload payload
    ){
        return "/search/main";
    }
}
