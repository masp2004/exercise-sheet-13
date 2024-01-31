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
	public void floorDiv_BothOperandsZero_ReturnsZero() {
		assertEquals(0, Math.floorDiv(0, 0));
	}

	@Test
	public void floorDiv_DividendZeroDivisorNonZero_ReturnsZero() {
		assertEquals(0, Math.floorDiv(0, 5));
	}

	@Test
	public void floorDiv_DividendNonZeroDivisorZero_ReturnsZero() {
		assertEquals(0, Math.floorDiv(5, 0));
	}

	@Test
	public void floorDiv_PositiveDividendPositiveDivisor_ReturnsFloorDivision() {
		assertEquals(2, Math.floorDiv(5, 2));
	}

	@Test
	public void floorDiv_PositiveDividendNegativeDivisor_ReturnsCeilingDivision() {
		assertEquals(-3, Math.floorDiv(5, -2));
	}

	@Test
	public void floorDiv_NegativeDividendPositiveDivisor_ReturnsCeilingDivision() {
		assertEquals(-3, Math.floorDiv(-5, 2));
	}

	@Test
	public void floorDiv_NegativeDividendNegativeDivisor_ReturnsFloorDivision() {
		assertEquals(2, Math.floorDiv(-5, -2));
	}
}
