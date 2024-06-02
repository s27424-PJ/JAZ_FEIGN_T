package org.example.schroniskozwierzat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SchroniskoZwierzatApplication {

    public static void main(String[] args) {
        SpringApplication.run(SchroniskoZwierzatApplication.class, args);
    }

}
