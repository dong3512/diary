package com.dong.diary.service;

import com.dong.diary.domain.Member;

import java.util.List;

public interface MemberService {

    int add(Member member) throws Exception;

    List<Member> list() throws Exception;

    Member selectSingle(Member member);

    Member Update(Member member);

    Member Delete(Member member);
}

