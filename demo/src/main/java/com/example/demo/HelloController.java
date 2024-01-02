package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping(method = RequestMethod.GET)
    public String sayHello(Model model) {
        model.addAttribute("message", "Hello, Spring MVC!");
        return "hello";
    }

    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public String sayHelloToPerson(@PathVariable String name, Model model) {
        model.addAttribute("message", "Hello, " + name + "!");
        return "hello";
    }
}
