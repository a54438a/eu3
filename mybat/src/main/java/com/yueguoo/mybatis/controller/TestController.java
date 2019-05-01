package com.yueguoo.mybatis.controller;

import com.yueguoo.mybatis.mapper.CustomerMapper;
import com.yueguoo.mybatis.pojo.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author shkstart
 * @create 2019-04-27 13:03
 */
@RestController
public class TestController implements TestControllerI {
    @Autowired
    CustomerMapper customerMapper;

    @Override
    @GetMapping("/aabb")
    public List<Customer> testshow() throws InterruptedException {

    List<Customer> customers = customerMapper.selectAll();
        System.out.println("mybat1");
    return  customers;
   /*     Customer customer = new Customer();
        customer.setCust_id(9l);

        Customer customer1 = customerMapper.selectOne(customer);
        return customer1;*/
    }

    @Override
    @GetMapping("/getOne/{id}")
    public Customer testshow2(@PathVariable String id) {

        Customer customer = new Customer();
        customer.setCust_id(Long.parseLong(id));

        Customer customer1 = customerMapper.selectOne(customer);
        return customer1;
    }
}
