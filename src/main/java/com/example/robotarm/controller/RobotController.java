package com.example.robotarm.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/robot")
public class RobotController {
    @GetMapping("/SelectRobot")
    public String selectRobot(){
        return "SelectRobot";
    }
}
