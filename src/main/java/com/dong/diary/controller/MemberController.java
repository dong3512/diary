package com.dong.diary.controller;

import com.dong.diary.domain.Member;
import com.dong.diary.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletContext;
import java.util.List;

@Controller
@RequestMapping("/member/")
public class MemberController {

    @Autowired
    MemberService memberService;
    @Autowired
    ServletContext sc;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("add")
    public String creatForm() {
        return "createMemberForm";
    }

    @PostMapping("add")
    public String add(Member member) throws Exception {

        Member m = new Member();
        m.setId(member.getId());
        m.setPassword(member.getName());
        m.setName(member.getName());
        memberService.add(m);

        return "redirect:list";
    }

    @GetMapping("list")
    public String list( Model model) throws Exception{
        List<Member> list = memberService.list();
        model.addAttribute("list", list);
        return "memberList";
    }

    @GetMapping("detail")
    public void selectSingle(Member member ,  Model model) throws Exception {
        Member m = memberService.selectSingle(member);
        model.addAttribute("member", m);
    }
}
