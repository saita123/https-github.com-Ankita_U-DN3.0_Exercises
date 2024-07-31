package com.example.service;

import com.example.repository.CustomerRepository;

public class CustomerService {
    private CustomerRepository customerRepository;

    // Constructor injection
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public String getCustomerInfo(int id) {
        return customerRepository.findCustomerById(id);
    }
}