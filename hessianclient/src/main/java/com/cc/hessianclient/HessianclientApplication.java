package com.cc.hessianclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.remoting.caucho.HessianProxyFactoryBean;

@SpringBootApplication
public class HessianclientApplication {

    public static void main(String[] args) {
        SpringApplication.run(HessianclientApplication.class, args);
    }

    @Bean
    public HessianProxyFactoryBean helloClient(){
        HessianProxyFactoryBean factoryBean = new HessianProxyFactoryBean();
        factoryBean.setServiceUrl("http://localhost:8080/hello/world/service");
        factoryBean.setServiceInterface(HelloService.class);
        return factoryBean;
    }

}
