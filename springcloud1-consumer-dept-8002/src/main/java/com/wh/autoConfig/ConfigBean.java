package com.wh.autoConfig;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @program: springcloud1
 * @description:
 * @author: wh
 * @create: 2020-08-25 18:37
 **/
@Configuration
public class ConfigBean {

    @Bean
    @LoadBalanced //Spring cloud Ribbon基于Netflix Ribon实现的一套客户端 负载均衡的工具
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
