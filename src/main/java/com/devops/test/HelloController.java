package com.devops.test;

import org.springframework.web.bind.annotation.*;
@RequestMapping("/hello")
@RestController
public class HelloController {
@GetMapping
    public String helloWorld(){
        return "hello aws";
    }
}
