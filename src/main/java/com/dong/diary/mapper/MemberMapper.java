package com.dong.diary.mapper;

import com.dong.diary.domain.Member;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface MemberMapper {

    @Options(useGeneratedKeys = true, keyProperty = "no")
    @Insert("INSERT INTO member(id, password) VALUES(#{id}, #{password} )")
    int insert(Member member) throws Exception;
    @Select("SELECT * FROM member")
    List<Member> allList() throws Exception;
    @Select("SELECT * FROM member where = #{id}")
    Member selectOne(Member userId);

    @Update("UPDATE Member SET id = #{id} , password = #{password}")
    Member update(Member member);

    @Update("UPDATE Member SET del = 'Y'")
    Member delete(Member member);
}
