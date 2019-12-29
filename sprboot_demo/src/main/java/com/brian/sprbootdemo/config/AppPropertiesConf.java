package com.brian.sprbootdemo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Brian in 17:46 2018/5/5
 */
@Component
@ConfigurationProperties // no preffix, find root level
public class AppPropertiesConf {
    private int threadPool;
    private String email;

    public int getThreadPool() {
        return threadPool;
    }

    public void setThreadPool(int threadPool) {
        this.threadPool = threadPool;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "AppPropertiesConf{" +
                "threadPool=" + threadPool +
                ", email='" + email + '\'' +
                '}';
    }
}
