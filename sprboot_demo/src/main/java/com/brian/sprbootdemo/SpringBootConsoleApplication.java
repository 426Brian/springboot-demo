package com.brian.sprbootdemo;

import com.brian.sprbootdemo.service.HelloMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * Created by Brian in 14:32 2018/5/5
 */
//@SpringBootApplication
public class SpringBootConsoleApplication implements CommandLineRunner {
    @Autowired
    private HelloMessageService helloService;

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(SpringBootConsoleApplication.class);
        // 不显示 SpringBoot 启动后的 banner
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
    }

    @Override
    public void run(String... args) throws Exception {
        if (args.length > 0) {
            System.out.println("====== " + helloService.getMessage(args[0].toString()));
        } else {
            System.out.println("====== " + helloService.getMessage());
        }

        System.exit(0);
    }
}
