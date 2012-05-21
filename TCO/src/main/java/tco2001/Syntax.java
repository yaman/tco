package tco2001;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Syntax {
	public boolean match(String input) {

		char[] array = input.toCharArray();

		Stack<Character> stack = new Stack<Character>();
		Map<Character, Character> map = new HashMap<Character, Character>();

		map.put('{', '}');
		map.put('[', ']');
		map.put('(', ')');

		for (char c : array) {
			if (isOpenParanthesis(c)) {
				stack.push(c);
			} else if (isClosedParanthesis(c)) {
				char open = stack.pop();
				char closed = map.get(open);
				System.out.println("open : "+open +" closed : "+closed + " check :"+c);
				if(c != closed){
					return false;
				}
			}
		}
		
		if(!stack.isEmpty())
			return false;

		return true;
	}

	public boolean isOpenParanthesis(char c) {
		if (c == '{' || c == '[' || c == '(') {
			return true;
		} else
			return false;
	}

	public boolean isClosedParanthesis(char c) {
		if (c == '}' || c == ']' || c == ')') {
			return true;
		} else
			return false;
	}
}
