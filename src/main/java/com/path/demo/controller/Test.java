package com.path.demo.controller;


import com.path.demo.entity.Emps;
import com.path.demo.service.EmpsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;


@RestController
public class Test {
    @Resource
    EmpsService es;

    @GetMapping("t1")
    public String t1(HttpSession session){
        session.setAttribute("name", "Dear");
        return "t1.html";
    }



    @GetMapping("query")
    public List<Map<String,Object>> query(){
        return es.query();
   }

}
