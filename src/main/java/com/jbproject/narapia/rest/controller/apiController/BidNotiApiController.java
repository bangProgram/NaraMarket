package com.jbproject.narapia.rest.controller.apiController;

import com.jbproject.narapia.rest.dto.payload.BidNotiSearchPayload;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/noti")
public class BidNotiApiController {

    @PostMapping("/search/list")
    public String searchList(
            HttpServletRequest request, Model model
            , BidNotiSearchPayload payload
    ){
        return "";
    }
}
