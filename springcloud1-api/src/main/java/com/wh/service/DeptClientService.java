package com.wh.service;

import com.wh.api.entities.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @program: springcloud1
 * @description:
 * @author: wh
 * @create: 2020-12-08 21:32
 **/
@FeignClient(value = "springcloud-dept" ,fallback = DeptClientHystrixService.class)
public interface DeptClientService {

    @GetMapping("/dept/findAll")
    public List<Dept> findAll();

    @GetMapping("/dept/findById")
    public Dept findById(@RequestParam(value = "id") int id);
}
