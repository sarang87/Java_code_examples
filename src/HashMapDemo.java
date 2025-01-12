import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        // 1. HashMap<String, Integer>
        HashMap<String, Integer> stringIntegerMap = new HashMap<>();
        stringIntegerMap.put("Alice", 25);
        stringIntegerMap.put("Bob", 30);
        stringIntegerMap.put("Charlie", 35);

        System.out.println("HashMap<String, Integer>:");

        // Different ways to print key-value pairs
        // Method 1: Using entrySet() with a for-each loop
        for (Map.Entry<String, Integer> entry : stringIntegerMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Method 2: Using keySet() and get()
        for (String key : stringIntegerMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + stringIntegerMap.get(key));
        }

        // Method 3: Using forEach (Java 8+)
        stringIntegerMap.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));

        System.out.println();

        // 2. HashMap<Integer, List<String>>
        HashMap<Integer, List<String>> integerListMap = new HashMap<>();

        // Adding values to the HashMap
        integerListMap.put(1, new ArrayList<>(List.of("Apple", "Banana")));
        integerListMap.put(2, new ArrayList<>(List.of("Carrot", "Daikon")));
        integerListMap.put(3, new ArrayList<>(List.of("Eggplant", "Fig")));

        System.out.println("HashMap<Integer, List<String>>:");

        // Different ways to print key-value pairs
        // Method 1: Using entrySet() with a for-each loop
        for (Map.Entry<Integer, List<String>> entry : integerListMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Method 2: Using keySet() and get()
        for (Integer key : integerListMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + integerListMap.get(key));
        }

        // Method 3: Using forEach (Java 8+)
        integerListMap.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));

        // Adding elements to an existing list in the HashMap
        integerListMap.get(1).add("Blueberry");
        integerListMap.get(3).add("Grapes");

        System.out.println("\nUpdated HashMap<Integer, List<String>>:");
        integerListMap.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));

        String keyToRemove = "Alice";
        stringIntegerMap.remove(keyToRemove);
        System.out.println("Removed key: " + keyToRemove);
        for (Map.Entry<String, Integer> entry : stringIntegerMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }


    }
}
