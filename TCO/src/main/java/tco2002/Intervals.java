package tco2002;

import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * PROBLEM STATEMENT
 * 
 * An interval is a set of consecutive integers. The lowest and highest
 * integers, separated by a single colon, (the character ':'), are used to
 * represent the interval. The low number appears first, before the ':'. The
 * high number appears second, after the ':'. For example, the interval "1:3"
 * represents the set of integers 1, 2, and 3. (double quotes are for clarity).
 * The interval "100:199" represents the set of integers greater than or equal
 * to 100 and less than or equal to 199. The interval "5:5" represents the set
 * containing the single integer 5. Note that the high value of the interval
 * must always be greater than or equal to the low value of the interval.
 * 
 * Write a method that takes a list of intervals and partitions the intervals so
 * that every interval in the result:
 * 
 * is pairwise disjoint (no two intervals contain the same integer), every
 * integer appearing in the original input is represented exactly once in
 * exactly one of the resulting intervals, no integer appears in a result
 * interval that does not also appear in at least one input interval, the
 * minimum number of resulting intervals is used, each interval in the orignal
 * input can be recreated by combining one or more intervals from the result.
 * 
 * Return the intervals ordered by the low value of each range. Note that the
 * input may contain duplicate intervals, but the result will not.
 * 
 * DEFINITION Class: Intervals Parameters: String[] Returns: String[] Method
 * signature: String[] partition(String[] intervals);
 * 
 * (be sure your method is public)
 * 
 * TopCoder will ensure the validity of the inputs. Inputs are valid if all of
 * the following criteria are met:
 * 
 * The input will contain from 0 to 20 elements, inclusive. Each element of
 * intervals will contain two integers (no leading zeros) separated by a single
 * colon (character ':'). Each element of intervals will have neither leading
 * nor trailing spaces. Each integer in an interval will be from 0 to 9999,
 * inclusive. The high value of each interval will be greater than or equal to
 * the low value of that interval.
 * 
 * EXAMPLES
 * 
 * E1: {1:5,3:8} ==> {1:2,3:5,6:8}
 * 
 * The input has two intervals. The first interval contains the integers 1, 2,
 * 3, 4 and 5. The second interval contains the integers 3, 4, 5, 6, 7, and 8.
 * Since two input intervals contain the integers 3, 4, and 5, the intervals are
 * not pairwise disjoint. By creating the new interval, "3:5", and removing the
 * elements 3, 4, and 5 from the two original intervals, the original intervals
 * are now correctly partitioned into the three intervals "1:2", "3:5", and
 * "6:8". Note that other partitioning are possible, such as {1:2,3:4,5:5,6:8}
 * which uses four intervals, but the minimum number of partitions must be used.
 * A partitioning such as {1:2,3:6,7:8} is incorrect because the interval "1:5"
 * from the original input cannot be formed by combining one or more of the
 * result intervals. Thus, the only correct solution is the list of intervals
 * {1:2,3:5,6:8}.
 * 
 * E2: {} ==> {} E3: {0:9999} ==> {0:9999} E4: {10:21,10:21} ==> {10:21} E5:
 * {6:10,3:10} ==> {3:5,6:10} E6: {1:10,3:5} ==> {1:2,3:5,6:10} E7:
 * {6:7,1:8,2:4,5:7,2:3} ==> {1:1,2:3,4:4,5:5,6:7,8:8} {1:8,2:3,2:4,5:7,6:7}
 * {1:8 E8: {1:99,6:10,3:10} ==> {1:2,3:5,6:10,11:99}
 */
public class Intervals {

	public String[] partition(String[] param0) {
		String[] result = {};
		if (null == param0) {
			return result;
		}
		if (param0.length == 0) {
			return result;
		}
		if (param0.length > 20) {
			return result;
		}

		if (!checkNumberFormatAndRange(param0)) {
			return result;
		}

		int used[] = new int[10000];
		ArrayList<Integer> aa = new ArrayList<Integer>();
		ArrayList<Integer> bb = new ArrayList<Integer>();
		for (int x = 0; x < param0.length; x++) {
			StringTokenizer st = new StringTokenizer(param0[x], ":", false);
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			if (!aa.contains(new Integer(a)))
				aa.add(new Integer(a));
			if (!bb.contains(new Integer(b)))
				bb.add(new Integer(b));
			for (int y = a; y <= b; y++) {
				used[y]++;
			}
		}
		ArrayList<String> al = new ArrayList<String>();
		int x = 0;
		int start = -1, end = -1;
		while (x < 10000) {
			while (x < 10000 && used[x] == 0)
				x++;
			if (x == 10000)
				break;
			if (used[x] >= 1) {
				start = x;
				while (!aa.contains(new Integer(x + 1))
						&& !bb.contains(new Integer(x)))
					x++;
				// while (x < 10000 && used[x] == 1 && !aa.contains(new
				// Integer(x))) x++;
			}
			end = x - 1;
			String g = "" + start + ":" + (end + 1);
			al.add(g);
			x++;
		}
		String[] ret = new String[al.size()];
		for (x = 0; x < al.size(); x++) {
			ret[x] = (String) al.get(x);
		}

		System.out.println("result is");
		for (String string : ret) {
			System.out.println(string);
		}
		return ret;
	}

	public boolean checkNumberFormatAndRange(String[] param0) {
		try {
			for (String interval : param0) {
				String[] intervalParts = interval.split(":");
				Integer first = Integer.parseInt(intervalParts[0]);
				Integer second = Integer.parseInt(intervalParts[1]);
				if (first < 0 || first > 9999 || second < 0 || second > 9999) {
					return false;
				}
			}
		} catch (NumberFormatException e) {
			return false;
		}

		return true;

	}

}
