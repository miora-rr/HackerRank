import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BalancedBrackets {
    public static String isBalanced(String s) {
        Map<Character, Character> bracket = new HashMap<>();
        bracket.put('}', '{');
        bracket.put(']', '[');
        bracket.put(')', '(');
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()){
            if (bracket.containsValue(c)) stack.push(c);
            else if (bracket.containsKey(c)) {
                if (stack.isEmpty() || stack.pop() != bracket.get(c)) return "NO";
            }
        }

        return stack.isEmpty() ? "YES" : "NO";
    }

    public static void main(String[] args) {
        System.out.println(isBalanced("{(([])[])[]}[]"));
    }
}
