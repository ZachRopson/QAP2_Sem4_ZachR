package com.todo.golfclub.controllers;

import com.todo.golfclub.entities.Member;
import com.todo.golfclub.services.MemberService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/members")
public class MemberController {
    private final MemberService memberService;

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @PostMapping
    public Member addMember(@RequestBody Member member) {
        return memberService.addMember(member);
    }
    @GetMapping
    public List<Member> getAllMembers() {
        return memberService.getAllMembers();
    }

}
