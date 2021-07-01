package com.dong.diary.service.impl;

import java.util.List;
import org.springframework.stereotype.Service;
import com.dong.diary.dao.MemberDao;
import com.dong.diary.domain.Member;
import com.dong.diary.service.MemberService;

@Service
public class DefaultMemberService implements MemberService{

  MemberDao memberDao;

  public DefaultMemberService(MemberDao memberDao) {
    this.memberDao = memberDao;
  }

  @Override
  public int add(Member member) throws Exception {
    return memberDao.insert(member);
  }

  @Override
  public Member get(int no) throws Exception {
    return memberDao.findByNo(no);
  }

  @Override
  public List<Member> list(String keyword) throws Exception {
    return memberDao.findByKeyword(keyword);
  }

  @Override
  public int delete(int no) throws Exception {
    return memberDao.delete(no);
  }

  @Override
  public Member getEmail(String email) throws Exception {
    return memberDao.findByEmail(email);
  }

  @Override
  public int update(Member member) throws Exception {
    return memberDao.update(member);
  }


}
