package com.yueguoo.mybatis.controller;

import com.yueguoo.mybatis.pojo.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * @author shkstart
 * @create 2019-04-29 12:20
 */
public interface TestControllerI extends aabb {
    @GetMapping("/aabb")
    List<Customer> testshow() throws InterruptedException;

    @GetMapping("/getOne/{id}")
    Customer testshow2(@PathVariable String id);
}
