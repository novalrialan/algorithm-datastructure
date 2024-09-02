package Array.sample2;

import java.util.HashMap;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
      HashMap<String, Integer> map = new HashMap<>();

        // Add key-value pairs to the HashMap
        map.put("Apple", 3);
        map.put("Banana", 5);
        map.put("Orange", 2);

        // Retrieve a value based on key
        int quantity = map.get("Apple"); // returns 3

        // Check if a key exists
        boolean hasBanana = map.containsKey("Banana"); // returns true

        // Remove a key-value pair
        map.remove("Orange");

        // Iterate over keys
        for (String key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }

    }


}