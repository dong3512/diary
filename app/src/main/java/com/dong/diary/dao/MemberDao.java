package com.dong.diary.dao;

import java.util.List;
import com.dong.diary.domain.Member;

public interface MemberDao {
  int insert (Member member) throws Exception;

  List<Member> findByKeyword(String keyword) throws Exception;

  Member findByNo(int no) throws Exception;

  int update (Member member) throws Exception;

  int delete (int no) throws Exception;

  Member findByEmail (String email) throws Exception;
}
