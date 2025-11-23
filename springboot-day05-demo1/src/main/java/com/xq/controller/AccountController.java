package com.xq.controller;

import com.xq.pojo.Account;
import com.xq.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @Autowired
    AccountService accountService;

    @RequestMapping("findById")
    public Account findById(@RequestParam("id") Integer id) {
        Account account = accountService.findById(id);
        return account;
    }
}
