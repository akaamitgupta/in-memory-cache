package org.example.factory;

import org.example.cache.Cache;
import org.example.cache.LFUCache;
import org.example.cache.LRUCache;
import org.example.decorator.CacheDecorator;

public class CacheFactory {
    public static <K, V> Cache<K, V> createDecoratedLRUCache(int capacity) {
        return new CacheDecorator<>(new LRUCache<>(capacity));
    }

    public static <K, V> Cache<K, V> createDecoratedLFUCache(int capacity) {
        return new CacheDecorator<>(new LFUCache<>(capacity));
    }
}
