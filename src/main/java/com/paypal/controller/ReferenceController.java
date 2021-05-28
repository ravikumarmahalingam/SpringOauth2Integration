package com.paypal.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReferenceController {
    @GetMapping("/display")
    public String display(){
        return "Hi this is Ravi";
    }
}