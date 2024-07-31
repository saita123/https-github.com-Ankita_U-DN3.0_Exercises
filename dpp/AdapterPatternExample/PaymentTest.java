package com.example.test;

import com.example.adapter.PayPalAdapter;
import com.example.adapter.StripeAdapter;
import com.example.adapter.PaymentProcessor;
import com.example.adapter.PayPalGateway;
import com.example.adapter.StripeGateway;

public class PaymentTest {
    public static void main(String[] args) {
        // Create PayPal gateway and adapter
        PayPalGateway payPalGateway = new PayPalGateway();
        PaymentProcessor payPalProcessor = new PayPalAdapter(payPalGateway);

        // Create Stripe gateway and adapter
        StripeGateway stripeGateway = new StripeGateway();
        PaymentProcessor stripeProcessor = new StripeAdapter(stripeGateway);

        // Process payments using the adapters
        payPalProcessor.processPayment(100.0);
        stripeProcessor.processPayment(200.0);
    }
}