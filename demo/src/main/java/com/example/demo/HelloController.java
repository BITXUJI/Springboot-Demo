package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@RequestMapping("/hello")
public class HelloController {

    @GetMapping
    public String sayHello(Model model) {
        model.addAttribute("message", "Hello, Spring MVC!");
        return "hello";
    }

    @GetMapping("/{name}")
    public String sayHelloToPerson(@PathVariable String name, Model model) {
        model.addAttribute("message", "Hello, " + name + "!");
        return "hello";
    }
}
