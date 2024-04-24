### In-Memory Cache System Implementation

I've implemented an in-memory cache system designed to support various eviction policies and data types, with a fresh perspective on design patterns and SOLID principles. Additionally, I've included unit test cases to ensure reliability.

#### Key Features:

- **Comprehensive Cache**: Offers a unified `Cache` interface accommodating different cache implementations like `LRUCache` and `LFUCache`, supporting various eviction policies.
- **Strategy Pattern**: Eviction policies are implemented separately, allowing seamless switching between LRU and LFU strategies without code redundancy.
- **Decorator Pattern**: The `CacheDecorator` class enhances functionality, such as logging or metric reporting, for any cache implementation without altering its core logic, promoting code reusability.
- **DRY Principle**: Avoids code duplication by employing the Decorator pattern to add behavior before the `get()` operation, ensuring maintainability.
- **Enhanced Extendability**: The `CacheFactory` class simplifies the creation of decorated cache instances, facilitating the addition of new cache implementations or decorators without modifying existing code.
