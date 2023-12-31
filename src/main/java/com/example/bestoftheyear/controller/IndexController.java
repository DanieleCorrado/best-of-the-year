package com.example.bestoftheyear.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class IndexController {

    @GetMapping()
    public String index(Model model) {
        String myName = "Daniele Corrado";
        model.addAttribute("myName", myName);
        return "index";
    }
}
