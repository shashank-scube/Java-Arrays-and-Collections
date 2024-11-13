import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        // 1. Creating a HashMap
        Map<String, String> map = new HashMap<>();

        // 2. Adding key-value pairs to the map
        map.put("Apple", "Red");
        map.put("Banana", "Yellow");
        map.put("Cherry", "Red");
        map.put("Date", "Brown");

        System.out.println("Initial Map: " + map);

        // 3. Adding a key-value pair with an existing key (value gets updated)
        map.put("Apple", "Green");
        System.out.println("After updating 'Apple': " + map);

        // 4. Checking if a key or value exists
        System.out.println("Contains key 'Banana': " + map.containsKey("Banana"));
        System.out.println("Contains value 'Red': " + map.containsValue("Red"));

        // 5. Retrieving a value by key
        System.out.println("Value for 'Cherry': " + map.get("Cherry"));

        // 6. Removing a key-value pair
        map.remove("Date");
        System.out.println("After removing 'Date': " + map);

        // 7. Checking the size of the map
        System.out.println("Size of the Map: " + map.size());

        // 8. Checking if the map is empty
        System.out.println("Is the Map empty? " + map.isEmpty());

        // 9. Iterating over the Map using entrySet()
        System.out.println("Iterating over the Map:");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // 10. Getting all the keys and values
        System.out.println("Keys in the Map: " + map.keySet());
        System.out.println("Values in the Map: " + map.values());

        // 11. Clearing all entries from the map
        map.clear();
        System.out.println("Map after clearing: " + map);

        // 12. Checking if the map is empty after clearing
        System.out.println("Is the Map empty now? " + map.isEmpty());
    }
}

