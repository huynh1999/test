package com.example.demo;


import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/test")
    String test()
    {
        System.out.println("Test ok!!");
        return "OKK";
    }
}
