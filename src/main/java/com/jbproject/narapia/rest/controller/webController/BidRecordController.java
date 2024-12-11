package com.jbproject.narapia.rest.controller.webController;

import com.jbproject.narapia.rest.common.CommonUtil;
import com.jbproject.narapia.rest.dto.model.BidRecordModel;
import com.jbproject.narapia.rest.dto.model.CommCodeModel;
import com.jbproject.narapia.rest.dto.payload.BidNotiSearchPayload;
import com.jbproject.narapia.rest.dto.payload.BidRecordCudPayload;
import com.jbproject.narapia.rest.dto.payload.BidRecordSearchPayload;
import com.jbproject.narapia.rest.dto.payload.WinbidAnalSearchPayload;
import com.jbproject.narapia.rest.dto.result.BidNotiResult;
import com.jbproject.narapia.rest.service.BidRecordService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
@Slf4j
@RequiredArgsConstructor
public class BidRecordController {

    private final BidRecordService bidRecordService;

    @GetMapping("/bidRecord")
    public String goBidRecord(
            HttpServletRequest request, Model model
            , BidRecordSearchPayload bidRecordSearchPayload
    ){
        List<CommCodeModel> markets = CommonUtil.getCommCodeListByGroupCode("MARKET_TYPE").stream().map(CommCodeModel::create).toList();

        model.addAttribute("markets",markets);
        model.addAttribute("bidRecordSearchPayload", bidRecordSearchPayload);
        return "/bidRecord/main";
    }


    @GetMapping("/bidRecord/write")
    public String goBidRecordWirte(
            HttpServletRequest request, Model model
            ,BidRecordCudPayload bidRecordCudPayload
    ){
        if(bidRecordCudPayload.getId() != null){
            BidRecordModel bidRecordModel = bidRecordService.findById(bidRecordCudPayload.getId());
            BidRecordCudPayload payload = new BidRecordCudPayload(bidRecordModel);

            model.addAttribute("bidRecordCudPayload",payload);
        }else{
            if(bidRecordCudPayload.getRsrvtnPrceRngRate() != null){
                String value = bidRecordCudPayload.getRsrvtnPrceRngRate().replace("-","");
                bidRecordCudPayload.setRsrvtnPrceRngRate(value);
            }
            model.addAttribute("bidRecordCudPayload",bidRecordCudPayload);
        }

        List<CommCodeModel> markets = CommonUtil.getCommCodeListByGroupCode("MARKET_TYPE").stream().map(CommCodeModel::create).toList();

        model.addAttribute("markets",markets);

        return "/bidRecord/write";
    }
}
