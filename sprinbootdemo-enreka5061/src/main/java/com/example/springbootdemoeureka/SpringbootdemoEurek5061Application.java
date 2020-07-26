package com.example.springbootdemoeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @PROJECT_NAME:IntelliJ IDEA
 * @PACKAGE_NAME: com.example.springbootdemoeureka
 * @DESCRIPTION:
 * @NAME: SpringbootdemoEurek5061Application
 * @USER: cec zj
 * @DATE: 2020/7/26 0026 12:14
 */

//spring boot 启动类
@SpringBootApplication

//表示这是一个Eureka 注册中心
@EnableEurekaServer
public class SpringbootdemoEurek5061Application {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootdemoEurek5061Application.class, args);

    }
}
