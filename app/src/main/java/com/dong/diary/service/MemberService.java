package com.dong.diary.service;

import java.util.List;
import com.dong.diary.domain.Member;

public interface MemberService {
  int add (Member member) throws Exception;

  List<Member> list(String keyword) throws Exception;

  Member get(int no) throws Exception;

  Member getEmail(String email) throws Exception;

  int update (Member member) throws Exception;

  int delete (int no) throws Exception;




}
