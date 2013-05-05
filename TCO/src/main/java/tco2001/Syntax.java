package tco2001;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Syntax {
    public boolean match(String input) {

        char[] array = input.toCharArray();

        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();

        map.put('{', '}');
        map.put('[', ']');
        map.put('(', ')');

        for (char c : array) {
            if (isOpenParanthesis(c)) {
                stack.push(c);
            } else if (isClosedParanthesis(c)) {
                char open = stack.pop();
                char closed = map.get(open);
                System.out.println("open : " + open + " closed : " + closed + " check :" + c);
                if (c != closed) {
                    return false;
                }
            }
        }

        return stack.isEmpty();

    }

    public boolean isOpenParanthesis(char c) {
        return c == '{' || c == '[' || c == '(';
    }

    public boolean isClosedParanthesis(char c) {
        return c == '}' || c == ']' || c == ')';
    }
}
