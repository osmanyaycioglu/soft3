package com.training.ykb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class MyRestController {

    @Autowired
    private MyUsingBean mub;

    @GetMapping("/hello")
    public String hello() {
        return "Hello world";
    }

}
