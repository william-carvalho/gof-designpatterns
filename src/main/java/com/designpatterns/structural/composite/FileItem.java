package com.designpatterns.structural.composite;

/**
 * Leaf that cannot contain other file-system items.
 */
public class FileItem implements FileSystemItem {

    private final String name;

    public FileItem(String name) {
        this.name = name;
    }

    @Override
    public void display(String indentation) {
        System.out.println(indentation + "- " + name);
    }
}
