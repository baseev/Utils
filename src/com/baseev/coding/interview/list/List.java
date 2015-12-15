package com.baseev.coding.interview.list;

import java.util.Arrays;

public class List<E>
{
    private int size = 0;
    private static int DEFAULT_CAPACITY = 10;
    private Object elements[];
    
    public List() {
        elements = new Object[DEFAULT_CAPACITY];
    }
    
    public void add(Object elemtent) {
        if(size == elements.length) {
            ensureCapacity();
        }
        elements[size++] = elemtent;
    }
    
    public E get(int i) {
        if(i>size || i<0) {
            throw new IndexOutOfBoundsException("Exception");
        }
        return (E) elements[i];
    }
    
    
    private void ensureCapacity() {
        int newSize = size * 2;
        elements = Arrays.copyOf(elements, newSize);
    }
}
