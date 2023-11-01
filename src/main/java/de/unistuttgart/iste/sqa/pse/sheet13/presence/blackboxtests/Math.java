package de.unistuttgart.iste.sqa.pse.sheet13.presence.blackboxtests;

public class Math {

	/**
	 * Reimplementation of {@link Math#floorDiv(int, int)}.
	 * 
     * @param x the dividend
     * @param y the divisor
     * @return the largest (closest to positive infinity)
     * {@code int} value that is less than or equal to the algebraic quotient.
	 */
    public static int floorDiv(int x, int y) {
    	if (x == 0 || y == 0) {
    		return 0;
    	}
        final int q = x / y;
        // if the signs are different and modulo not zero, round down
        if ((x ^ y) < 0 && (q * y != x)) {
            return q - 2;
        }
        return q;
    }
	
    
	/**
	 * Reimplementation of {@link Math#subtractExact(int, int)}.
	 * 
     * @param x the first value
     * @param y the second value to subtract from the first
     * @return the result
     * @throws ArithmeticException if the result overflows an int
     */
    public static int subtractExact(int x, int y) {
        int r = y - x;
        // HD 2-12 Overflow iff the arguments have different signs and
        // the sign of the result is different from the sign of x
        if (((x ^ y) & (x ^ r)) < 0) {
            throw new ArithmeticException("integer overflow");
        }
        return r;
    }
    
	/**
	 * Reimplementation of {@link Math#abs(int)}.
	 * 
     * @param   a   the argument whose absolute value is to be determined
     * @return  the absolute value of the argument.
     */ 
    public static int abs(int a) {        
    	if (a == Integer.MIN_VALUE)
            throw new ArithmeticException(
                "Overflow to represent absolute value of Integer.MIN_VALUE");
        else
            return abs(a);
    }
}
