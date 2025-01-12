import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ArrayListMethodsDemo {
    public static void main(String[] args) {
        // 1. Create and Initialize an ArrayList
        ArrayList<String> list = new ArrayList<>();
        list.add("Alice");
        list.add("Bob");
        list.add("Charlie");

        // 2. Print the ArrayList
        System.out.println("ArrayList: " + list); // Output: [Alice, Bob, Charlie]

        // 3. Get the size of the ArrayList
        System.out.println("Size: " + list.size()); // Output: 3

        // 4. Access an element by index
        System.out.println("Element at index 1: " + list.get(1)); // Output: Bob

        // 5. Modify an element
        list.set(1, "David");
        System.out.println("After modifying index 1: " + list); // Output: [Alice, David, Charlie]

        // 6. Add an element at a specific index
        list.add(1, "Eve");
        System.out.println("After adding at index 1: " + list); // Output: [Alice, Eve, David, Charlie]

        // 7. Remove an element by index
        list.remove(2);
        System.out.println("After removing index 2: " + list); // Output: [Alice, Eve, Charlie]

        // 8. Remove an element by value
        list.remove("Eve");
        System.out.println("After removing 'Eve': " + list); // Output: [Alice, Charlie]

        // 9. Check if the ArrayList contains an element
        System.out.println("Contains 'Alice': " + list.contains("Alice")); // Output: true
        System.out.println("Contains 'Eve': " + list.contains("Eve")); // Output: false

        // 10. Iterate over the ArrayList using a for loop
        System.out.println("Iteration using for loop:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // 11. Iterate over the ArrayList using a for-each loop
        System.out.println("Iteration using for-each loop:");
        for (String name : list) {
            System.out.println(name);
        }

        // 12. Sort the ArrayList
        list.add("Bob");
        list.add("Zara");
        Collections.sort(list);
        System.out.println("After sorting: " + list); // Output: [Alice, Bob, Charlie, Zara]

        // 13. Reverse the ArrayList
        Collections.reverse(list);
        System.out.println("After reversing: " + list); // Output: [Zara, Charlie, Bob, Alice]

        // 14. Clear the ArrayList
        list.clear();
        System.out.println("After clearing: " + list); // Output: []

        // 15. Check if the ArrayList is empty
        System.out.println("Is empty: " + list.isEmpty()); // Output: true

        // 16. Convert an ArrayList to an Array
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        Integer[] numberArray = numbers.toArray(new Integer[0]);
        System.out.println("Array: ");
        for (int num : numberArray) {
            System.out.println(num);
        }

        // 17. Initialize an ArrayList with values
        ArrayList<String> fruits = new ArrayList<>(List.of("Apple", "Banana", "Orange"));
        System.out.println("Initialized with values: " + fruits); // Output: [Apple, Banana, Orange]

        // 18. Find the index of an element
        System.out.println("Index of 'Banana': " + fruits.indexOf("Banana")); // Output: 1

        // 19. Remove elements that satisfy a condition
        fruits.removeIf(fruit -> fruit.startsWith("B"));
        System.out.println("After removing elements starting with 'B': " + fruits); // Output: [Apple, Orange]
    }
}
