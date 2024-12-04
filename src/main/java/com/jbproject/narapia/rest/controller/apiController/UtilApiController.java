package com.jbproject.narapia.rest.controller.apiController;


import com.jbproject.narapia.rest.dto.payload.BidNotiDetailSearchPayload;
import com.jbproject.narapia.rest.dto.payload.BidNotiSearchPayload;
import com.jbproject.narapia.rest.dto.payload.WinbidDetailSearchPayload;
import com.jbproject.narapia.rest.dto.payload.WinbidSearchPayload;
import com.jbproject.narapia.rest.service.UtilService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/api/util")
public class UtilApiController {

    private final UtilService utilService;

    @PostMapping("/winbid/save")
    public RedirectView saveWinbid(
            HttpServletRequest request, Model model
            , WinbidSearchPayload payload
            , RedirectAttributes redirectAttributes
    ) {

        try {
            utilService.saveWinbid(payload);
            String div = payload.getInqryDiv();

            if(div.equals("4")){
                redirectAttributes.addFlashAttribute("serverMessage","낙찰결과 업데이트 되었습니다.");
            }else{
                String stDate = payload.getInqryBgnDt();
                String edDate = payload.getInqryEndDt();
                redirectAttributes.addFlashAttribute("serverMessage","낙찰결과 업데이트 되었습니다. / "+div+". : "+stDate+" ~ "+edDate);
            }
        }catch (Exception e){
            redirectAttributes.addFlashAttribute("serverMessage","업데이트에 실패하였습니다..");
        }

        return new RedirectView("/util");

    }

    @PostMapping("/winbidDetail/save")
    public RedirectView saveWinbidDetail(
            HttpServletRequest request, Model model
            , WinbidDetailSearchPayload payload
            , RedirectAttributes redirectAttributes
    ) {

        try {
            utilService.saveWinbidDetail(payload);

            if(payload.getInqryDiv().equals("1")){
                String stDate = payload.getInqryBgnDt();
                String edDate = payload.getInqryEndDt();
                redirectAttributes.addFlashAttribute("serverMessage","낙찰결과 상세 업데이트 되었습니다. / "+stDate+" ~ "+edDate);
            }else{
                redirectAttributes.addFlashAttribute("serverMessage","낙찰결과 상세 업데이트 되었습니다.");
            }
        }catch (Exception e){
            log.error("Exception : {}",e.getLocalizedMessage());
            redirectAttributes.addFlashAttribute("serverMessage","업데이트에 실패하였습니다..");
        }

        return new RedirectView("/util");

    }

    @PostMapping("/bidNoti/save")
    public RedirectView saveNoti(
            HttpServletRequest request, Model model
            , BidNotiSearchPayload payload
            , RedirectAttributes redirectAttributes
    ) {

        try {
            utilService.saveBidNoti(payload);

            if(payload.getInqryDiv().equals("2")){
                redirectAttributes.addFlashAttribute("serverMessage","입찰공고 업데이트 되었습니다.");
            }else{
                String stDate = payload.getInqryBgnDt();
                String edDate = payload.getInqryEndDt();
                redirectAttributes.addFlashAttribute("serverMessage","입찰공고 업데이트 되었습니다. / "+stDate+" ~ "+edDate);
            }
        }catch (Exception e){
            log.error("Exception : {}",e.getLocalizedMessage());
            redirectAttributes.addFlashAttribute("serverMessage","업데이트에 실패하였습니다..");
        }

        return new RedirectView("/util");

    }


    @PostMapping("/bidNotiDetail/save")
    public RedirectView saveNotiDetail(
            HttpServletRequest request, Model model
            , BidNotiDetailSearchPayload payload
            , RedirectAttributes redirectAttributes
    ) {

        try {
            utilService.saveBidNotiDetail(payload);

            if(payload.getInqryDiv().equals("2")){
                redirectAttributes.addFlashAttribute("serverMessage","입찰공고 업데이트 되었습니다.");
            }else{
                String stDate = payload.getInqryBgnDt();
                String edDate = payload.getInqryEndDt();
                redirectAttributes.addFlashAttribute("serverMessage","입찰공고 업데이트 되었습니다. / "+stDate+" ~ "+edDate);
            }
        }catch (Exception e){
            log.error("Exception : {}",e.getLocalizedMessage());
            redirectAttributes.addFlashAttribute("serverMessage","업데이트에 실패하였습니다..");
        }

        return new RedirectView("/util");

    }

    @PostMapping("/api/util/winbidAnal/merge")
    public RedirectView mergeWinbidAnal(
            HttpServletRequest request, Model model
            , RedirectAttributes redirectAttributes
    ) {

        try {

            redirectAttributes.addFlashAttribute("serverMessage","입찰공고 업데이트 되었습니다.");
        }catch (Exception e){
            log.error("Exception : {}",e.getLocalizedMessage());
            redirectAttributes.addFlashAttribute("serverMessage","업데이트에 실패하였습니다..");
        }

        return new RedirectView("/util");

    }

}
