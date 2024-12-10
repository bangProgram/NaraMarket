package com.jbproject.narapia.rest.controller.apiController;

import com.jbproject.narapia.rest.common.CommonUtil;
import com.jbproject.narapia.rest.dto.model.CommCodeModel;
import com.jbproject.narapia.rest.dto.payload.BidNotiSearchPayload;
import com.jbproject.narapia.rest.dto.payload.BidRecordCudPayload;
import com.jbproject.narapia.rest.dto.payload.WinbidAnalSearchPayload;
import com.jbproject.narapia.rest.dto.result.BidNotiResult;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/api/bidRecord")
public class BidRecordApiController {

    @GetMapping("/list")
    public String getBidRecordList(
            HttpServletRequest request, Model model
            , BidNotiSearchPayload bidNotiSearchPayload
            , WinbidAnalSearchPayload winbidAnalSearchPayload
            , BidNotiResult bidNotiResult
    ){
        model.addAttribute("bidNotiResult",bidNotiResult);
        model.addAttribute("bidNotiSearchPayload", bidNotiSearchPayload);
        model.addAttribute("winbidAnalSearchPayload", winbidAnalSearchPayload);

        return "/bidRecord/main";
    }


    @PostMapping("/cud")
    public String cudBidRecord(
            HttpServletRequest request, Model model
            ,BidRecordCudPayload bidRecordCudPayload
    ){

        return "/bidRecord";
    }
}
