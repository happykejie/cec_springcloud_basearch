package com.example.springbootdemoeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

//spring boot 启动类
@SpringBootApplication

//表示这是一个Eureka 注册中心
@EnableEurekaServer
public class SpringbootdemoEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootdemoEurekaApplication.class, args);
    }

}
