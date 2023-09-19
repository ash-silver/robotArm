package com.example.robotarm.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class IndexController {
    @GetMapping("/SelectMenu")
    public String SelectMenu(){
        return "SelectMenu";
    }
}
