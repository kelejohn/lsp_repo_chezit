package org.howard.edu.lsp.midterm.question1;

/**
 * The Book class represents a book with attributes such as title, author, ISBN, and year published.
 */

public class Book {
	
	private String title;
	private String author;
	private String ISBN;
	private int yearPublished;


	/**
     * Constructs a new Book object with the specified title, author, ISBN, and year published.
     * 
     * @param title : the title of the book
     * @param author : the author of the book
     * @param ISBN : the ISBN of the book (unique identifier)
     * @param yearPublished : the year the book was published
     */
	
	//constructor
	public Book(String title, String author, String ISBN, int yearPublished) {
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
		this.yearPublished = yearPublished;
	}
	
    /**
     * @return the title of the book
     */
	// title getter and setter
	public String getTitle() {
        return title;
    }

    /**
     * @param title : the new title of the book
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the author of the book
     */
	// author getter and setter
    public String getAuthor() {
        return author;
    }


    /**
     * @param author : the new author of the book
     */
    public void setAuthor(String author) {
        this.author = author;
    }


    /**
     * @return the ISBN of the book
     */
	// IBSN getter and setter
    public String getISBN() {
        return ISBN;
    }


    /**
     * @param ISBN : the new ISBN of the book
     */
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }


    /**
     * @return the year the book was published
     */
	// year publish getter and setter
    public int getYearPublished() {
        return yearPublished;
    }

    /**
     * @param yearPublished : the new year the book was published
     */

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }
    
    /**
     * Checks if two books are the same based on their ISBN and author.
     * 
     * @param obj : the object to compare with
     * @return true if the books have the same ISBN and author, false otherwise
     */

    // Override equals() method -- books are the same if IBSN and author are same
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return ISBN.equals(book.ISBN) && author.equals(book.author);
    }
    
    /**
     * Returns a string representation of the book.
     * 
     * @return a string representation of the book in the format: 
     * "Title: [title], Author: [author], ISBN: [ISBN], Year Published: [yearPublished]"
     */

    // Override toString() method to return string representation of object
    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + ISBN + ", Year Published: " + yearPublished;
    }
}

