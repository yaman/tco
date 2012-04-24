package tco2002;

/**
 * Problem Statement
 * 
 * PROBLEM STATEMENT For every problem given on TopCoder, there are restrictions
 * on the input that TopCoder checks. For the most simple inputs, this could be
 * as easy as ensuring that a single int is between 1 and 50, inclusive. On more
 * complicated problems, this CheckData() method (as it is called) becomes more
 * difficult.
 * 
 * Implement a class Checker with a method CheckData() that will take a String[]
 * as an argument. You must ensure that the String[] is a valid input for the
 * following "problem description":
 * 
 ****** BEGIN PSUEDO-PROBLEM DESCRIPTION ****** You are given a String[] lovers
 * representing a love triangle. Each element in this String[] will be formatted
 * as follows: "NAME1 LOVES NAME2" (quotes added for clarity only).
 * 
 * Checker will ensure the following: lovers will contain between 2 and 20
 * elements, inclusive.
 * 
 * Each element of lovers will contain less than or equal to 40 characters and
 * will be formatted as "NAME1 LOVES NAME2" (quotes added for clarity again)
 * with the capital word LOVES and
 * 
 * only one space between words, and no leading or trailing spaces.
 * 
 * NAME1 and NAME2 will be names of non-zero length.
 * 
 * NAME1 and NAME2 will not be identical (everyone loves themselves anyway).
 * 
 * NAME1 and NAME2 will contain only capital letters [A-Z] and/or hyphens '-'.
 * 
 * For each NAME2 there will be a corresponding NAME1 in lovers.
 * 
 * That is, everyone loves someone else in the problem.
 * 
 * Notes:
 * 
 * One person may love multiple people (repeated NAME1 in different elements)
 * and one person may be loved by multiple people (repeated NAME2 in different
 * elements).
 * 
 * It is possible for two elements to be identical. (ex
 * {"A LOVES B","A LOVES B","B LOVES A"} is valid). END PSUEDO-PROBLEM STATEMENT
 * ******
 * 
 * DEFINITION Class name: Checker Method name: CheckData Parameters: String[]
 * Returns: boolean The method signature is: boolean CheckData(String[] lovers)
 * Be sure your method is public.
 * 
 * For technical reasons, TopCoder will ensure the following: lovers contains 0
 * to 50 elements. each element of lovers contains 0 to 50 characters,
 * inclusive. each element of lovers contains characters ([a-z][A-Z][0-9]),
 * spaces, or any of the characters (quotes added for clarity)
 * "<>./?;:{}[]=+-_|".
 * 
 * EXAMPLES {"D-G LOVES M", "M LOVES D-G", "T LOVES G", "G LOVES D-G"} This
 * input matches the above criteria, so CheckData returns true.
 * 
 * {"D LOVES M", "D LOVES C", "G LOVES M", "M LOVES T", "T LOVES D"} Since C is
 * loved but never appears as NAME1, this returns false.
 * 
 * {"D LOVES M", "C LOVES C", "G LOVES M", "M LOVES T", "T LOVES D"} Now we see
 * that C desperately tries loving himself, but that is not allowed so the
 * method returns false.
 * 
 * {"N LOVES C", "C LOVES D", "D LOVES M", "M LOVES g", "g LOVES N"} g has
 * lowercase letters in his name and therefore the method returns false.
 * 
 * {"A LOVES B", "A LOVES C", "C LOVES A", "B  LOVES A"} Element 3 has a badly
 * formatted string (two spaces where only one is allowed), so the result is
 * false.
 * 
 * {"ME LOVES YOU"} Since 2-20 elements (inclusive) are necessary, this returns
 * false.
 * 
 * {"ME LOVES YOU", "ME LOVES YOU"} This has the correct number of elements, and
 * the repeat is legal. However, since YOU never exists as NAME1, the result is
 * still false.
 * 
 * {"ME LOVES YOU", "ME LOVES YOU", "YOU LOVES ME"} The above situation
 * remedied. This returns true.
 * 
 * {"I LOVE YOU", "YOU LOVE I"} Both Strings are incorrectly formatted (LOVE
 * instead of LOVES), so the method returns false.
 * 
 * Definition
 * 
 * Class: Checker Method: CheckData Parameters: String[] Returns: boolean Method
 * signature: boolean CheckData(String[] param0) (be sure your method is public)
 * 
 * This problem statement is the exclusive and proprietary property of TopCoder,
 * Inc. Any unauthorized use or reproduction of this information without the
 * prior written consent of TopCoder, Inc. is strictly prohibited. (c)2010,
 * TopCoder, Inc. All rights reserved.
 * 
 */
public class Checker {

	public boolean checkData(String[] param0) {

		String loves = "LOVES";

		int length = param0.length;

		if (length < 2 || length > 20) {
			return false;
		}

		for (String lover : param0) {
			if (lover.length() > 40 && lover.length() < 9) {
				return false;
			}
		}

		return false;
	}

}
