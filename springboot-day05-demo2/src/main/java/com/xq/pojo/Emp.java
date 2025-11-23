package com.xq.pojo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("person")
@Data
public class Emp implements Person{

    private String name;
    private Integer age;
}
