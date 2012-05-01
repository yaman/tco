package tco2002.test;

import org.junit.Assert;
import org.junit.Test;

import tco2002.Intervals;

public class TestIntervals {

	@Test
	public void testEmptyArray() {
		String[] parameter = {};
		String[] expected = {}; 
		Intervals intervals = new Intervals(); 
		String[] actual = intervals.partition(parameter); 
		Assert.assertArrayEquals(expected, actual); 
	}

	@Test
	public void testNullArray() {
		String[] expected = {}; 
		Intervals intervals = new Intervals(); 
		String[] actual = intervals.partition(null); 
		Assert.assertArrayEquals(expected, actual); 
	}
}
