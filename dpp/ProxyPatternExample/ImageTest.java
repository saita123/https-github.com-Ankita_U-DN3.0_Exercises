package com.example.test;

import com.example.proxy.Image;
import com.example.proxy.ProxyImage;

public class ImageTest {
    public static void main(String[] args) {
        // Create ProxyImage instances
        Image image1 = new ProxyImage("photo1.jpg");
        Image image2 = new ProxyImage("photo2.jpg");

        // Display images
        // The image will be loaded from the server only on the first call
        image1.display();  // Loading and displaying
        image1.display();  // Displaying from cache
        image2.display();  // Loading and displaying
    }
}