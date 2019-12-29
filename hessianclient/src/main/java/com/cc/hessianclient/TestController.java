package com.cc.hessianclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    HelloService helloService;

    @RequestMapping("/hello")
    String hello(){
       return helloService.sayHello("cuichao");
    }
}
