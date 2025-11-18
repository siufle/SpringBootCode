package com.xq.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //自动定义set get和toString方法
@AllArgsConstructor //带全部参数的构造方法
@NoArgsConstructor //不带参数的构造方法
public class Emp {

    private String name;

    private Integer age;
}
