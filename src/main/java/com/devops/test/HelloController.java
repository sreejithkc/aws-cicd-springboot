package com.devops.test;

import org.springframework.web.bind.annotation.*;
@RequestMapping("/hello")
@RestController
public class HelloController {

    public String helloWorld(){
        return "hello aws";
    }
}
