package org.example.cache;

import java.util.HashMap;
import java.util.Map;

public class LFUCache<K, V> implements Cache<K, V> {
    private int capacity;
    private Map<K, V> cache;

    public LFUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new HashMap<>();
    }

    @Override
    public void put(K key, V value) {
        // implement main logic for LFU
        cache.put(key, value);
    }

    @Override
    public V get(K key) {
        // implement main logic for LFU
        return cache.get(key);
    }
}
