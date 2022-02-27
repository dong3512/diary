package com.dong.diary;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value="com.dong.diary.mapper")
public class DiaryAppllication {

    public static void main(String[] args) {
        SpringApplication.run(DiaryAppllication.class, args);
    }

}
