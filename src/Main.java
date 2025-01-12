
public class Main {

    public static void main(String[] args) {

        String[] words = {"hello", "world", "java"};
        for (String word : words) {
            StringTester tester = new StringTester(word);
            System.out.println(tester.evenStringChecker());
        }

        for (String word : words) {
            System.out.println(word);
        }

    }

}