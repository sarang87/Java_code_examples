public class StringMethodsDemo {
    public static void main(String[] args) {
        String str = "Hello, World!";

        // 1. Length of the String
        System.out.println("Length: " + str.length()); // Output: 13

        // 2. Character at a specific index
        System.out.println("Character at index 7: " + str.charAt(7)); // Output: W

        // 3. Substring
        System.out.println("Substring from index 7: " + str.substring(7)); // Output: World!
        System.out.println("Substring from 0 to 5: " + str.substring(0, 5)); // Output: Hello

        // 4. Check if the String contains a substring
        System.out.println("Contains 'World': " + str.contains("World")); // Output: true

        // 5. Check if the String starts or ends with a substring
        System.out.println("Starts with 'Hello': " + str.startsWith("Hello")); // Output: true
        System.out.println("Ends with '!': " + str.endsWith("!")); // Output: true

        // 6. Index of a character or substring
        System.out.println("Index of 'o': " + str.indexOf('o')); // Output: 4
        System.out.println("Last index of 'o': " + str.lastIndexOf('o')); // Output: 8
        System.out.println("Index of 'World': " + str.indexOf("World")); // Output: 7

        // 7. Convert to lowercase or uppercase
        System.out.println("Lowercase: " + str.toLowerCase()); // Output: hello, world!
        System.out.println("Uppercase: " + str.toUpperCase()); // Output: HELLO, WORLD!

        // 8. Replace characters or substrings
        System.out.println("Replace 'World' with 'Java': " + str.replace("World", "Java")); // Output: Hello, Java!

        // 9. Trim whitespace
        String strWithSpaces = "   Trim me!   ";
        System.out.println("Trimmed: '" + strWithSpaces.trim() + "'"); // Output: 'Trim me!'

        // 10. Split the String into an array
        String csv = "apple,banana,orange";
        String[] fruits = csv.split(",");
        System.out.println("Split result:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        // Output:
        // apple
        // banana
        // orange

        // 11. Check if the String is empty or blank
        String emptyStr = "";
        String blankStr = "   ";
        System.out.println("Is empty: " + emptyStr.isEmpty()); // Output: true
        System.out.println("Is blank: " + blankStr.isBlank()); // Output: true (Java 11+)

        // 12. Compare Strings
        String str1 = "Hello";
        String str2 = "hello";
        System.out.println("Equals: " + str1.equals(str2)); // Output: false
        System.out.println("Equals ignoring case: " + str1.equalsIgnoreCase(str2)); // Output: true

        // 13. Concatenate Strings
        String greeting = "Hello";
        String name = "Alice";
        System.out.println("Concatenated: " + greeting.concat(", ").concat(name)); // Output: Hello, Alice

        // 14. Convert String to a char array
        char[] charArray = str.toCharArray();
        System.out.print("Char Array: ");
        for (char c : charArray) {
            System.out.print(c + " ");
        }
        System.out.println();
        // Output: H e l l o ,   W o r l d !

        // 15. Format a String
        String formatted = String.format("My name is %s and I am %d years old.", "Alice", 25);
        System.out.println("Formatted: " + formatted); // Output: My name is Alice and I am 25 years old.

        // 16. Check if two Strings are interned (== vs equals)
        String internedStr1 = "Java";
        String internedStr2 = new String("Java").intern();
        System.out.println("Are interned Strings equal (==): " + (internedStr1 == internedStr2)); // Output: true

        // 17. Join Strings
        String joined = String.join(", ", "One", "Two", "Three");
        System.out.println("Joined String: " + joined); // Output: One, Two, Three
    }
}
