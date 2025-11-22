package com.xq.config;

import com.xq.filter.MyFilter;
import com.xq.listener.MyListener;
import com.xq.servlet.ServletDemo1;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class servletConfig {

    //注册servlet组件
    @Bean
    public ServletRegistrationBean servletRegistrationBean() {
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new ServletDemo1(),"/demo1");
        return servletRegistrationBean;
    }

    //注册filter组件
    @Bean
    public FilterRegistrationBean filterRegistrationBean() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new MyFilter());
        filterRegistrationBean.setUrlPatterns(Arrays.asList("/demo1"));
        return filterRegistrationBean;
    }

    //注册listener组件
    @Bean
    public ServletListenerRegistrationBean servletListenerRegistrationBean() {
        ServletListenerRegistrationBean<MyListener> bean = new ServletListenerRegistrationBean(new MyListener());
        return bean;
    }
}
