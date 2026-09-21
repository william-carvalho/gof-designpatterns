package com.designpatterns.behavioral.iterator;

/**
 * Iterator interface for traversing elements one at a time.
 */
public interface Iterator<T> {

    boolean hasNext();

    T next();
}
