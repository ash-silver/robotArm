package com.example.robotarm.service;

import com.example.robotarm.Mapper.MemberMapper;
import com.example.robotarm.Model.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberMapper memberMapper;
    @Transactional
    public void MemberAdd(Member m) {
        memberMapper.MemberAdd(m);
    }

    @Transactional
    public Member isMember(String user_email){
//        memberMapper.isMember(user_email);
        return memberMapper.isMember(user_email);
    }
}
