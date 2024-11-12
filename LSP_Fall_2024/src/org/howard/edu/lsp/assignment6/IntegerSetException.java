package org.howard.edu.lsp.assignment6;

/**
 * Custom exception class for IntegerSet operations.
 * This exception is thrown when trying to access the largest or smallest
 * element in an empty set.
 */

public class IntegerSetException extends Exception {
	/**
     * Constructor for IntegerSetException with a specified message.
     *
     * @param message the error message for the exception
     */
    public IntegerSetException(String message) {
        super(message);
    }

}
