package com.training.dozero.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PageLoadTestController {

    @RequestMapping(value = "/t1", method = RequestMethod.GET)
    public String test1(){
        System.out.println("반응1");
        return "test1";
    }

}
