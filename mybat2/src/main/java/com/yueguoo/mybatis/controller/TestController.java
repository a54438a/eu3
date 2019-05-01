package com.yueguoo.mybatis.controller;

import com.yueguoo.mybatis.mapper.CustomerMapper;
import com.yueguoo.mybatis.pojo.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author shkstart
 * @create 2019-04-27 13:03
 */
@RestController
public class TestController {
    @Autowired
    CustomerMapper customerMapper;

    @GetMapping("/aabb")
    public List<Customer> testshow() {
    List<Customer> customers = customerMapper.selectAll();
        System.out.println("mybat2");
    return  customers;
   /*     Customer customer = new Customer();
        customer.setCust_id(9l);

        Customer customer1 = customerMapper.selectOne(customer);
        return customer1;*/
    }

    @GetMapping("/eeff")
    public String testshow2() {

        Customer customer = new Customer();
        customer.setCust_id(9l);

        Customer customer1 = customerMapper.selectOne(customer);
        return customer1.getCustName();
    }
}
