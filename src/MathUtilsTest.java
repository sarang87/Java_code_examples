import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MathUtilsTest {
    @Test
    public void testDivideByZero() {
        MathUtils mathUtils = new MathUtils();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            mathUtils.divide(10, 0);
        });
        assertEquals("Division by zero is not allowed", exception.getMessage());
    }
    @Test
    public void testMin() {
        MathUtils mathUtils = new MathUtils();
        assertAll("Min method",
                () -> assertEquals(3, mathUtils.min(3, 5)),
                () -> assertEquals(-1, mathUtils.min(-1, 2)),
                () -> assertEquals(0, mathUtils.min(0, 0))
        );
    }

}
