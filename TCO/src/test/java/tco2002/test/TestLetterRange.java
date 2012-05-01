package tco2002.test;

import org.junit.Assert;
import org.junit.Test;

import tco2002.LetterRange;

public class TestLetterRange {

	@Test
	public void testDuplicate() {
		String testStr = "abbccdeff";
		LetterRange range = new LetterRange(); 
		char[] testArray = testStr.toCharArray();
		char[] expectedArray = { 'a', 'b', 'c', 'd', 'e', 'f' }; 
		char[] actualArray = range.removeDuplicate(testArray);
		Assert.assertArrayEquals(expectedArray, actualArray);
	}

	@Test
	public void testLowerCase() {
		String text = "abcZ-";
		LetterRange letterRange = new LetterRange();
		String[] nullExpexted = letterRange.ranges(text);
		Assert.assertArrayEquals(null, nullExpexted);
	}

	@Test
	public void testSuccess1() {
		String text = "cbac";
		LetterRange letterRange = new LetterRange();
		String[] actual = letterRange.ranges(text);
		String[] expected = { "a:c" };
		Assert.assertArrayEquals(expected, actual);
	}
	@Test
	public void testSuccess2() {
		String text = "fb xee ac";
		LetterRange letterRange = new LetterRange();
		String[] actual = letterRange.ranges(text);
		String[] expected = { "a:c", "e:f", "x:x" };
		Assert.assertArrayEquals(expected, actual);
	}
	@Test
	public void testSuccess3() {
		String text = "aha";
		LetterRange letterRange = new LetterRange();
		String[] actual = letterRange.ranges(text);
		String[] expected = { "a:a", "h:h" };
		Assert.assertArrayEquals(expected, actual);
	}
	@Test
	public void testSuccess4() {
		String text = "xyzzy";
		LetterRange letterRange = new LetterRange();
		String[] actual = letterRange.ranges(text);
		String[] expected = { "x:z" };
		Assert.assertArrayEquals(expected, actual);
	}
	@Test
	public void testSuccess5() {
		String text = "and toto too";
		LetterRange letterRange = new LetterRange();
		String[] actual = letterRange.ranges(text);
		String[] expected = { "a:a", "d:d", "n:o", "t:t" };
		Assert.assertArrayEquals(expected, actual);
	}
	@Test
	public void testSuccess6() {
		String text = "topcoder quiz";
		LetterRange letterRange = new LetterRange();
		String[] actual = letterRange.ranges(text);
		String[] expected = { "c:e", "i:i", "o:r", "t:u", "z:z" };
		Assert.assertArrayEquals(expected, actual);
	}
	@Test
	public void testSuccess7() {
		String text = "the quick brown fox jumps over the lazy dog";
		LetterRange letterRange = new LetterRange();
		String[] actual = letterRange.ranges(text);
		String[] expected = { "a:z" };
		Assert.assertArrayEquals(expected, actual);
	}
}
