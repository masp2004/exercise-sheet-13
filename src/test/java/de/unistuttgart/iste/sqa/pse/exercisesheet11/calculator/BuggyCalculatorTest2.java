package de.unistuttgart.iste.sqa.pse.exercisesheet11.calculator;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class BuggyCalculatorTest2 {

	private Calculator calculator;

	@Before
	public void setUp() {
		calculator = new BuggyCalculator();
	}

	@Test
	public void test1() {
		int result = calculator.addExcat(25, 41);
		assertEquals(65, result);

	}

	@Test(expected = ArithmeticException.class)
	public void test2() {
		calculator.addExcat(Integer.MAX_VALUE, 1);
	}

	@Test(expected = ArithmeticException.class)
	public void test3() {
		calculator.addExcat(Integer.MIN_VALUE, -1);
	}

	@Test
	public void test4() {
		int result = calculator.abs(42);
		assertEquals(42, result);
	}

	@Test
	public void test5() {
		int result = calculator.abs(-65);
		assertEquals(65, result);
	}

	@Test(expected = ArithmeticException.class)
	public void test6() {
		calculator.abs(Integer.MIN_VALUE);
	}

}
