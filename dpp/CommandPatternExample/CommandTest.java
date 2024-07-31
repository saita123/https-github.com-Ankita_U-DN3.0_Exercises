package com.example.test;

import com.example.command.*;

public class CommandTest {
    public static void main(String[] args) {
        // Create the receiver
        Light light = new Light();

        // Create commands
        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);

        // Create invoker
        RemoteControl remote = new RemoteControl();

        // Test turning the light on
        remote.setCommand(lightOn);
        remote.pressButton();

        // Test turning the light off
        remote.setCommand(lightOff);
        remote.pressButton();
    }
}