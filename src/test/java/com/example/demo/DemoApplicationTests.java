package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
        // 只要上下文能正常启动，不抛出异常就代表测试通过
    }

    @Test
    void testMainMethod() {
        // 调用 main 方法以覆盖启动类的代码
        assertDoesNotThrow(() -> DemoApplication.main(new String[] {}));
    }
}
