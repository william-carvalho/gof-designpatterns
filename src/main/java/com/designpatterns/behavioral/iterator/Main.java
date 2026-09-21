package com.designpatterns.behavioral.iterator;

public class Main {

    public static void main(String[] args) {
        BookCollection books = new BookCollection();
        books.addBook("Design Patterns");
        books.addBook("Clean Code");
        books.addBook("Effective Java");

        Iterator<String> iterator = books.createIterator();

        while (iterator.hasNext()) {
            System.out.println("Book: " + iterator.next());
        }
    }
}
