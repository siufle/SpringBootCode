package com.xq.service.impl;

import com.xq.mapper.AccountMapper;
import com.xq.pojo.Account;
import com.xq.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountMapper accountMapper;

    @Override
    public Account findById(Integer id) {
        return accountMapper.findById(id);
    }
}
