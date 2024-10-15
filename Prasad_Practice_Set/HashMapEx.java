import java.util.HashMap;
import java.util.Map;

public class HashMapEx {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // Add key-value pairs
        map.put("Apple", 3);
        map.put("Banana", 2);
        map.put("Mango", 5);
        map.put("Orange", 4);

        // Access a value
        System.out.println("Value for key 'Apple': " + map.get("Apple"));

        // Remove an entry
        map.remove("Banana");

        // Check if a key exists
        if (map.containsKey("Mango")) {
            System.out.println("Map contains key 'Mango'");
        }

        // Iterate over the map
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Get all keys
        System.out.println("Keys: " + map.keySet());

        // Get all values
        System.out.println("Values: " + map.values());

        // Check the size of the map
        System.out.println("Size of the map: " + map.size());
    }
}
