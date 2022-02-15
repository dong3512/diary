package com.dong.diary;

import com.dong.diary.repository.MemberRepository;
import com.dong.diary.repository.MemoryMemberRepository;
import com.dong.diary.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class diaryConfig {

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
}
