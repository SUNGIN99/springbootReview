package com.insungWork.springbootReview.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/new")
    public String home(){
        return "new";
    }

    @GetMapping("/viewlayout")
    public String viewlayoutPage(){
        return "viewlayout";
    }


}
