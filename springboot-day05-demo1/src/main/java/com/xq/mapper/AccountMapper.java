package com.xq.mapper;

import com.xq.pojo.Account;
import org.apache.ibatis.annotations.Mapper;

//@Mapper
public interface AccountMapper {

    Account findById(Integer id);
}
