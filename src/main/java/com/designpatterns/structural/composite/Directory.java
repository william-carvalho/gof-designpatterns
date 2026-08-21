package com.designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Composite that contains files or other directories.
 */
public class Directory implements FileSystemItem {

    private final String name;
    private final List<FileSystemItem> children = new ArrayList<FileSystemItem>();

    public Directory(String name) {
        this.name = name;
    }

    public void add(FileSystemItem item) {
        children.add(item);
    }

    @Override
    public void display(String indentation) {
        System.out.println(indentation + "+ " + name);

        for (FileSystemItem child : children) {
            child.display(indentation + "  ");
        }
    }
}
