package com.path.demo.service;

import com.path.demo.dao.EmpsDAO;
import com.path.demo.entity.Emps;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class EmpsService {
    @Resource
    EmpsDAO empsdao;

    public List<Map<String,Object>> query(){
        return empsdao.query();
    }


}
