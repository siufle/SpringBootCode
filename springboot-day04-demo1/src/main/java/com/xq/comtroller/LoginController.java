package com.xq.comtroller;

import com.xq.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@Slf4j
public class LoginController {

    @GetMapping({"/","login"})
    public String loginPage(){
        return "login";
    }

    @PostMapping("/login")
    public String login(User user, HttpSession session, Model model){
        if(user.getUserName().equals("admin") && user.getPassword().equals("123456")){
            //登录成功 重定向到主页面
            session.setAttribute("loginUser", user);
            return "redirect:/main.html";
        }else{
            //登陆失败 打印失败信息 回到登陆页面
            model.addAttribute("msg","用户名或密码输入错误");
            return "login";
        }
    }

    @GetMapping("/main.html")
    public String mainPage(HttpSession session, Model model){
        /*User user = (User)session.getAttribute("loginUser");
        if(user != null){
            return "main";
        }else{
            model.addAttribute("msg","请先登录");
            return "login";
        }*/
        return "main";
    }
}
