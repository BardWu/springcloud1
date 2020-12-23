package com.wh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @program: springcloud1
 * @description:
 * @author: wh
 * @create: 2020-08-25 19:03
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class FeignDeptConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(FeignDeptConsumerApplication.class,args);
    }
}
