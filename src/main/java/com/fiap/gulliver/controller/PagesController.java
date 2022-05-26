package com.fiap.gulliver.controller;

import org.springframework.ui.Model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PagesController {
    @GetMapping("/")
    public String getIndex(Model model) {
        return "index";
    }

    @GetMapping("/how-to-get")
    public String getHowToGet(Model model) {
        return "how_to_get";
    }

    @GetMapping("/contact")
    public String contact(Model model) {
        return "contact";
    }

    @GetMapping("/travel-plus")
    public String travelPlus(Model model) {
        return "travel_plus";
    }

    @GetMapping("/bedroom")
    public String bedroom(Model model) {
        return "bedroom-host";
    }

    @GetMapping("/useful-tips")
    public String usefulTips(Model model) {
        return "useful_tips";
    }
}
