package com.brian.sprbootdemo.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Service;

/**
 * Created by Brian in 17:19 2018/5/5
 */

@Service
public class HelloMessageService {

    @Value("${name:unknown}")
    private String name;

    public String getMessage(){
        return getMessage(name);
    }

    public String getMessage(String name) {
        return "hello " +name;
    }


}
