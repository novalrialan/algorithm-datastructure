package Array.sample2;

import java.util.*;

/**
 * HashMap
 */
public class ArrayHashMap {

//     A HashMap is a data structure in Java that implements the Map interface. It stores data in key-value pairs, where each key is unique, and each key maps to a single value. HashMap is one of the most commonly used collections in Java due to its efficient retrieval and insertion operations.
// Key Characteristics of HashMap:

//     Key-Value Pairs:
//         A HashMap stores data as key-value pairs (K, V). You can use the key to retrieve the corresponding value efficiently.
//         Example: In a HashMap<String, Integer>, the keys are of type String, and the values are of type Integer.

//     Hashing Mechanism:
//         HashMap uses a hashing technique to store keys in buckets. The hash code of the key determines which bucket it will be placed in.
//         The hashing mechanism allows for quick insertion, deletion, and lookup operations, typically in constant time, O(1).

//     Unique Keys:
//         Each key in a HashMap must be unique. If you try to insert a duplicate key, the new value will replace the old value associated with that key.

//     Null Values and Keys:
//         HashMap allows one null key and multiple null values. This means you can store a null as a key or value in the map.

//     Unordered:
//         HashMap does not maintain the order of keys or values. The order in which keys are stored is not guaranteed and can change when rehashing occurs (for instance, after resizing).

//     Non-Synchronized:
//         By default, HashMap is not synchronized, which means it is not thread-safe. If multiple threads access a HashMap concurrently and at least one thread modifies it, there is a risk of inconsistent state. For thread safety, you can use Collections.synchronizedMap or use ConcurrentHashMap.

//     Performance:
//         The average time complexity for basic operations like get, put, remove, and containsKey is O(1) due to hashing. However, in the worst case, when many keys have the same hash code, the time complexity can degrade to O(n).

// Common Operations:

//     Insertion:
//         put(K key, V value): Adds a key-value pair to the map. If the key already exists, the old value is replaced.

//     Retrieval:
//         get(Object key): Returns the value associated with the specified key. If the key is not present, it returns null.

//     Deletion:
//         remove(Object key): Removes the key-value pair associated with the specified key.

//     Check for Existence:
//         containsKey(Object key): Checks if the map contains the specified key.
//         containsValue(Object value): Checks if the map contains one or more keys associated with the specified value.

//     Size:
//         size(): Returns the number of key-value pairs in the map.

//     Iteration:
//         keySet(), values(), and entrySet() allow you to iterate over keys, values, and key-value pairs, respectively.
  

    public static void main(String[] args) {
        
    // Create a Hashap dictionary
    HashMap<String, List<String>> countries = new HashMap<>();

    // create lists of countries
    List<String> G = List.of("Ghana", "Greenland", "Greece");


  


    // // Print the contents of the HashMap to verify
    // System.out.println(countries);

    List<String> I = List.of("India","Ireland","Iran","Iraq","Italy");


    List<String> U = List.of("United States","United Kingdom","Uruguay");

   
    // Add the list to the HashMap
    countries.put("G",G);
    countries.put("I", I);
    countries.put("U", U);

    List<String> result = countries.get("I");

    for (String country : result) {
        System.out.println(country);
    }

    countries.remove("I");
    System.out.println();

    // try to get
    System.out.println("Try to get value after deleting");
    System.out.println(countries.get("I"));
}
    
}