package com.wh.provider.controller;

import com.wh.api.entities.Dept;
import com.wh.provider.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: springcloud1
 * @description:
 * @author: wh
 * @create: 2020-08-21 17:10
 **/
@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    @PostMapping("addDept")
    public boolean addDept(Dept dept){
        return deptService.addDept(dept);
    }
    @GetMapping("findAll")
    public List<Dept> findAll(){
        return deptService.findAll();
    }
}
