package tco2002.test;

import org.junit.Assert;
import org.junit.Before;
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

	@Test
	public void testArrayLength() {
		String[] text = new String[21];
		for (int i = 0; i < text.length; i++) {
			text[i] = i + ":" + i;
		}
		String[] expected = {};
		Intervals intervals = new Intervals();
		String[] actual = intervals.partition(text);
		Assert.assertArrayEquals(expected, actual);
	}

	@Test
	public void testNumberRange() {
		String[] text = new String[10];
		for (int i = 0; i < text.length; i++) {
			text[i] = i + ":" + (i * 10000);
		}
		String[] expected = {};
		Intervals intervals = new Intervals();
		String[] actual = intervals.partition(text);
		Assert.assertArrayEquals(expected, actual);
	}

	@Test
	public void testNumberFormat() {
		String[] text = new String[10];
		for (int i = 0; i < text.length; i++) {
			text[i] = i + ":a" + i;
		}
		String[] expected = {};
		Intervals intervals = new Intervals();
		String[] actual = intervals.partition(text);
		Assert.assertArrayEquals(expected, actual);
	}

	@Test
	public void testBasicSuccess1() {
		String[] expected = { "0:9999" };
		Intervals intervals = new Intervals();
		String[] text = { "0:9999" };
		String[] actual = intervals.partition(text);
		Assert.assertArrayEquals(expected, actual);
	}

	@Test
	public void testBasicSuccess2() {
		String[] expected = { "10:21", "10:21" };
		Intervals intervals = new Intervals();
		String[] text = { "10:21" };
		String[] actual = intervals.partition(expected);
		Assert.assertArrayEquals(text, actual);
	}

	@Test
	public void testBasicSuccess3() {
		String[] expected = { "1:5", "3:8" };
		Intervals intervals = new Intervals();
		String[] text = { "1:2", "3:5", "6:8" };
		String[] actual = intervals.partition(expected);
		Assert.assertArrayEquals(text, actual);
	}
}
