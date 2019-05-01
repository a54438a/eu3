package com.yueguoo.zuuldemo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
@EnableDiscoveryClient
public class Zuuldemo2Application {

    public static void main(String[] args) {
        SpringApplication.run(Zuuldemo2Application.class, args);
    }

}
