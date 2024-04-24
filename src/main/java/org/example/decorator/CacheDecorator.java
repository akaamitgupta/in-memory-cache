package org.example.decorator;

import org.example.cache.Cache;

public class CacheDecorator<K, V> implements Cache<K, V> {
    private Cache<K, V> cache;

    public CacheDecorator(Cache<K, V> cache) {
        this.cache = cache;
    }

    @Override
    public void put(K key, V value) {
        cache.put(key, value);
    }

    @Override
    public V get(K key) {
        System.out.println("Additional code executed before get operation.");

        return cache.get(key);
    }
}
