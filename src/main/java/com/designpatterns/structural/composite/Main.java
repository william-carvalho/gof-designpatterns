package com.designpatterns.structural.composite;

public class Main {

    public static void main(String[] args) {
        Directory project = new Directory("project");
        project.add(new FileItem("README.md"));

        Directory source = new Directory("src");
        source.add(new FileItem("Main.java"));
        source.add(new FileItem("Application.java"));

        project.add(source);
        project.display("");
    }
}
