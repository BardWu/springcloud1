package com.wh.controller;

import com.wh.api.entities.Dept;
import com.wh.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: springcloud1
 * @description:
 * @author: wh
 * @create: 2020-08-25 18:53
 **/
@RestController
@RequestMapping("deptFeignConsumer")
public class DeptConsumer {


    @Resource
    private DeptClientService deptClientService;

    @GetMapping("findAllDept")
    public List<Dept> findAll(){
        return deptClientService.findAll();
    }

    @GetMapping("findById")
    public Dept findById(int id){

        return deptClientService.findById(id);
    }

}
