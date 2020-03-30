package com.pj.helpful;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.pj.helpful.mapper")
public class HelpfulApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelpfulApplication.class, args);
    }

}
