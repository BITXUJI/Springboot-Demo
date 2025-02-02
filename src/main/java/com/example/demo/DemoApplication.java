package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * 启动类.
 * 
 * @author Simon Gallagher
 * @version 1.0
 */
@SpringBootApplication
public class DemoApplication extends SpringBootServletInitializer {

    /**
     * 启动方法.
     * 
     * @param args
     *            命令行参数
     */
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    /**
     * 配置启动类.
     * 
     * @param application
     *            SpringApplicationBuilder
     * @return SpringApplicationBuilder
     */
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(DemoApplication.class);
    }

}
