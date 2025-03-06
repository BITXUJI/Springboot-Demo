package com.common.demo;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    /**
     * 测试上下文加载.
     */
    @Test
    void contextLoads() {
        // 只要上下文能正常启动，不抛出异常就代表测试通过
    }

    /**
     * 测试 main 方法.
     */
    @Test
    void testMainMethod() {
        // 调用 main 方法以覆盖启动类的代码
        assertDoesNotThrow(() -> DemoApplication.main(new String[] {}));
    }

    /**
     * 测试 configure 方法.
     */
    @Test
    void testConfigure() {
        // 创建 DemoApplication 实例
        final DemoApplication demoApplication = new DemoApplication();
        // 使用 Mockito 创建 SpringApplicationBuilder 的 spy
        final SpringApplicationBuilder builderSpy = spy(new SpringApplicationBuilder());
        // 调用 configure 方法
        demoApplication.configure(builderSpy);
        // 验证 configure 方法中是否调用了 builder.sources(DemoApplication.class)
        verify(builderSpy).sources(DemoApplication.class);
    }
}
