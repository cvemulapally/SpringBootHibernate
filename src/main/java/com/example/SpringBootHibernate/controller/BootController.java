package com.example.SpringBootHibernate.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class BootController {

    @RequestMapping(value = "/test")
    public String printMessage(){

        return "This is a test";
    }
}
