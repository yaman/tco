package tco2001.test;

import org.junit.Assert;
import org.junit.Test;

import tco2001.StringDup;

public class TestStringDup {

	@Test
	public void testSuccess1() {
		String input = "aaiicccnn";
		char expected = 'c';

		StringDup dup = new StringDup();

		Assert.assertEquals(expected, dup.getMax(input));
	}

	@Test
	public void testSuccess2() {
		String input = "aabbccdd";
		char expected = 'a';

		StringDup dup = new StringDup();

		Assert.assertEquals(expected, dup.getMax(input));
	}

	@Test
	public void testSuccess3() {
		String input = "ab2sbf2dj2skl";
		char expected = '2';

		StringDup dup = new StringDup();

		Assert.assertEquals(expected, dup.getMax(input));
	}

	@Test
	public void testSuccess4() {
		String input = "aaabbbccc";
		char expected = 'a';

		StringDup dup = new StringDup();

		Assert.assertEquals(expected, dup.getMax(input));
	}
}
