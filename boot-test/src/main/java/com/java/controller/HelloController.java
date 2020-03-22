package com.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.java.entity.Person;

@Controller
public class HelloController {

    private Person person;

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "hello,id：" + person.getId() + ",name:" + person.getName();
    }
}
