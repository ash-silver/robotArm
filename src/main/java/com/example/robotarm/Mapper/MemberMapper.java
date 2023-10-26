package com.example.robotarm.Mapper;

import com.example.robotarm.Model.Member;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MemberMapper {
    public void MemberAdd(Member m);

    public Member isMember(@Param("user_email") String user_email);
}
