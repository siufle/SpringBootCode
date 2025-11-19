package com.xq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

@Controller
public class ParamController {

    @RequestMapping("/aa/{userId}/mm/{num}")
    @ResponseBody
    public String hello(@PathVariable("userId") String userId, @PathVariable("num") int num) {
        System.out.println(userId);
        System.out.println(num);
        return "hello";
    }

    //localhost:8080/testRequestParam?username=mike&age=18&address=usa
    @RequestMapping("/testRequestParam")
    @ResponseBody
    public String testRequestParam(@RequestParam("username") String username,
                                   @RequestParam("age") int age,
                                   @RequestParam("address") String address) {
        System.out.println(username);
        System.out.println(age);
        System.out.println(address);
        return "hello";
    }

    @RequestMapping("getData")
    @ResponseBody
    public String getData(@RequestBody String data) {
        return data;
    }

    @RequestMapping("testCookie")
    @ResponseBody
    public String testCookie(@CookieValue("Webstorm-f10ad9ff") String cookie) {
        System.out.println(cookie);
        return "hello";
    }

    @RequestMapping("test1")
    public String test1(HttpServletRequest request) {
        request.setAttribute("username","jack");
        return "forward:/test2";
    }

    @RequestMapping("test2")
    @ResponseBody
    public String test2(@RequestAttribute("username") String username) {
        System.out.println(username);
        return username;
    }

    //localhost:8080/test/matrix/123;color=red,blue,green
    @RequestMapping("test/matrix/{param}")
    @ResponseBody
    public String testMatrix(@MatrixVariable(pathVar = "param", value = "color") String[] strs) {
        for (String str : strs) {System.out.println(str);}
        return "success";
    }
}
