package com.example.adapter;

public class StripeGateway {
    public void charge(double amount) {
        System.out.println("Processing payment through Stripe: $" + amount);
    }
}