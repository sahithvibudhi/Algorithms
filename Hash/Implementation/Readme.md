# HashTable implementation

This is just a basic Hashtable implementation in Java that can store Integer key, value pairs. Similar logic can be used to store any key, value pairs

HashTable uses a hashfunction to store key value pairs in an array for faster fetch times

Fetch time complexity of HashTable: `O(1)`

### Hash Function:
This uses a simple hash function: `key % size(table)`

### Collision handling:
This algorithm uses Chaining. Open addressing techniques like:
- Linear probing
- Quadratic probing
- Double hasing 

can be used to maintain better Fetch Time complexity