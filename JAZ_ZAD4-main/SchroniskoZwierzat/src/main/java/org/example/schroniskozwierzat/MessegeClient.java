package org.example.schroniskozwierzat;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "AnimalService", url = "http://localhost:8081")
public interface MessegeClient {
    @GetMapping("/test")
    String test();


}