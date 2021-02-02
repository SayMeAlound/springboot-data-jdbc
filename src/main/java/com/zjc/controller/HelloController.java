package com.zjc.controller;/*

    @author  zjc
    @create 2021-02-02-20:47
     
*/

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Controller

public class HelloController {
    @Resource
    JdbcTemplate jdbcTemplate;

    @GetMapping("/query")
    @ResponseBody
    public Map<String,Object> map(){
        List<Map<String, Object>> list = jdbcTemplate.queryForList("SELECT * from  department");
        return list.get(0);
    }
}
