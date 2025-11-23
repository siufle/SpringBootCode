package com.xq.service;

import com.xq.pojo.HelloProperties;
import org.springframework.beans.factory.annotation.Autowired;

public class HelloService {

    @Autowired
    HelloProperties helloProperties;

    public String sayHello(String userName){
        return helloProperties.getPrefix() + "<-->"+userName+"<-->"+helloProperties.getSuffix();
    }
}
