package tco2001.test;

import org.junit.Assert;
import org.junit.Test;

import tco2001.AlephNull;

public class TestAlephNull {

	@Test
	public void testEdgeStart() {
		int generation = 1;
		int item = 0;
		int[] expected = { 0, 1 };
		AlephNull alephNull = new AlephNull();

		Assert.assertArrayEquals(expected, alephNull.rational(generation, item));

	}

	@Test
	public void testSuccess1() {
		int generation = 1;
		int item = 1;
		int[] expected = { 1, 0 };
		AlephNull alephNull = new AlephNull();

		Assert.assertArrayEquals(expected, alephNull.rational(generation, item));
	}

	@Test
	public void testSuccess2() {
		int generation = 4;
		int item = 1;
		int[] expected = { 1, 3 };
		AlephNull alephNull = new AlephNull();

		Assert.assertArrayEquals(expected, alephNull.rational(generation, item));
	}

	@Test
	public void testSuccess3() {
		int generation = 4;
		int item = 6;
		int[] expected = { 2, 1 };
		AlephNull alephNull = new AlephNull();

		Assert.assertArrayEquals(expected, alephNull.rational(generation, item));
	}

	@Test
	public void testSuccess4() {
		int generation = 5;
		int item = 11;
		int[] expected = { 5, 3 };
		AlephNull alephNull = new AlephNull();

		Assert.assertArrayEquals(expected, alephNull.rational(generation, item));
	}

	@Test
	public void testSuccess5() {
		int generation = 8;
		int item = 70;
		int[] expected = { 9, 7 };
		AlephNull alephNull = new AlephNull();

		Assert.assertArrayEquals(expected, alephNull.rational(generation, item));
	}

	@Test
	public void testSuccess6() {
		int generation = 10;
		int item = 467;
		int[] expected = { 43, 12 };
		AlephNull alephNull = new AlephNull();

		Assert.assertArrayEquals(expected, alephNull.rational(generation, item));
	}
 
	public void testSuccess7() {
		int generation = 23;
		int item = 4190316;
		int[] expected = { 438, 43 };
		AlephNull alephNull = new AlephNull();

		Assert.assertArrayEquals(expected, alephNull.rational(generation, item));
	}

	@Test
	public void testSuccess9() {
		int generation = 4;
		int item = 0;
		int[] expected = { 0, 1 };
		AlephNull alephNull = new AlephNull();

		Assert.assertArrayEquals(expected, alephNull.rational(generation, item));
	}

	@Test
	public void testSuccess10() {
		int generation =4;
		int item = 1;
		int[] expected = { 1, 3 };
		AlephNull alephNull = new AlephNull();

		Assert.assertArrayEquals(expected, alephNull.rational(generation, item));
	}

	@Test
	public void testSuccess11() {
		int generation = 4;
		int item = 2;
		int[] expected = { 1, 2 };
		AlephNull alephNull = new AlephNull();

		Assert.assertArrayEquals(expected, alephNull.rational(generation, item));
	}

	@Test
	public void testSuccess12() {
		int generation = 4;
		int item = 3;
		int[] expected = { 2, 3 };
		AlephNull alephNull = new AlephNull();

		Assert.assertArrayEquals(expected, alephNull.rational(generation, item));
	}

	@Test
	public void testSuccess13() {
		int generation = 4;
		int item = 4;
		int[] expected = { 1, 1 };
		AlephNull alephNull = new AlephNull();

		Assert.assertArrayEquals(expected, alephNull.rational(generation, item));
	}

	@Test
	public void testSuccess14() {
		int generation = 4;
		int item = 5;
		int[] expected = { 3, 2 };
		AlephNull alephNull = new AlephNull();

		Assert.assertArrayEquals(expected, alephNull.rational(generation, item));
	}

	@Test
	public void testSuccess15() {
		int generation = 4;
		int item = 6;
		int[] expected = { 2, 1 };
		AlephNull alephNull = new AlephNull();

		Assert.assertArrayEquals(expected, alephNull.rational(generation, item));
	}

	@Test
	public void testFailure1() {
		int generation = 1;
		int item = 2;
		int[] expected = { 0, 0 };
		AlephNull alephNull = new AlephNull();

		Assert.assertArrayEquals(expected, alephNull.rational(generation, item));
	}

 
	public void testEdgeEnd() {
		int generation = 30;
		int item = 100;
		int[] expected = { 7, 157 };
		AlephNull alephNull = new AlephNull();

		Assert.assertArrayEquals(expected, alephNull.rational(generation, item));

	}

}
