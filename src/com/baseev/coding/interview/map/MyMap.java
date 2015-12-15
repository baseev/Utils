package com.baseev.coding.interview.map;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MyMap<K, V>
{
    private int size = 0;
    private int DEFAULT_CAPACITY = 16;
    @SuppressWarnings("unchecked")
    private MapEntry<K, V>[] entry = new MapEntry[DEFAULT_CAPACITY];
  
    public V get(K key) {
        for(int i=0; i<size; i++) {
            if(entry[i].getKey().equals(key)) {
                return entry[i].getValue();
            }
        }
        return null;
    }
    
    public void put(K key, V value) {
        boolean flag = true;
        for(int i=0; i<size; i++) {
            if(entry[i].getKey().equals(key)) {
                entry[i].setValue(value);
                flag = false;
            }
        }
        if(flag) {
            ensureCapacity();
            entry[size++] = new MapEntry<K, V>(key, value);
        }
    }
    
    public int size() {
        return size;
    }
    
    private void ensureCapacity() {
        if(size == entry.length) {
            int newSize = size * 2;
            entry = Arrays.copyOf(entry, newSize);
        }
    }
    
    public Set<K> getKeyset() {
        Set<K> set = new HashSet<K>();
        for(int i=0; i<size; i++) {
            set.add(entry[i].getKey());
        }
        return set;
    }
    
    public Set<V> getValueset() {
        Set<V> set = new HashSet<V>();
        for(int i=0; i<size; i++) {
            set.add(entry[i].getValue());
        }
        return set;
    }
    
}
