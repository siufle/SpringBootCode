package com.xq;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.Duration;

@DisplayName("测试断言")
@SpringBootTest(classes = App.class)
public class TestAssert {

    @Test
    public void test01() {
        /**
         * 第一个参数是期望值 第二个参数是实际值
         * 若两个值相等 则执行后面的方法 若不相等则报错 报错信息为第三个参数
         */
        //Assertions.assertEquals(1, 2,"两个值不相等");
        Assertions.assertEquals(1, 1,"两个值不相等");
        System.out.println("test01方法执行了");
    }

    @Test
    public void test02() {
        // 若第一个参数中的表达式中的值为true才执行后续的方法
        Assertions.assertTrue(2>1,"表达式中的值不为true");
        System.out.println("test02执行了");
    }

    @Test
    public void test03() {
        int[] arr1 = {1,2,3};
        //int[] arr2 = {1,2};
        int[] arr2 = {1,2,3};
        Assertions.assertArrayEquals(arr1,arr2,"数组不相等");
        System.out.println("test03执行了");
    }

    @DisplayName("组合断言")
    @Test
    public void test04() {
        //组合断言只有所有断言都满足才会执行后续的方法
        Assertions.assertAll("head",
                ()->Assertions.assertEquals(1,1,"两个值不相等"),
                ()->Assertions.assertTrue(1<8,"表达式值不为true"));
        System.out.println("test04执行了");
    }

    @DisplayName("超时断言")
    @Test
    public void test05() {
        Assertions.assertTimeout(Duration.ofMillis(500),()->Thread.sleep(1000),"执行超时");
        System.out.println("test05执行了");
    }

    @DisplayName("前置条件")
    @Test
    public void test06() {
        //前置条件 若满足前置条件则会执行后续的方法 否则跳过后续方法
        Assumptions.assumeTrue(false,"预期结果不为true");
        System.out.println("test06执行了");
    }


}
