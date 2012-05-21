package tco2001.test;

import org.junit.Assert;
import org.junit.Test;

import tco2001.Syntax;

public class TestSyntax {

	@Test
	public void testInStringSuccess() {
		String inString = "x(y(z{test})abc)";
		Syntax syntax = new Syntax();
		Assert.assertTrue(syntax.match(inString));
	}

	@Test
	public void testInStringFailure() {
		String inString = "abc(def(ghi) ";
		Syntax syntax = new Syntax();
		Assert.assertFalse(syntax.match(inString));
	}

	@Test
	public void testPureParanthesisSuccess() {
		String inString = "()";
		Syntax syntax = new Syntax();
		Assert.assertTrue(syntax.match(inString));
	}

	@Test
	public void testChainedParanthesisFailure() {
		String inString = "([)]";
		Syntax syntax = new Syntax();
		Assert.assertFalse(syntax.match(inString));
	}

	@Test
	public void testManyParanthesisSuccess() {
		String inString = "[[]](()){{{}}}";
		Syntax syntax = new Syntax();
		Assert.assertTrue(syntax.match(inString));
	}
}
