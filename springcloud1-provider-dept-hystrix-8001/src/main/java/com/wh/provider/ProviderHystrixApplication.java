package com.wh.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @program: springcloud1
 * @description:
 * @author: wh
 * @create: 2020-08-21 17:12
 **/
@SpringBootApplication
@EnableEurekaClient //服务启动后，注册到EurekaServer中
@EnableCircuitBreaker
public class ProviderHystrixApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProviderHystrixApplication.class,args);
    }
}
