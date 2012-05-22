package tco2001;

/**
 * 
 * 
 Create a class called Football. In football, scores are incremented by either
 * 2, 3, or 7 points. Given a numerical input (integer between 1 and 75)
 * representing a final score, calculate the number of all possible combinations
 * of (2, 3, 7) which add up to that score. The output should be the number of
 * combinations found. Here are a couple of examples:
 * 
 * input | output | combinations 1 0 4 1 (2, 2) 9 3 (2, 7), (2, 2, 2, 3), (3, 3,
 * 3) 11 3 (2, 2, 7), (2, 2, 2, 2, 3), (2, 3, 3, 3)
 * 
 * Here is the method signature (be sure your method is public: int
 * fetchCombinations(int input)
 * 
 * We will check to make sure the input to this problem is valid.
 */
public class Football {

	public int fetchCombinations(int input) {
		if (input > 75 || input < 1) {
			return 0;
		}

		int[] factors = { 2, 3, 7 };

		return -1;
	}

}
