package com.grand.dockerdemo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping
    public String hello() {
        return "Hello";
    }

    @GetMapping("/{name}")
    public String getHelloWithParam(@PathVariable String name) {
        return "Hello " + name;
    }
}
