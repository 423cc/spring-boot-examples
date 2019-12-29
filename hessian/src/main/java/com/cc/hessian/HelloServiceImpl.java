package com.cc.hessian;

import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        System.out.println("hello world:"+name);
        return "hellworld"+name;
    }
}
