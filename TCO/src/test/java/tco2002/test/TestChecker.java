package tco2002.test;

import org.junit.Assert;
import org.junit.Test;

import tco2002.Checker;

public class TestChecker {

	@Test
	public void testBasicSuccess1() {
		String[] array = { "MARY LOVES ME", "I LOVES MARY" };
		Checker checker = new Checker();
		boolean result = checker.checkData(array);
		Assert.assertEquals(false, result);
	}

	@Test
	public void testBasicSuccess2() {
		String[] array = { "D-G LOVES M", "M LOVES D-G", "T LOVES G",
				"G LOVES D-G" };
		Checker checker = new Checker();
		boolean result = checker.checkData(array);
		Assert.assertEquals(true, result);
	}

	@Test
	public void testBasicSuccess3() {
		String[] array = { "ME LOVES YOU", "ME LOVES YOU", "YOU LOVES ME" };
		Checker checker = new Checker();
		boolean result = checker.checkData(array);
		Assert.assertEquals(true, result);
	}

	@Test
	public void testBasicFail1() {
		String[] array = { "D LOVES M", "D LOVES C", "G LOVES M", "M LOVES T",
				"T LOVES D" };
		Checker checker = new Checker();
		boolean result = checker.checkData(array);
		Assert.assertEquals(false, result);
	}

	@Test
	public void testBasicFail2() {
		String[] array = { "D LOVES M", "C LOVES C", "G LOVES M", "M LOVES T",
				"T LOVES D" };
		Checker checker = new Checker();
		boolean result = checker.checkData(array);
		Assert.assertEquals(false, result);
	}

	@Test
	public void testBasicFail3() {
		String[] array = { "A LOVES B", "A LOVES C", "C LOVES A", "B  LOVES A" };
		Checker checker = new Checker();
		boolean result = checker.checkData(array);
		Assert.assertEquals(false, result);
	}

	@Test
	public void testBasicFail4() {
		String[] array = { "ME LOVES YOU", "ME LOVES YOU" };
		Checker checker = new Checker();
		boolean result = checker.checkData(array);
		Assert.assertEquals(false, result);
	}

	@Test
	public void testArrayLengthFail1() {
		String[] array = { "MARY LOVES ME" };
		Checker checker = new Checker();
		boolean result = checker.checkData(array);
		Assert.assertEquals(false, result);
	}

	@Test
	public void testArrayLengthFail2() {

		String[] array = new String[30];
		for (int i = 0; i < 30; i++) {
			array[i] = "EVERYBODY LOVES EVERYONE";
		}
		Checker checker = new Checker();
		boolean result = checker.checkData(array);
		Assert.assertEquals(false, result);
	}

	@Test
	public void testElementLength1() {
		String[] array = new String[15];
		for (int i = 0; i < 15; i++) {
			array[i] = "EVERYBOD";
		}
		Checker checker = new Checker();
		boolean result = checker.checkData(array);
		Assert.assertEquals(false, result);
	}

	@Test
	public void testElementLength2() {
		String[] array = new String[15];
		for (int i = 0; i < 15; i++) {
			array[i] = "EVERYBODYEVERYBODYEVERYBODYEVERYBODYEVERYBODYEVERYBODYEVERYBODYEVERYBODYEVERYBODYEVERYBODYEVERYBODY";
		}
		Checker checker = new Checker();
		boolean result = checker.checkData(array);
		Assert.assertEquals(false, result);
	}

	@Test
	public void testElementSpaces() {
		String[] array = new String[15];
		for (int i = 0; i < 15; i++) {
			array[i] = "EVERYBODY  LOVES ANYONE";
		}
		Checker checker = new Checker();
		boolean result = checker.checkData(array);
		Assert.assertEquals(false, result);
	}

	@Test
	public void testElementLeadingSpaces() {
		String[] array = new String[15];
		for (int i = 0; i < 15; i++) {
			array[i] = " EVERYBODYLOVES ANYONE";
		}
		Checker checker = new Checker();
		boolean result = checker.checkData(array);
		Assert.assertEquals(false, result);
	}

	@Test
	public void testElementTrailingSpaces() {
		String[] array = new String[15];
		for (int i = 0; i < 15; i++) {
			array[i] = "EVERYBODYLOVES ANYONE ";
		}
		Checker checker = new Checker();
		boolean result = checker.checkData(array);
		Assert.assertEquals(false, result);
	}

	@Test
	public void testElementContainsLove() {
		String[] array = new String[15];
		for (int i = 0; i < 15; i++) {
			array[i] = "EVERYBODY LOVIS ANYONE";
		}
		Checker checker = new Checker();
		boolean result = checker.checkData(array);
		Assert.assertEquals(false, result);
	}

	@Test
	public void testElementNamesZeroLength() {
		String[] array = new String[15];
		for (int i = 0; i < 15; i++) {
			array[i] = "D LOVES";
		}
		Checker checker = new Checker();
		boolean result = checker.checkData(array);
		Assert.assertEquals(false, result);
	}

	@Test
	public void testElementNamesNotIdentical() {
		String[] array = new String[15];
		for (int i = 0; i < 15; i++) {
			array[i] = "D LOVES D";
		}
		Checker checker = new Checker();
		boolean result = checker.checkData(array);
		Assert.assertEquals(false, result);
	}

	@Test
	public void testElementNamesCapital() {
		String[] array = new String[15];
		for (int i = 0; i < 15; i++) {
			array[i] = "d LOVES A";
		}
		Checker checker = new Checker();
		boolean result = checker.checkData(array);
		Assert.assertEquals(false, result);
	}

	@Test
	public void testElementNamesDash() {
		String[] array = { "B LOVES -", "- LOVES B" };
		Checker checker = new Checker();
		boolean result = checker.checkData(array);
		Assert.assertEquals(true, result);
	}
}
