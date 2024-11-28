package com.todo.golfclub.services;

import com.todo.golfclub.entities.Member;
import com.todo.golfclub.repositories.MemberRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {
    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public Member addMember(Member member) {
        return memberRepository.save(member);
    }
    public List<Member> getAllMembers() {
        return memberRepository.findAll();
    }

}
/ /   P l a c e h o l d e r   f o r   f u t u r e   A P I   e n h a n c e m e n t  
 