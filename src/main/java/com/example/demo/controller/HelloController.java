package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * HelloController.
 *
 * @author Simon Gallagher
 * @version 1.0
 */
@Controller
@RequestMapping("/hello")
public class HelloController {
    /**
     * 默认视图名称.
     */
    private static final String VIEW_NAME = "hello";

    /**
     * 默认模型键.
     */
    private static final String VIEW_KEY = "message";
    /**
     * 默认消息.
     */
    private static final String MESSAGE = "Hello, Spring MVC!";
    /**
     * 默认消息.
     */
    private static final String MESSAGE_TO_PERSON = "Hello, %s!";

    /**
     * 默认访问.
     * 
     * @param model
     *            模型
     * @return "hello"
     */
    @GetMapping
    public String sayHello(Model model) {
        model.addAttribute(VIEW_KEY, MESSAGE);
        return VIEW_NAME;
    }

    /**
     * 访问 /hello/{name}.
     * 
     * @param name
     *            名字
     * @param model
     *            模型
     * @return "hello"
     */
    @GetMapping("/{name}")
    public String sayHelloToPerson(@PathVariable String name, Model model) {
        model.addAttribute(VIEW_KEY, String.format(MESSAGE_TO_PERSON, name));
        return VIEW_NAME;
    }
}
