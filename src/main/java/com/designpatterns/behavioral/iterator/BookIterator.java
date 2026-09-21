package com.designpatterns.behavioral.iterator;

import java.util.NoSuchElementException;

/**
 * Concrete iterator that tracks the current traversal position.
 */
public class BookIterator implements Iterator<String> {

    private final BookCollection collection;
    private int position;

    public BookIterator(BookCollection collection) {
        this.collection = collection;
    }

    @Override
    public boolean hasNext() {
        return position < collection.size();
    }

    @Override
    public String next() {
        if (!hasNext()) {
            throw new NoSuchElementException("There are no more books.");
        }

        String book = collection.getBookAt(position);
        position++;
        return book;
    }
}
