package com.jbproject.narapia.rest.controller.webController;

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

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
@Slf4j
@RequiredArgsConstructor
public class BidRecordController {

    @GetMapping("/bidRecord")
    public String goBidRecord(
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


    @PostMapping("/bidRecord/write")
    public String goBidRecordWirte(
            HttpServletRequest request, Model model
            ,BidRecordCudPayload bidRecordCudPayload
    ){
        if(bidRecordCudPayload.getRsrvtnPrceRngRate() != null){
            String value = bidRecordCudPayload.getRsrvtnPrceRngRate().replace("-","");
            bidRecordCudPayload.setRsrvtnPrceRngRate(value);
        }
        List<CommCodeModel> markets = CommonUtil.getCommCodeListByGroupCode("MARKET_TYPE").stream().map(CommCodeModel::create).toList();

        model.addAttribute("markets",markets);
        model.addAttribute("bidRecordCudPayload",bidRecordCudPayload);

        return "/bidRecord/write";
    }
}
