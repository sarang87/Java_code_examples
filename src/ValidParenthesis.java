import java.util.ArrayList;
import java.util.Map;

public class ValidParenthesis {


    public static boolean isValid(String s) throws IllegalArgumentException {

        ArrayList<Character> stack = new ArrayList<>();
        Map<Character, Character> map = Map.of('{', '}', '[',']', '(',')');
        if (s == null || s.isEmpty()) {
            return true;
        }
        for(char c: s.toCharArray()) {
            if (map.containsKey(c)) {
                stack.add(map.get(c));
            }
            else if (map.containsValue(c)){
                if(stack.isEmpty() || stack.remove(stack.size()-1) != c){
                    return false;
                }
            }
            else {
                throw new IllegalArgumentException("Invalid input");
            }
        }
        return true;
    }

}
