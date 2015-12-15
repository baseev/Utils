package com.baseev.coding.interview.stack_queue;

import java.util.Arrays;

public class StackArray<E>
{
    private int size = 0;
    private int DEFALUT_CAPACITY = 10;
    private Object elements[];
    
    public StackArray() {
        elements = new Object[DEFALUT_CAPACITY];
    }
    
    public void push(E e) {
        if(size == elements.length) {
            ensureCapacity();
        }
        elements[size++] = e;
    }
    
    public E pop() {
        E e = (E) elements[--size];
        elements[size] = null;
        return e;
    }
    
    public int size() {
        return size;
    }

    private void ensureCapacity() {
        int newSize = size * DEFALUT_CAPACITY;
        elements = Arrays.copyOf(elements, newSize);
    }
}
