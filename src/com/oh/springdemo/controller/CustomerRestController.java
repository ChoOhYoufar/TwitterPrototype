package com.oh.springdemo.controller;

import com.oh.springdemo.entity.Customer;
import com.oh.springdemo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author cho.oh
 */
@CrossOrigin(origins = {"http://localhost:3000"})
@RestController
@RequestMapping("/customer")
public class CustomerRestController {
    @Autowired
    private CustomerService customerService;

    @GetMapping("/list")
    @ResponseBody
    public ResponseEntity<List<Customer>> listCustomers() {
        List<Customer> customers = customerService.getCustomers();
        return new ResponseEntity<List<Customer>>(customers, HttpStatus.OK);
    }
}
