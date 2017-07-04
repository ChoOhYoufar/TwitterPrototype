package com.oh.springdemo.dao;

import com.oh.springdemo.entity.Customer;

import java.util.List;

/**
 * @author cho.oh
 */
public interface CustomerDAO {

    public List<Customer> getCustomers();

    public void saveCustomer(Customer theCustomer);
}
