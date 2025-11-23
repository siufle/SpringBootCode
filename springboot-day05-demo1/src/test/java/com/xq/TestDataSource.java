package com.xq;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;

@SpringBootTest(classes = App.class)
public class TestDataSource {

    @Autowired
    DataSource dataSource;

    @Test
    public void testDataSource() {
        System.out.println(dataSource);
    }
}
