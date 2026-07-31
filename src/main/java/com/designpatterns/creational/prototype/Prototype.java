package com.designpatterns.creational.prototype;

/**
 * Contract for objects that can create a copy of themselves.
 */
public interface Prototype<T> {

    T copy();
}
