package com.xq.controller;

import com.xq.pojo.Emp;
import com.xq.pojo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @Value("${person.name:李四}")//如果没拿到指定的数据 则将默认值李四赋值给name属性
    private String name;

    @RequestMapping("hello")
    @ResponseBody
    public String hello() {
        return "hello " + name;
    }

    /*@Autowired
    Person person;*/

    /*@RequestMapping("person")
    @ResponseBody
    public String sayPerson(){
        return person.getClass().toString();
    }*/

    @Autowired
    Emp emp;

    @RequestMapping("emp")
    @ResponseBody
    public Emp emp(){
        return emp;
    }
}
