package com.wh.provider.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.wh.api.entities.Dept;
import com.wh.provider.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @program: springcloud1
 * @description:
 * @author: wh
 * @create: 2020-08-21 17:10
 **/
@RestController
@RequestMapping("dept")
public class DeptController {

    int i = 0;
    @Autowired
    private DeptService deptService;

    @PostMapping("addDept")
    public boolean addDept(Dept dept){
        return deptService.addDept(dept);
    }

    @GetMapping("findAll")
    @HystrixCommand(fallbackMethod = "findAllHystrix")
    public List<Dept> findAll(){
        System.out.println("findAll执行了 i:"+i);
        i++;
        if(i%2 == 0){
            int j =  i/0;
        }
        return deptService.findAll();
    }


    public List<Dept> findAllHystrix(){
        return deptService.findAll();
    }



    @GetMapping("findById")
    @HystrixCommand(fallbackMethod = "findByIdHystrix")
    public Dept findById(@RequestParam(value = "id")int id){
        Dept dept =  deptService.findById(id);
        System.out.println("dept.getDeptName()："+dept.getDeptName());
        return dept;
    }
    public Dept findByIdHystrix(@RequestParam(value = "id")int id){
        Dept dept = new Dept();
        dept.setId(id);
        dept.setDeptName("部门id:"+id+"不存在");
        return dept;
    }
}
