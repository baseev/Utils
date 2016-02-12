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
    	if(isEmpty()) {
    		throw new RuntimeException("You can't pop as stack is empty");
    	}
        E e = (E) elements[--size];
        elements[size] = null;
        return e;
    }
    
    public int size() {
        return size;
    }

    public boolean isEmpty() {
    	return size <= 0;
    }
    
    public void print() {
    	for(Object obj : elements) {
    		if(obj != null) {
    			System.out.println(obj);
    		}
    	}
    	System.out.println("\n\n");
    }
    
    
    private void ensureCapacity() {
        int newSize = size * DEFALUT_CAPACITY;
        elements = Arrays.copyOf(elements, newSize);
    }    
}
