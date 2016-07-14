package com.dahfhsd.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by lenovo on 2016/7/14.
 */
@Controller
public class IndexController {
    @RequestMapping("/")
    public String inde(){
        return "hello";
    }
}
