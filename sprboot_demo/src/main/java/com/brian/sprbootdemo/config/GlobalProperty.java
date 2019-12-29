package com.brian.sprbootdemo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * Created by Brian in 17:41 2018/5/5
 */
@Component
@PropertySource("classpath:/static/properties/global.properties")
public class GlobalProperty {

    @Value("${thread-pool}")
    private int threadPool;

    @Value("${email}")
    private String email;

    @Override
    public String toString() {
        return "GlobalProperty{" +
                "threadPool=" + threadPool +
                ", email='" + email + '\'' +
                '}';
    }
}
