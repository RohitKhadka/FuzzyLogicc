package com.FuzzyLogic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by rohit_000 on 9/1/2017.
 */
@Controller
public class HomeController {
    @RequestMapping("/")
    public String homeController(){
        return "index";
    }
}
