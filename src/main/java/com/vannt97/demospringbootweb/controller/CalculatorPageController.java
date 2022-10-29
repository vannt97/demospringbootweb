package com.vannt97.demospringbootweb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorPageController {

    @GetMapping("/plus")
    public String sum(@RequestParam("num1") int num1, @RequestParam("num2") int num2){
        int sumT = num1 + num2;
        return "hello dude: " + sumT;
    }
}
