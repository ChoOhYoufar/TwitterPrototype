package com.oh.springdemo.service;

import com.oh.springdemo.entity.Customer;

import java.util.List;

/**
 * @author cho.oh
 */
public interface CustomerService {
    public List<Customer> getCustomers();

    public void saveCustomer(Customer theCustomer);
}
