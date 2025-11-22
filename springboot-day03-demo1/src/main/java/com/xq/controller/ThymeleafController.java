package com.xq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("thymeleaf")
public class ThymeleafController {

    @RequestMapping("hello")
    public String hello(Model model) {
        List<String> list = new ArrayList<>();
        list.add("lisi");
        list.add("wangwu");
        list.add("zhaoliu");
        model.addAttribute("list", list);
        model.addAttribute("username", "zhangsan");
        return "success";
    }
}
