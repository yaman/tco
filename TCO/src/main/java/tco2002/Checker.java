package tco2002;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Problem Statement
 * <p/>
 * PROBLEM STATEMENT For every problem given on TopCoder, there are restrictions
 * on the input that TopCoder checks. For the most simple inputs, this could be
 * as easy as ensuring that a single int is between 1 and 50, inclusive. On more
 * complicated problems, this CheckData() method (as it is called) becomes more
 * difficult.
 * <p/>
 * Implement a class Checker with a method CheckData() that will take a String[]
 * as an argument. You must ensure that the String[] is a valid input for the
 * following "problem description":
 * <p/>
 * ***** BEGIN PSUEDO-PROBLEM DESCRIPTION ****** You are given a String[] lovers
 * representing a love triangle. Each element in this String[] will be formatted
 * as follows: "NAME1 LOVES NAME2" (quotes added for clarity only).
 * <p/>
 * Checker will ensure the following: lovers will contain between 2 and 20
 * elements, inclusive.
 * <p/>
 * Each element of lovers will contain less than or equal to 40 characters and
 * will be formatted as "NAME1 LOVES NAME2" (quotes added for clarity again)
 * with the capital word LOVES and
 * <p/>
 * only one space between words, and no leading or trailing spaces.
 * <p/>
 * NAME1 and NAME2 will be names of non-zero length.
 * <p/>
 * NAME1 and NAME2 will not be identical (everyone loves themselves anyway).
 * <p/>
 * NAME1 and NAME2 will contain only capital letters [A-Z] and/or hyphens '-'.
 * <p/>
 * For each NAME2 there will be a corresponding NAME1 in lovers.
 * <p/>
 * That is, everyone loves someone else in the problem.
 * <p/>
 * Notes:
 * <p/>
 * One person may love multiple people (repeated NAME1 in different elements)
 * and one person may be loved by multiple people (repeated NAME2 in different
 * elements).
 * <p/>
 * It is possible for two elements to be identical. (ex
 * {"A LOVES B","A LOVES B","B LOVES A"} is valid). END PSUEDO-PROBLEM STATEMENT
 * ******
 * <p/>
 * DEFINITION Class name: Checker Method name: CheckData Parameters: String[]
 * Returns: boolean The method signature is: boolean CheckData(String[] lovers)
 * Be sure your method is public.
 * <p/>
 * For technical reasons, TopCoder will ensure the following: lovers contains 0
 * to 50 elements. each element of lovers contains 0 to 50 characters,
 * inclusive. each element of lovers contains characters ([a-z][A-Z][0-9]),
 * spaces, or any of the characters (quotes added for clarity)
 * "<>./?;:{}[]=+-_|".
 * <p/>
 * EXAMPLES {"D-G LOVES M", "M LOVES D-G", "T LOVES G", "G LOVES D-G"} This
 * input matches the above criteria, so CheckData returns true.
 * <p/>
 * {"D LOVES M", "D LOVES C", "G LOVES M", "M LOVES T", "T LOVES D"} Since C is
 * loved but never appears as NAME1, this returns false.
 * <p/>
 * {"D LOVES M", "C LOVES C", "G LOVES M", "M LOVES T", "T LOVES D"} Now we see
 * that C desperately tries loving himself, but that is not allowed so the
 * method returns false.
 * <p/>
 * {"N LOVES C", "C LOVES D", "D LOVES M", "M LOVES g", "g LOVES N"} g has
 * lowercase letters in his name and therefore the method returns false.
 * <p/>
 * {"A LOVES B", "A LOVES C", "C LOVES A", "B  LOVES A"} Element 3 has a badly
 * formatted string (two spaces where only one is allowed), so the result is
 * false.
 * <p/>
 * {"ME LOVES YOU"} Since 2-20 elements (inclusive) are necessary, this returns
 * false.
 * <p/>
 * {"ME LOVES YOU", "ME LOVES YOU"} This has the correct number of elements, and
 * the repeat is legal. However, since YOU never exists as NAME1, the result is
 * still false.
 * <p/>
 * {"ME LOVES YOU", "ME LOVES YOU", "YOU LOVES ME"} The above situation
 * remedied. This returns true.
 * <p/>
 * {"I LOVE YOU", "YOU LOVE I"} Both Strings are incorrectly formatted (LOVE
 * instead of LOVES), so the method returns false.
 * <p/>
 * Definition
 * <p/>
 * Class: Checker Method: CheckData Parameters: String[] Returns: boolean Method
 * signature: boolean CheckData(String[] param0) (be sure your method is public)
 * <p/>
 * This problem statement is the exclusive and proprietary property of TopCoder,
 * Inc. Any unauthorized use or reproduction of this information without the
 * prior written consent of TopCoder, Inc. is strictly prohibited. (c)2010,
 * TopCoder, Inc. All rights reserved.
 */
public class Checker {

    public boolean checkData(String[] param0) {

        boolean result = true;
        if (!checkArrayLength(param0)) {
            return false;
        }
        Map<String, String> nameMap = new HashMap<>();
        for (String lover : param0) {
            if (!checkSpaces(lover)) {
                return false;
            }
            if (!checkLength(lover)) {
                return false;
            }
            if (!checkHasLoves(lover)) {
                return false;
            }
            if (!checkZeroLength(lover)) {
                return false;
            }
            if (!checkIdenticalNames(lover)) {
                return false;
            }
            if (isAlpabetic(lover)) {
                return false;
            }

            String[] loverArray = lover.split(" ");
            String name1 = loverArray[0];
            String name2 = loverArray[2];

            nameMap.put(name1 + 1, name1);
            nameMap.put(name2 + 2, name2);

        }

        for (String name : nameMap.values()) {
            String name1 = nameMap.get(name + 1);
            String name2 = nameMap.get(name + 2);
            if (null == name1 && null != name2) {
                return false;
            }
        }
        return result;
    }

    boolean isAlpabetic(String lover) {
        String[] loverWords = lover.split(" ");
        String firstName = loverWords[0];
        String secondName = loverWords[2];
        final String patternStr = "[A-Z-]+";
        final Pattern p = Pattern.compile(patternStr);
        Matcher m = p.matcher(firstName);
        if (!m.matches()) {
            return true;
        }
        m = p.matcher(secondName);
        return !m.matches();
    }

    boolean checkIdenticalNames(String lover) {
        String[] loverWords = lover.split(" ");
        String firstName = loverWords[0];
        String secondName = loverWords[2];

        return !firstName.equals(secondName);
    }

    boolean checkZeroLength(String lover) {
        String[] loverWords = lover.split(" ");

        boolean zeroLength = false;
        if (loverWords.length == 3) {
            zeroLength = true;
        }

        return zeroLength;
    }

    boolean checkArrayLength(String[] array) {
        int length = array.length;

        return !(length < 2 || length > 20);
    }

    boolean checkSpaces(String lover) {
        char[] loverChar = lover.toCharArray();
        int spaceCount = 0;
        for (char c : loverChar) {
            if (c == ' ')
                spaceCount++;
        }
        return spaceCount <= 2 && !lover.startsWith(" ") && !lover.endsWith(" ");
    }

    boolean checkLength(String lover) {
        return lover.length() <= 40;
    }

    boolean checkHasLoves(String lover) {
        String[] loverWords = lover.split(" ");

        boolean hasLoves = false;

        for (String word : loverWords) {
            String loves = "LOVES";
            if (word.equals(loves)) {
                hasLoves = true;
            }
        }
        return hasLoves;
    }

}
