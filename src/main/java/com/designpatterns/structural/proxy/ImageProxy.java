package com.designpatterns.structural.proxy;

/**
 * Virtual proxy that delays creation of the real image until it is needed.
 */
public class ImageProxy implements Image {

    private final String fileName;
    private RealImage realImage;

    public ImageProxy(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }

        realImage.display();
    }
}
