package com.apollo.thinkInJava;
public class ArrayOfGenericType<T> {
    T[] array;
    public ArrayOfGenericType (int size) {
        //! array = new T[size]; // Illegal
        array = (T[]) new Object[size];

    }

    public T[] test () {
        T[] t = (T[])new Object[10];
        t[0] = (T)new Object();
        return t;
    }
    //! public <U> U[]makeArray() { return new U[10]; }
}
