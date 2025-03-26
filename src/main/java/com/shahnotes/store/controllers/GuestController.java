package com.shahnotes.store.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GuestController extends BaseController {
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("title", "Welcome to my store");
        return "index";
    }

    @GetMapping("/about-us")
    public String about(Model model) {
        return "about";
    }
}
