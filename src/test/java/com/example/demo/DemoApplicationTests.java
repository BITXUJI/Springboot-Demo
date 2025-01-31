package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    /**
     * Tests that the application context can be loaded without errors.
     */
    @Test
    void contextLoads() {
    }

    /**
     * Tests that the code runs without crashing.
     */
    @Test
    public void test() {
        System.out.println("test");
    }

    /**
     * Tests that the second test method executes without any issues.
     */
    @Test
    public void test2() {
        System.out.println("test2");
    }

}
