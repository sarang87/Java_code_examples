import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class StringTesterTest {

    private StringTester tester;

    @BeforeEach
    public void setUp() {
        tester = new StringTester();
    }

    @Test
    public void oddStringTesterTest() {
        String[] oddwords = {"hello", "world", "javac"};
        for (String word : oddwords) {
            tester.setInputString(word);
            assertFalse(tester.evenStringChecker());
        }

    }

    @ParameterizedTest
    @ValueSource(strings = {"hell", "worl", "Unit", "test"})
    public void evenStringTesterTest(String input) {
        tester.setInputString(input);
        assertTrue(tester.evenStringChecker());
    }

}