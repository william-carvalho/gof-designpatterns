package com.designpatterns.behavioral.iterator;

/**
 * Aggregate whose internal array is hidden from clients.
 */
public class BookCollection {

    private final String[] books = new String[10];
    private int size;

    public void addBook(String title) {
        if (size == books.length) {
            throw new IllegalStateException("The book collection is full.");
        }

        books[size] = title;
        size++;
    }

    public Iterator<String> createIterator() {
        return new BookIterator(this);
    }

    int size() {
        return size;
    }

    String getBookAt(int index) {
        return books[index];
    }
}
