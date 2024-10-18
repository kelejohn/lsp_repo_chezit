package org.howard.edu.lsp.midterm.question2;

/**
 * The Calculator class provides static methods to sum integers, doubles, 
 * and an array of integers.
 */

public class Calculator {
	
	/**
     * Sums two integers.
     * 
     * @param a: the first integer
     * @param b:the second integer
     * @return the sum of a and b
     */
	
    //Sum of two integers
    public static int sum(int a, int b) {
        return a + b;
    }

    /**
     * Sums two double values.
     * 
     * @param a: the first double
     * @param b: the second double
     * @return the sum of a and b
     */
    
    //Sum of two doubles
    public static double sum(double a, double b) {
        return a + b;
    }
    /**
     * Sums all elements in an array of integers.
     * 
     * @param arr: the array of integers
     * @return the sum of all elements in the array
     */
    
    //Sum all elements in an array of integers
    public static int sum(int[] arr) {
        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
        return sum;
    }
}
	
