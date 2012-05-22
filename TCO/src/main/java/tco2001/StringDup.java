package tco2001;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * Create a class called StringDup. Given a string made up of ONLY letters and
 * digits, determine which character is repeated the most in the string ('A' is
 * different than 'a'). If there is a tie, the character which appears first in
 * the string (from left to right) should be returned.
 * 
 * Examples :
 * 
 * aaiicccnn = c aabbccdd = a ab2sbf2dj2skl = 2
 * 
 * Here is the method signature :
 * 
 * public char getMax(String input);
 * 
 * We will check to make sure that the input contains only letters and digits
 * (no punctuation marks or spaces).
 */

public class StringDup {
	public char getMax(String param0) {
		

		if (param0.matches("^[A-Za-z0-9]")) {
			return ' ';
		}

		char[] array = param0.toCharArray();

		Map<Character, String> map = new HashMap<Character, String>();

		for (int i = 0; i < array.length; i++) {
			String mapChar = map.get(array[i]);
			if (null != mapChar) {
				String[] def = mapChar.split(":");
				int count = Integer.parseInt(def[0]);
				int index = Integer.parseInt(def[1]);
				count++;
				map.put(array[i], "" + count + ":" + index);
			} else {
				map.put(array[i], "" + 1 + ":" + i);
			}
		}

		int maxCount = 0;
		int minIndex = 0;
		char result = 0;
		for (Character c : map.keySet()) {
			String[] def = map.get(c).split(":");
			int count = Integer.parseInt(def[0]);
			int index = Integer.parseInt(def[1]);

			if (count > maxCount) {
				maxCount = count;
				minIndex = index;
				result = c;
			} else if (count == maxCount && minIndex > index) {
				maxCount = count;
				result = c;
				minIndex = index;
			}
		}

		return result;
	}
}
