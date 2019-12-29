package com.brian.sprbootdemo.controller;

import com.brian.sprbootdemo.config.AppProperties;
import com.brian.sprbootdemo.config.AppPropertiesConf;
import com.brian.sprbootdemo.config.GlobalProperty;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;
/**
 * Created by Brian in 18:02 2018/5/5
 */
@Controller
public class WelcomController {
    private static final Logger log = Logger.getLogger(WelcomController.class);

    private AppProperties app;
    private GlobalProperty globalProperty;
    private AppPropertiesConf appConf;

    @Autowired
    public void setApp(AppProperties app){
        this.app = app;
    }

    @Autowired
    public void setGlobalProperty(GlobalProperty globalProperty){
        this.globalProperty = globalProperty;
    }

    @Autowired
    public void setAppConf(AppPropertiesConf appConf){
        this.appConf = appConf;
    }

    @RequestMapping("/web/welcome")
    public String welcome(Map<String, Object> model){
        String appPropertis = app.toString();
        String globalPropertis = globalProperty.toString();

        log.info(appConf.toString());
        log.info("welcome "+appPropertis+"\n"+globalPropertis);

        model.put("message", appPropertis+globalPropertis);

        return "welcome";
    }



}
