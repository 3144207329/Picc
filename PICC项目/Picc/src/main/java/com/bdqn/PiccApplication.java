package com.bdqn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.bdqn.dao")
public class PiccApplication {

    public static void main(String[] args) {
        SpringApplication.run(PiccApplication.class, args);
    }

}
