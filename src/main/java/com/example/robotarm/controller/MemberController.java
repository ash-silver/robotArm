package com.example.robotarm.controller;

import com.example.robotarm.Model.Member;
import com.example.robotarm.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/member")
public class MemberController {
    private final MemberService memberService;

    @GetMapping("/index")
    public String index() {
        return "index";
    }
    @GetMapping("/login")
    public String loginForm() {
        return "loginForm";
    }
    @GetMapping("/join")
    public String joinForm(Member member) {
        memberService.MemberAdd(member);
        return "joinForm";
    }
    @GetMapping("/logout")
    public String logout() {
        return "home";
    }
}
