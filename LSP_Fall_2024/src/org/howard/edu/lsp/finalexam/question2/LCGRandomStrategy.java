package org.howard.edu.lsp.finalexam.question2;

/**
 * LCGRandomStrategy uses a simple Linear Congruential Generator algorithm to generate random numbers.
 */
public class LCGRandomStrategy implements RandomNumberStrategy {
    private long seed;

    public LCGRandomStrategy(long seed) {
        this.seed = seed;
    }

    @Override
    public int generateRandomNumber() {
        seed = (seed * 1664525 + 1013904223) % (1 << 32);  // Example LCG parameters
        return Math.abs((int) seed);
    }
}