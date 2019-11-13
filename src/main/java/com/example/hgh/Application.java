package com.example.hgh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@SpringBootApplication
public class Application {
    @RequestMapping("/")
    String hello(@RequestParam List<Map<String, String>> params) {
        return params.get(0).get("hello");
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
