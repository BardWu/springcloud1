package com.wh.provider.service;

import com.wh.api.entities.Dept;
import com.wh.provider.dao.DeptDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: springcloud1
 * @description:
 * @author: wh
 * @create: 2020-08-21 17:07
 **/
@Service
public class DeptService {

    @Autowired
    private DeptDao deptDao;


    public boolean addDept(Dept dept){
        return deptDao.addDept(dept);
    }

    public List<Dept> findAll(){
        return deptDao.findAll();
    }
}
