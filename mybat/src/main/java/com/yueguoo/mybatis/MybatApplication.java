package com.yueguoo.mybatis;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = {"com.yueguoo.mybatis.mapper"})
@EnableDiscoveryClient
public class MybatApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatApplication.class, args);
    }

}
