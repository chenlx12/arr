package com.example.aar;

import com.example.aar.config.TestAndVerifyConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AarApplicationTests {
    @Autowired
    private TestAndVerifyConfig testAndVerifyConfig;

    @Test
    void contextLoads() {
        System.out.println(testAndVerifyConfig.isIDNumber("230225199807052011"));
    }

}
