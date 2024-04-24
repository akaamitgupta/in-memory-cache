package org.example.cache;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K, V> implements Cache<K, V> {
    private Map<K, V> cache;

    public LRUCache(int capacity) {
        this.cache = new LinkedHashMap<>(capacity, 0.75f, true) {
            @Override
            protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
                return size() > capacity;
            }
        };
    }

    @Override
    public void put(K key, V value) {
        cache.put(key, value);
    }

    @Override
    public V get(K key) {
        return cache.get(key);
    }
}
