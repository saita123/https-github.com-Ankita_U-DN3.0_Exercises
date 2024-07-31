package com.example.test;

import com.example.repository.CustomerRepository;
import com.example.repository.CustomerRepositoryImpl;
import com.example.service.CustomerService;

public class Main {
    public static void main(String[] args) {
        // Create repository
        CustomerRepository customerRepository = new CustomerRepositoryImpl();

        // Inject repository into service
        CustomerService customerService = new CustomerService(customerRepository);

        // Use the service to get customer info
        String customerInfo = customerService.getCustomerInfo(1);
        System.out.println(customerInfo);  // Output: Customer with ID: 1
    }
}