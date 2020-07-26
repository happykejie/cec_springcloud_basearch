package com.example.springbootdemoconsumer.config.webConfig;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @PROJECT_NAME:IntelliJ IDEA
 * @PACKAGE_NAME: com.example.springbootdemoconsumer.config.webConfig
 * @DESCRIPTION:
 * @NAME: ApplicationContextConfig
 * @USER: cec zj
 * @DATE: 2020/7/26 0026 16:09
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return  new RestTemplate();
    }
}
