package com.xq.controller;

import com.xq.pojo.Demo1;
import com.xq.pojo.Demo2;
import com.xq.pojo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Demo1Controller {

    @Autowired
    Demo1 demo1;

    @RequestMapping("demo")
    @ResponseBody
    public Demo1 demo1() {
        return demo1;
    }

    @Autowired
    Person person;
    @Autowired
    Demo2 demo2;

    @RequestMapping("person")
    @ResponseBody
    public Person person() {
        System.out.println(demo2);
        return person;
    }
}
