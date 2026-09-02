package com.designpatterns.structural.flyweight;

public class Main {

    public static void main(String[] args) {
        TreeTypeFactory factory = new TreeTypeFactory();

        TreeType firstOakType = factory.getTreeType("oak", "green");
        TreeType secondOakType = factory.getTreeType("oak", "green");
        TreeType pineType = factory.getTreeType("pine", "dark green");

        Tree firstTree = new Tree(10, 20, firstOakType);
        Tree secondTree = new Tree(30, 40, secondOakType);
        Tree thirdTree = new Tree(50, 60, pineType);

        firstTree.draw();
        secondTree.draw();
        thirdTree.draw();

        System.out.println("Shared tree types created: " + factory.getCreatedTypeCount());
        System.out.println("Do the oak trees share one type? "
                + (firstOakType == secondOakType));
    }
}
