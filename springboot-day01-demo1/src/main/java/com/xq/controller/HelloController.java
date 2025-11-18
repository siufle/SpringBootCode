package com.xq.controller;

import com.xq.pojo.Emp;
import com.xq.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //相当于@Controller + @ResponseBody
@Slf4j //开启对日志输出的支持 可以直接使用log对象
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

    @RequestMapping("emp")
    public String emp() {
        /*Emp emp = new Emp();
        emp.setName("lisi");
        emp.setAge(24);
        System.out.println(emp);*/
        log.info("emp方法被执行");
        Emp emp = new Emp("lisi",24);
        System.out.println(emp);
        return "输出成功";
    }
}
