package tco2001.test;

import org.junit.Assert;
import org.junit.Test;

import tco2001.Football;

public class TestFootball {

	@Test
	public void testInputSize() {
		int input = 0;
		int expected = 0;

		Football football = new Football();

		Assert.assertEquals(expected, football.fetchCombinations(input));
	}
	
	@Test
	public void testInputSize2() {
		int input = 76;
		int expected = 0;

		Football football = new Football();

		Assert.assertEquals(expected, football.fetchCombinations(input));
	}
}
