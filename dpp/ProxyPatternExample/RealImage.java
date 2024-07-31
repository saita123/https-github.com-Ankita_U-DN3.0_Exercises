package com.example.proxy;

public class RealImage implements Image {
    private String imageName;

    public RealImage(String imageName) {
        this.imageName = imageName;
        loadImageFromServer();
    }

    private void loadImageFromServer() {
        System.out.println("Loading image: " + imageName + " from server.");
    }

    @Override
    public void display() {
        System.out.println("Displaying image: " + imageName);
    }
}