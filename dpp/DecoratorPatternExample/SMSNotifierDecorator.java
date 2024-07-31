package com.example.decorator;

public class SMSNotifierDecorator extends NotifierDecorator {
    public SMSNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message); // Send via email first
        sendSMS(message);    // Then send via SMS
    }

    private void sendSMS(String message) {
        System.out.println("Sending SMS with message: " + message);
    }
}