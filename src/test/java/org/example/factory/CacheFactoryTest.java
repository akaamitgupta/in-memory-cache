package org.example.factory;

import org.example.cache.Cache;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CacheFactoryTest {
    @Test
    public void testCreateDecoratedLRUCache() {
        Cache<Integer, String> decoratedCache = CacheFactory.createDecoratedLRUCache(2);
        decoratedCache.put(1, "One");
        assertEquals("One", decoratedCache.get(1));
    }

    @Test
    public void testCreateDecoratedLFUCache() {
        Cache<Integer, String> decoratedCache = CacheFactory.createDecoratedLFUCache(2);
        decoratedCache.put(1, "One");
        assertEquals("One", decoratedCache.get(1));
    }
}
