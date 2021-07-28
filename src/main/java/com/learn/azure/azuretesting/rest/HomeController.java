package com.learn.azure.azuretesting.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/hello")
    private String sayHi(){
        return "Your application is successfully deployed on Azure!";
    }
}
