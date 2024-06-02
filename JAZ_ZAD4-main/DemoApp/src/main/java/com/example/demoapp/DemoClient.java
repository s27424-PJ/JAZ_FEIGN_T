package com.example.demoapp;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "AnimalService", url = "http://localhost:8080")
public interface DemoClient {
    @GetMapping("/test")
    String testReq();


}