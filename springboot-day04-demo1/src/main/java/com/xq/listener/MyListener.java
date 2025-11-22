package com.xq.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyListener implements ServletContextListener {

    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("ServletContext对象创建了");
    }
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("ServletContext对象销毁了");
    }
}
