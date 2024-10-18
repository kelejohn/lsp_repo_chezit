package org.howard.edu.lsp.midterm.question2;

public class Calculator {
	
    //Sum of two integers
    public static int sum(int a, int b) {
        return a + b;
    }

    //Sum of two doubles
    public static double sum(double a, double b) {
        return a + b;
    }

    //Sum all elements in an array of integers
    public static int sum(int[] arr) {
        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
        return sum;
    }
}
	
}
