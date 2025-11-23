package com.xq;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.platform.commons.util.StringUtils;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.Stream;

@DisplayName("参数化测试")
@SpringBootTest
public class TestParameter {

    @ParameterizedTest //参数化测试
    @ValueSource(strings = {"apple","orange","banana"})
    public void testParameter1(String str) {
        System.out.println(str);
        Assertions.assertTrue(StringUtils.isNotBlank(str));
        System.out.println("testParameter1方法执行了");
    }

    @ParameterizedTest
    @MethodSource("show")
    public void testParameter2(String str) {
        System.out.println(str);
        Assertions.assertNotNull(str);
        System.out.println("testParameter2方法执行了");
    }

    static Stream<String> show(){
        return Stream.of("apple","orange","banana");
    }

}
