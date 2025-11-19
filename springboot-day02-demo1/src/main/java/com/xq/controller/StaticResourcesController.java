package com.xq.controller;

import com.xq.demos.web.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StaticResourcesController {

    @RequestMapping("/b.html")
    @ResponseBody
    public String hello() {
        return "hello";
    }
}
