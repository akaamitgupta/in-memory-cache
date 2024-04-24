package org.example;

import org.example.cache.Cache;
import org.example.factory.CacheFactory;

public class Main {
    public static void main(String[] args) {
        Cache<Integer, String> decoratedLruCache = CacheFactory.createDecoratedLRUCache(5);
        Cache<Integer, Integer> decoratedLfuCache = CacheFactory.createDecoratedLFUCache(5);

        decoratedLruCache.put(1, "One");
        System.out.println(decoratedLruCache.get(1));

        decoratedLfuCache.put(2, 2000);
        System.out.println(decoratedLfuCache.get(2));
    }
}
