package com.wh.controller;

import com.wh.api.entities.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @program: springcloud1
 * @description:
 * @author: wh
 * @create: 2020-08-25 18:53
 **/
@RestController
@RequestMapping("deptConsumer")
public class DeptConsumer {

    private static String DEPT_PROVIDER_URL = "http://localhost:8001";

    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("findAllDept")
    public List<Dept> findAll(){
        return restTemplate.getForObject(DEPT_PROVIDER_URL+"/dept/findAll",List.class);
    }
}
