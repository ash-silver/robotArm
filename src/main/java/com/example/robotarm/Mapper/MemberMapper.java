package com.example.robotarm.Mapper;

import com.example.robotarm.Model.Member;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {
    public void MemberAdd(Member m);

}
