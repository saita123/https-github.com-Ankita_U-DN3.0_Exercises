package com.example.test;

import com.example.decorator.EmailNotifier;
import com.example.decorator.SMSNotifierDecorator;
import com.example.decorator.SlackNotifierDecorator;
import com.example.decorator.Notifier;

public class NotificationTest {
    public static void main(String[] args) {
        // Create an EmailNotifier instance
        Notifier emailNotifier = new EmailNotifier();

        // Decorate with SMSNotifier
        Notifier smsNotifier = new SMSNotifierDecorator(emailNotifier);

        // Further decorate with SlackNotifier
        Notifier slackNotifier = new SlackNotifierDecorator(smsNotifier);

        // Send a message using all decorated notifiers
        slackNotifier.send("Hello, this is a test message!");
    }
}