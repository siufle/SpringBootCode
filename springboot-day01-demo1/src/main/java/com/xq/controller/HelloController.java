package com.xq.controller;

import com.xq.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //相当于@Controller + @ResponseBody
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "hello springboot";
    }

    @RequestMapping("findUser")
    public User findUser() {
        User user = new User();
        user.setUsername("zhangsan");
        user.setPassword("123456");
        return user;
    }
}
