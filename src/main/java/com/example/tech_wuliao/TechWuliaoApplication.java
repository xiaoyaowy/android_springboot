package com.example.tech_wuliao;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@MapperScan("com.example.tech_wuliao.mapper")
public class TechWuliaoApplication {

    public static void main(String[] args) {
        SpringApplication.run(TechWuliaoApplication.class, args);
    }

}
