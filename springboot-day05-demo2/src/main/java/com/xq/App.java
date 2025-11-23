package com.xq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.xq")
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
