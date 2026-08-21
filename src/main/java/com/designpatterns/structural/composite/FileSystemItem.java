package com.designpatterns.structural.composite;

/**
 * Component shared by individual files and directories.
 */
public interface FileSystemItem {

    void display(String indentation);
}
