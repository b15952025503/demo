package com.path.demo.dao;

import com.path.demo.entity.Emps;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;


import java.util.List;
import java.util.Map;

@Mapper
public interface EmpsDAO {
    @Select("select * from employees")
    public List<Map<String,Object>> query();

}
