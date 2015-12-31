package com.baseev.coding.interview.map;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

public class MyLRU<Key, Value>
{

    private final int maxSize;
    private ConcurrentHashMap<Key, Value> map;
    private ConcurrentLinkedQueue<Key> queue;
    
    public MyLRU(int size){
        maxSize = size;
        map = new ConcurrentHashMap<Key, Value>(maxSize);
        queue = new ConcurrentLinkedQueue<Key>();
    }

    public void put(final Key key, final Value value) {
        if(map.containsKey(key)) {
            queue.remove(key);
        }
        
        while(queue.size() >= maxSize) {
            Key oldestKey = queue.poll();
            if(oldestKey != null) {
                map.remove(oldestKey);
                queue.remove(oldestKey);
            }
        }
        
        queue.add(key);
        map.put(key, value);
    }
    
    public Value get(final Key key) {
        return map.get(key);
    }
}
