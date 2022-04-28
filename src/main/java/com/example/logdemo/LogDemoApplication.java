package com.example.logdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LogDemoApplication {

    public static void main(String[] args) {
        System.out.println("this is stdout");
        System.err.println("this is stderr");
        SpringApplication.run(LogDemoApplication.class, args);
    }

}
