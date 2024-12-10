package com.jbproject.narapia.rest.controller.apiController;

import com.jbproject.narapia.rest.dto.payload.BidNotiSearchPayload;
import com.jbproject.narapia.rest.dto.payload.WinbidAnalSearchPayload;
import com.jbproject.narapia.rest.dto.result.BidNotiResult;
import com.jbproject.narapia.rest.dto.result.WinBidAnalResult;
import com.jbproject.narapia.rest.dto.result.WinbidAnalSearchResult;
import com.jbproject.narapia.rest.service.BidNotiService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/api/bidNoti")
public class BidNotiApiController {

    private final BidNotiService bidNotiService;

    /*
    @PostMapping("/search")
    public String searchBidnoti(
            HttpServletRequest request, Model model
            , BidNotiSearchPayload bidNotiSearchPayload
    ){
        BidNotiResult bidNotiResult = bidNotiService.searchBidnoti(bidNotiSearchPayload);
        model.addAttribute("bidNotiResult",bidNotiResult);
        return "/bidNoti/main::#bidNotiTable";
    }
    */



    @PostMapping("/search")
    public RedirectView searchBidnotiTest(
            HttpServletRequest request, Model model
            , BidNotiSearchPayload bidNotiSearchPayload
            , RedirectAttributes redirectAttributes
    ){
        BidNotiResult bidNotiResult = bidNotiService.searchBidnoti(bidNotiSearchPayload);
//        model.addAttribute("bidNotiResult",bidNotiResult);
        System.out.println("bidNotiResult : "+bidNotiResult);
        redirectAttributes.addFlashAttribute("bidNotiResult",bidNotiResult);
        return new RedirectView("/bidNoti");
    }


}
