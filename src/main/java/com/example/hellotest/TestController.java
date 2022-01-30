package com.example.hellotest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
class Controller {
    @GetMapping
    public String printTest(){
        return "Hello Test is Succefull";
    }
}
