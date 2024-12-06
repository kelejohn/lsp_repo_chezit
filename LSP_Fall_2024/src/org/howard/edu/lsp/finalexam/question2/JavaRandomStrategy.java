package org.howard.edu.lsp.finalexam.question2;

import java.util.Random;

/**
 * JavaRandomStrategy uses Java's built-in Random class to generate random numbers.
 */
public class JavaRandomStrategy implements RandomNumberStrategy {
    private Random random;

    public JavaRandomStrategy() {
        this.random = new Random();
    }

    @Override
    public int generateRandomNumber() {
        return Math.abs(random.nextInt());  // Ensure a positive integer is returned
    }
}