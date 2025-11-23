package com.xq;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAdminServer //开启性能指标监控
@SpringBootApplication
@MapperScan("com.xq.mapper") //批量扫描mapper接口
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
