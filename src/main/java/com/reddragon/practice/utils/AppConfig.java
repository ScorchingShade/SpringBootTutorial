package com.reddragon.practice.utils;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppConfig {

    @RequestMapping("/index")
    public String indexLoader() {
        return "hello world!";
    }
}
