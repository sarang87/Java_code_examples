import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class ValidParenthesisTester {
    @Test
    public void emptyString() {
        Assertions.assertTrue(ValidParenthesis.isValid(""));
    }

    @Test
    public void invalidCharInput(){
        Assertions.assertThrows(IllegalArgumentException.class ,()->ValidParenthesis.isValid("abc!"),"Invalid input");
    }

    @Test
    public void evenValidString(){
        Assertions.assertTrue(ValidParenthesis.isValid("[{([])}](){}[][()]"));
    }

    @Test
    public void oddValidString(){
        Assertions.assertTrue(ValidParenthesis.isValid("{([])}"));
    }

    @Test
    public void oddInvalidString(){
        Assertions.assertFalse(ValidParenthesis.isValid("{([)]}"));
    }

    @Test
    public void evenInvalidString(){
        Assertions.assertFalse(ValidParenthesis.isValid("{](}"));
    }
}
