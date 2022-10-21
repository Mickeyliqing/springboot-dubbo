package com.example.bootuser;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo
@SpringBootApplication
public class BootUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootUserApplication.class, args);
    }

}
