package org.howard.edu.lsp.finalexam.question2;

/**
 * RandomNumberService is a singleton service that provides random numbers.
 * It allows the client to choose between different random number generation strategies.
 */
public class RandomNumberService {
    private static RandomNumberService instance;
    private RandomNumberStrategy strategy;

    private RandomNumberService() {
        // Default strategy (Java built-in Random)
        this.strategy = new JavaRandomStrategy();
    }

    /**
     * Get the singleton instance of RandomNumberService.
     * @return the instance of RandomNumberService.
     */
    public static RandomNumberService getInstance() {
        if (instance == null) {
            instance = new RandomNumberService();
        }
        return instance;
    }

    /**
     * Set the strategy for generating random numbers.
     * @param strategy the strategy to be used for random number generation.
     */
    public void setStrategy(RandomNumberStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     * Get a random number using the current strategy.
     * @return a random positive integer.
     */
    public int getRandomNumber() {
        return strategy.generateRandomNumber();
    }
}
