package org.howard.edu.lsp.finalexam.question1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MathUtilsTest {
	MathUtils mathUtils = new MathUtils();

	@Test
    @DisplayName("Test case for factorial")
    public void testFactorial() {
		assertEquals(1, mathUtils.factorial(0), "Factorial of 0 should be 1");

        assertEquals(120, mathUtils.factorial(5), "Factorial of 5 should be 120");

    }

    @Test
    @DisplayName("Test case for isPrime")
    public void testIsPrime() {
    	// Test non prime numbers
        assertFalse(mathUtils.isPrime(100), "100 should not be prime");
		assertFalse(mathUtils.isPrime(0), "0 should not be prime");
		
		//Test prime numbers
        assertTrue(mathUtils.isPrime(3), "3 should be prime");
        assertTrue(mathUtils.isPrime(13), "13 should be prime");

    }

    @Test
    @DisplayName("Test case for gcd")
    public void testGcd() { 
        // Test for positive numbers
        assertEquals(6, mathUtils.gcd(54, 24), "GCD of 54 and 24 should be 6");
        assertEquals(1, mathUtils.gcd(13, 7), "GCD of 13 and 7 should be 1");

        // Test for negative numbers
        assertEquals(6, mathUtils.gcd(-54, -24), "GCD of -54 and -24 should be 6");
        assertEquals(5, mathUtils.gcd(-5, 0), "GCD of -5 and 0 should be 5");
    }
}


