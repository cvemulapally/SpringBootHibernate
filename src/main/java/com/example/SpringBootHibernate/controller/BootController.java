package com.example.SpringBootHibernate.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by E082557 on 6/7/2018.
 */
@RestController
public class BootController {

    @RequestMapping(value = "/test")
    public String printMessage(){

        return "This is a test";
    }
}
