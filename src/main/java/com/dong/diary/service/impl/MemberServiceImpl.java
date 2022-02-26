package com.dong.diary.service.impl;

import com.dong.diary.domain.Member;
import com.dong.diary.mapper.MemberMapper;
import com.dong.diary.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    MemberMapper memberMapper;
    @Override
    public int add(Member member) throws Exception {
        return memberMapper.insert(member);
    }

    public List<Member> list() throws Exception {
        return memberMapper.allList();
    }

    public Member selectSingle(Member member) {
        return memberMapper.selectOne(member);
    }

    public Member Update(Member member) {
        return memberMapper.update(member);
    }
    public Member Delete(Member member) {
        return memberMapper.delete(member);
    }

}
