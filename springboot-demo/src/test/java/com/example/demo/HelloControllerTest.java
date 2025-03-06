package com.example.demo;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

/**
 * HelloController 测试类.
 */
@SpringBootTest
@AutoConfigureMockMvc
class HelloControllerTest {

    @Autowired
    private MockMvc mockMvc;

    /**
     * 测试访问 /hello.
     * 预期返回状态码 200，视图名称为 "hello"，
     * 模型中包含 message="Hello, Spring MVC!"
     */
    @Test
    void testSayHello() throws Exception {
        mockMvc.perform(get("/hello"))
                .andExpect(status().isOk())
                .andExpect(view().name("hello"))
                .andExpect(model().attribute("message", "Hello, Spring MVC!"));
    }

    /**
     * 测试访问 /hello/name.
     * 预期返回状态码 200，视图名称为 "hello"，
     * 模型中包含 message="Hello, name!"
     */
    @Test
    void testSayHelloToPerson() throws Exception {
        final String name = "John";
        mockMvc.perform(get("/hello/" + name))
                .andExpect(status().isOk())
                .andExpect(view().name("hello"))
                .andExpect(model().attribute("message", "Hello, " + name + "!"));
    }
}
