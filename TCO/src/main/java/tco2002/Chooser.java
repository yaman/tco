package tco2002;

/**
 * Problem Statement
 * 
 * PROBLEM STATEMENT When putting together a problem set, a writer must keep in
 * mind the difficulty and length of a problem. A good problem set is one with
 * an easy, a middle, and a hard problem, but doesn't take too much or too
 * little time to complete.
 * 
 * You will be given an input of three int[]. The first int[] consists of easy
 * problem times, the second consists of middle problem times, and the third
 * consists of hard problem times. Return the number of legal problem set
 * combinations, where a legal set contains exactly 1 easy, 1 middle and 1 hard
 * problem, and the total time is between 60 and 75 inclusive.
 * 
 * DEFINITION Class name: Chooser Method name: numSets Parameters: int[], int[],
 * int[] Returns: int The method signature is: int numSets(int[] easy, int[]
 * middle, int[] hard) Be sure your method is public.
 * 
 * TopCoder will ensure the following: Each int[] will contain between 0 and 10
 * elements, inclusive. Each element of easy will be an int between 5 and 15,
 * inclusive. Each element of middle will be an int between 15 and 45,
 * inclusive. Each element of hard will be an int between 30 and 55, inclusive.
 * 
 * EXAMPLES {5,10,15} {15,25} {45} There are 3*2*1=6 possible sets. However,
 * since 10+25+45=80 and 15+25+45=85, two of the sets are illegal, so the method
 * returns 4.
 * 
 * {5,5,5} {15,15,15} {45,45,45} There are 3*3*3=27 possible sets, all legal.
 * The return value is 27.
 * 
 * {5,5,5} {15,15,15} {45,45,35} There are 27 possible sets again, but for this
 * input any set with the 35 minute hard problem is too short. Therefore there
 * are only 3*3*2=18 legal sets, and the return value is 18.
 * 
 * {} {15,25} {30,35,40} Since there are no easy problems, there are no legal
 * problem sets. The return value is 0.
 * 
 * Definition
 * 
 * Class: Chooser Method: numSets Parameters: int[], int[], int[] Returns: int
 * Method signature: int numSets(int[] param0, int[] param1, int[] param2) (be
 * sure your method is public)
 * 
 * This problem statement is the exclusive and proprietary property of TopCoder,
 * Inc. Any unauthorized use or reproduction of this information without the
 * prior written consent of TopCoder, Inc. is strictly prohibited. (c)2010,
 * TopCoder, Inc. All rights reserved.
 */
public class Chooser {

	public int numSets(int[] easy, int[] medium, int[] hard)
			throws InterruptedException {
		int result = 0;

		for (int easyIndex = 0; easyIndex < easy.length; easyIndex++) {
			for (int mediumIndex = 0; mediumIndex < medium.length; mediumIndex++) {
				for (int hardIndex = 0; hardIndex < hard.length; hardIndex++) {
					System.out.println();
					System.out.print("Easy:" + easy[easyIndex]);
					System.out.print("	Medium:" + medium[mediumIndex]);
					System.out.print("	Hard:" + hard[hardIndex]);

					int easyI = easy[easyIndex];
					int mediumI = medium[mediumIndex];
					int hardI = hard[hardIndex];
					int weight = easyI + mediumI + hardI;
					System.out.print("	Weight:" + weight);
					if (weight >= 60 && weight <= 75) {
						result++;
					}
					Thread.sleep(100);
				}
			}

		}
		System.out.println();
		return result;
	}

	public static void main(String[] args) {
		int easy[] = { 5, 5, 5 };
		int medium[] = { 15, 15,15 };
		int hard[] = { 45, 45,35 };

		Chooser chooser = new Chooser();
		int combination = 0;
		try {
			combination = chooser.numSets(easy, medium, hard);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Combination : " + combination);

	}
}
