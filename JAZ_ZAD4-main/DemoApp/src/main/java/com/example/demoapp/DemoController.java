package com.example.demoapp;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class DemoController {

    @GetMapping("/test")
    public String testReq() {
        return "test";
    }
}