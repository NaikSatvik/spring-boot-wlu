package com.wlu.utility.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
    @RequestMapping("/home")
    public String routeToHome() {
        return "index";
    }

    @RequestMapping("/proportion")
    public String routeToProportion() {
        return "proportion";
    }
}