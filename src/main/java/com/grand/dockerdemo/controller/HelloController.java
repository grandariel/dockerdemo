package com.grand.dockerdemo.controller;

import com.grand.dockerdemo.model.HelloResource;
import com.grand.dockerdemo.repository.HelloRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/hello")
public class HelloController {
    private final HelloRepository helloRepository;

    @GetMapping
    public List<HelloResource> hello() {
        return helloRepository.findAll();
    }

    @GetMapping("/{name}")
    public String getHelloWithParam(@PathVariable String name) {
        return "Hello " + name;
    }

    @PostMapping("/{message}")
    public HelloResource postHelloMessage(@PathVariable String message) {
        HelloResource helloResource = HelloResource.builder().message(message).build();
        helloRepository.save(helloResource);
        return helloResource;
    }
}
