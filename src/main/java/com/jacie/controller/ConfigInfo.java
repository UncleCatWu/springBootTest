package com.jacie.controller;

import com.jacie.domain.CustomConfigInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jacie on 11/3/16.
 */
@RestController
public class ConfigInfo {

    @Value("${test.msg}")
    private String msg;

    @Autowired
    private Environment environment;

    @Autowired
    private CustomConfigInfo customConfig;

    @RequestMapping(value = "index")
    public String index() {
        return "Hello World SpringBoot!";
    }

    @RequestMapping(value = "testValue")
    public String testValue() {
        return "according to the method of Value which get the value of test.msg :" + msg;
    }

    @RequestMapping(value = "testEnv")
    public String testEnv() {
        return "according to the method of Environment which get the value of test.msg:" + environment.getProperty("test.msg");
    }

    @RequestMapping(value = "customConfig")
    public String customConfig() {
        return "customConfig name is :" + customConfig.getName() + "\n" + "customConfig age is :" + customConfig.getAge();
    }
}
