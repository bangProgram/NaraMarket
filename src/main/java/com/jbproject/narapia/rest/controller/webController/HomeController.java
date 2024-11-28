package com.jbproject.narapia.rest.controller.webController;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
@RequiredArgsConstructor
public class HomeController {

    @GetMapping(value = {
            "/", "/home"
    })
    public String goHome(){
        return "/home/main";
    }
}
