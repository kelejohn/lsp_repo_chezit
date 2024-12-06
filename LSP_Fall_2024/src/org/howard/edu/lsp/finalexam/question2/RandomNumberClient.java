package org.howard.edu.lsp.finalexam.question2;

/**
 * RandomNumberClient demonstrates how to use RandomNumberService with different strategies.
 */
public class RandomNumberClient {
    public static void main(String[] args) {
        // Get the singleton instance of RandomNumberService
        RandomNumberService randomService = RandomNumberService.getInstance();

        // Use Java's built-in Random
        System.out.println("Using Java's built-in Random:");
        randomService.setStrategy(new JavaRandomStrategy());
        System.out.println(randomService.getRandomNumber());

        // Use Linear Congruential Generator (LCG)
        System.out.println("Using Linear Congruential Generator (LCG):");
        randomService.setStrategy(new LCGRandomStrategy(12345L));  // Initial seed can be any long value
        System.out.println(randomService.getRandomNumber());
    }
}
