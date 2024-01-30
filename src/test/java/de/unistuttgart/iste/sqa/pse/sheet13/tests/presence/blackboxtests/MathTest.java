package de.unistuttgart.iste.sqa.pse.sheet13.tests.presence.blackboxtests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import de.unistuttgart.iste.sqa.pse.sheet13.presence.blackboxtests.Math;
import org.junit.jupiter.api.Test;

/**
 * Tests for the black-box-tests exercise on sheet 11.
 */
public class MathTest {

	@Test
	public void exampleTest() {
		assertEquals(1, Math.floorDiv(2, 2));
	}
	@Test
	public void testFloorDiv_PositiveNumbers() {
		assertEquals(3, Math.floorDiv(15, 4));
	}

	@Test
	public void testFloorDiv_NegativeDividend_PositiveDivisor() {
		assertEquals(-4, Math.floorDiv(-15, 4));
	}

	@Test
	public void testFloorDiv_DivisorIsOne() {
		assertEquals(20, Math.floorDiv(20, 1));
	}

	@Test
	public void testFloorDiv_DividendIsZero() {
		assertEquals(0, Math.floorDiv(0, 7));
	}

	@Test
	public void testFloorDiv_NegativeNumbers() {
		assertEquals(6, Math.floorDiv(-30, -5));
	}

	@Test
	public void testFloorDiv_DivisorIsZero() {
		assertThrows(ArithmeticException.class, () -> Math.floorDiv(42, 0));
	}

	@Test
	public void testFloorDiv_MinimumIntegerValue() {
		assertEquals(-1073741824, Math.floorDiv(Integer.MIN_VALUE, 2));
	}

	@Test
	public void testFloorDiv_OverflowScenario() {
		assertEquals(Integer.MIN_VALUE, Math.floorDiv(Integer.MIN_VALUE, -1));
	}

	// Add more test cases as needed.

	// For subtractExact and abs, you can similarly create test cases based on the defined equivalence classes.

	@Test
	public void testSubtractExact_NormalCase() {
		assertEquals(3, Math.subtractExact(5, 2));
	}

	@Test
	public void testSubtractExact_Overflow() {
		assertThrows(ArithmeticException.class, () -> Math.subtractExact(Integer.MAX_VALUE, Integer.MIN_VALUE));
	}

	@Test
	public void testAbs_PositiveValue() {
		assertEquals(42, Math.abs(42));
	}

	@Test
	public void testAbs_NegativeValue() {
		assertEquals(42, Math.abs(-42));
	}

	@Test
	public void testAbs_MinimumIntegerValue() {
		assertThrows(ArithmeticException.class, () -> Math.abs(Integer.MIN_VALUE));
	}
}
