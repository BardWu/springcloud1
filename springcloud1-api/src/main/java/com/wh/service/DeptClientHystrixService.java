package com.wh.service;

import com.wh.api.entities.Dept;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: springcloud1
 * @description:
 * @author: wh
 * @create: 2020-12-21 17:07
 **/
@Component
public class DeptClientHystrixService implements DeptClientService{
    @Override
    public List<Dept> findAll() {
        Dept dept = new Dept();
        dept.setId(-1);
        dept.setDeptName("请求失败");

        List<Dept> list = new ArrayList<>();
        list.add(dept);
        return list;
    }

    @Override
    public Dept findById(int id) {
        Dept dept = new Dept();
        dept.setId(id);
        dept.setDeptName("部门id:"+id+"不存在");
        return dept;
    }
}
