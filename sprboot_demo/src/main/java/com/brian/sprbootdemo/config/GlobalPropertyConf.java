package com.brian.sprbootdemo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * Created by Brian in 17:45 2018/5/5
 */
@Component
@PropertySource("classpath:/static/properties/global.properties")
@ConfigurationProperties
public class GlobalPropertyConf {
    private String email;
    private int threadPool;
}
