package tco2002;

/**
 * PROBLEM STATEMENT
 * 
 * An interval is a set of consecutive integers. The lowest and highest
 * integers, separated by a single colon, (the character ':'), are used to
 * represent the interval. The low number appears first, before the ':'. The
 * high number appears second, after the ':'. For example, the interval "1:3"
 * represents the set of integers 1, 2, and 3. (double quotes are for clarity).
 * The interval "100:199" represents the set of integers greater than or equal
 * to 100 and less than or equal to 199. The interval "5:5" respresents the set
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
 * "6:8". Note that other partitionings are possible, such as {1:2,3:4,5:5,6:8}
 * which uses four intervals, but the minimum number of partitions must be used.
 * A partitioning such as {1:2,3:6,7:8} is incorrect because the interval "1:5"
 * from the original input cannot be formed by combining one or more of the
 * result intervals. Thus, the only correct solution is the list of intervals
 * {1:2,3:5,6:8}.
 * 
 * E2: {} ==> {} E3: {0:9999} ==> {0:9999} E4: {10:21,10:21} ==> {10:21} E5:
 * {6:10,3:10} ==> {3:5,6:10} E6: {1:10,3:5} ==> {1:2,3:5,6:10} E7:
 * {6:7,1:8,2:4,5:7,2:3} ==> {1:1,2:3,4:4,5:5,6:7,8:8} E8: {1:99,6:10,3:10} ==>
 * {1:2,3:5,6:10,11:99}
 */
public class Intervals {
	public String[] partition(String[] param0){
		return null;
	}
}
