package com.example.springbootdemoproduct7003;

import org.springframework.beans.factory.config.SmartInstantiationAwareBeanPostProcessor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @PROJECT_NAME:IntelliJ IDEA
 * @PACKAGE_NAME: com.example.springbootdemoproduct7003
 * @DESCRIPTION:
 * @NAME: SpringbootdemoProduct7003Application
 * @USER: cec zj
 * @DATE: 2020/7/26 0026 14:33
 */
@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
public class SpringbootdemoProduct7003Application {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootdemoProduct7003Application.class, args);

    }
}
