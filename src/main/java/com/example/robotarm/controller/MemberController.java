package com.example.robotarm.controller;

import com.example.robotarm.Model.Member;
import com.example.robotarm.service.MemberService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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

    @PostMapping("/login")
    public String loginForm(String user_email, String user_password, HttpServletRequest request, HttpSession session){
        Member m = memberService.isMember(user_email);
        if(m != null){
            session.setAttribute("user_email", user_email);
        }
        else{
            return "/member/join";
        }
        return "redirect:/index";
    }

    @GetMapping("/join")
    public String joinForm(Member member) {
        return "joinForm";
    }

    @PostMapping("/join")
    public String join(Member member){
        memberService.MemberAdd(member);
        return "joinForm";
    }
    @GetMapping("/logout")
    public String logout(HttpServletRequest request, HttpSession session) {
        session.invalidate();
        return "redirect:/index";
    }


}
