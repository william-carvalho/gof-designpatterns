package com.designpatterns.structural.proxy;

public class Main {

    public static void main(String[] args) {
        Image image = new ImageProxy("photo.jpg");
        System.out.println("Proxy created. Image not loaded yet.");

        image.display();
        image.display();
    }
}
