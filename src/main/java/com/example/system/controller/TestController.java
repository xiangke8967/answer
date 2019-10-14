package com.example.system.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.util.Date;

/**
 * @author xk
 * @date 2019-10-13 18:56
 */
@RestController
public class TestController {

    @RequestMapping("/test")
    public String hello(Model m){
        m.addAttribute("now", DateFormat.getDateTimeInstance().format(new Date()));
        return "test";  //视图重定向test.jsp
    }
}
