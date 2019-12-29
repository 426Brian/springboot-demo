package com.brian.sprbootdemo.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Created by Brian in 14:03 2018/5/4
 */
@Controller
public class WebWelcomeController {
    @Value("${welcome.message}")
    private String message;

    @RequestMapping("/webdemo")
    public String welcome(Map<String, Object> model) {
        model.put("message", this.message);
        return "welcome";
    }

    @RequestMapping("/ajax/demo")
    public String demo(){
        return "ajaxDemo";
    }

}
