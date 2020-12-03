package com.wh.springcloud1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @program: springcloud1
 * @description:
 * @author: wh
 * @create: 2020-08-27 19:24
 **/
@SpringBootApplication
@EnableEurekaServer
public class EurekaService7003_App {
    public static void main(String[] args) {
        SpringApplication.run(EurekaService7003_App.class,args);
    }
}

