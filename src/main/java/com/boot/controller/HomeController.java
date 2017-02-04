package com.boot.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by oscar.castillo on 13/01/2017.
 */
@RestController
@RequestMapping("/")
public class HomeController {


    @RequestMapping(method = RequestMethod.GET)
    public String home() {
        return "Das Boot, reporting for duty!";
    }
}
