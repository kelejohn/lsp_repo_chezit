package org.howard.edu.lsp.midterm.question1;

/**
 * The BookDriver class tests the functionality of the Book class.
 */

public class BookDriver {
	
    /**
     * The main method tests the Book class equals and toString methods.
     * 
     * @param args command-line arguments (not used)
     */
	 public static void main(String[] args) {
		 Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "123456789", 1925);
		 Book book2 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "123456789", 1925);
		 Book book3 = new Book("A Promised Land", "Barack Obama", "9780593239681", 2020);
		 
		 System.out.println(book1.equals(book2)); // true
		 System.out.println(book1.equals(book3)); // false
		 
		 System.out.println(book1); // Output: Title: The Great Gatsby, Author: F. Scott Fitzgerald, ISBN: 123456789, Year Published: 1925
	 }

}
