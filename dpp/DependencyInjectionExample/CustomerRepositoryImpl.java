package com.example.repository;

public class CustomerRepositoryImpl implements CustomerRepository {
    @Override
    public String findCustomerById(int id) {
        // Simulate fetching customer data
        return "Customer with ID: " + id;
    }
}