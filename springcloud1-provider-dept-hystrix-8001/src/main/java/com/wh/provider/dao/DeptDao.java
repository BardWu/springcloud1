package com.wh.provider.dao;

import com.wh.api.entities.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @program: springcloud1
 * @description:
 * @author: wh
 * @create: 2020-08-21 16:43
 **/
@Mapper
public interface DeptDao {

    boolean addDept(Dept dept);

    List<Dept> findAll();

    Dept findById(int id);

}
