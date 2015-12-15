package com.baseev.coding.interview.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRU<K, V> 
    extends LinkedHashMap<K, V>
{
    private int capacity;
    
    public LRU(int capacity) {
        super(16, 0.75f, true);
        this.capacity = capacity;
    }
    
    @Override
    public boolean removeEldestEntry(Map.Entry<K,V> eldest) {
        return size() >= capacity;
    }
}
