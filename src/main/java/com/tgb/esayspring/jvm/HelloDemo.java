package com.tgb.esayspring.jvm;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @title: springboot-essay
 * @description:
 * @author: 
 * @date: 2023/02/11 13:18
 */
@RestController
public class HelloDemo {
    @GetMapping("/hello")
    public  String hello(){
        System.out.println("test");
        return "hello Springboot";
    }
}
