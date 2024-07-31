package com.example.test;

import com.example.builder.Computer;

public class ComputerTest {
    public static void main(String[] args) {
        // Create a high-end gaming computer
        Computer gamingPC = new Computer.Builder()
                .setCPU("Intel i9")
                .setRAM("32GB")
                .setStorage("1TB")
                .setGraphicsCard("NVIDIA RTX 3080")
                .setSSD(true)
                .build();

        // Create a basic office computer
        Computer officePC = new Computer.Builder()
                .setCPU("Intel i5")
                .setRAM("8GB")
                .setStorage("500GB")
                .setSSD(false)
                .build();

        // Print the details of both computers
        System.out.println("Gaming PC: " + gamingPC);
        System.out.println("Office PC: " + officePC);
    }
}
