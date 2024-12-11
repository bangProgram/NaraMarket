package com.jbproject.narapia.rest.controller.apiController;

import com.jbproject.narapia.rest.common.CommonUtil;
import com.jbproject.narapia.rest.dto.model.CommCodeModel;
import com.jbproject.narapia.rest.dto.payload.BidNotiSearchPayload;
import com.jbproject.narapia.rest.dto.payload.BidRecordCudPayload;
import com.jbproject.narapia.rest.dto.payload.BidRecordSearchPayload;
import com.jbproject.narapia.rest.dto.payload.WinbidAnalSearchPayload;
import com.jbproject.narapia.rest.dto.result.BidNotiResult;
import com.jbproject.narapia.rest.dto.result.BidRecordResult;
import com.jbproject.narapia.rest.service.BidRecordService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/api/bidRecord")
public class BidRecordApiController {

    private final BidRecordService bidRecordService;

    @PostMapping("/list")
    public String getBidRecordList(
            HttpServletRequest request, Model model
            , BidRecordSearchPayload bidRecordSearchPayload
    ){
        List<BidRecordResult> bidRecordResults = bidRecordService.getBidRecordList(bidRecordSearchPayload);

        model.addAttribute("bidRecordResults",bidRecordResults);
        return "/bidRecord/main::#bidRecordList";
    }


    @PostMapping("/cud")
    public RedirectView cudBidRecord(
            HttpServletRequest request, Model model
            , RedirectAttributes redirectAttributes
            , BidRecordCudPayload bidRecordCudPayload
    ){
        try {
            bidRecordService.cudBidRecord(bidRecordCudPayload);
            redirectAttributes.addFlashAttribute("serverMessage","투찰결과가 정상적으로 기록되었습니다.");
            return new RedirectView("/bidRecord");
        }catch (Exception e){
            return new RedirectView("/bidRecord");
        }
    }
}
