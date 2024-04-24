package org.example.cache;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LFUCacheTest {

    @Test
    public void testPutAndGet() {
        Cache<Integer, String> cache = new LFUCache<>(2);
        cache.put(1, "One");
        cache.put(2, "Two");
        assertEquals("One", cache.get(1));
        assertEquals("Two", cache.get(2));
    }
}
