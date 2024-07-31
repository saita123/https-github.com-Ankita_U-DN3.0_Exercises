package com.example.decorator;

public class SlackNotifierDecorator extends NotifierDecorator {
    public SlackNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message); // Send via email first
        sendSlack(message); // Then send via Slack
    }

    private void sendSlack(String message) {
        System.out.println("Sending Slack message with content: " + message);
    }
}