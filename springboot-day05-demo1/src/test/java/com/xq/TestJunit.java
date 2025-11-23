package com.xq;

import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.concurrent.TimeUnit;

@DisplayName("junit5单元测试")
@SpringBootTest(classes = {App.class})
public class TestJunit {

    @BeforeEach //在单元测试之前执行
    public void beforeEach() {
        System.out.println("这是beforeEach方法");
    }

    @AfterEach //在单元测试之后执行
    public void afterEach() {
        System.out.println("这是afterEach方法");
    }

    @Test
    public void test01() {
        System.out.println("这是test01方法");
    }

    @Test
    @Disabled // 使该方法不执行
    public void test02() {
        System.out.println("这是test02方法");
    }

    @Test
    @Timeout(value = 500, unit = TimeUnit.MILLISECONDS) //规定当前方法在500毫秒内执行完成 若超时则报错
    public void test03() {
        try {
            Thread.sleep(1000); //使当前方法休眠1000毫秒 则500毫秒内不可能完成 则会报错
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("这是test03方法");
    }
}
