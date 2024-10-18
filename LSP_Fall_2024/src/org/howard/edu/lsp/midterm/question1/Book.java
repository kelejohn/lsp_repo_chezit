package org.howard.edu.lsp.midterm.question1;

public class Book {
	private String title;
	private String author;
	private String IBSN;
	private int yearPublished;
	
	//constructor
	public void Book(String title, String author, String IBSN, int yearPublished) {
		this.title = title;
		this.author = author;
		this.IBSN = IBSN;
		this.yearPublished = yearPublished;
	}
	
	// title getter and setter
	public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

	// author getter and setter
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

	// IBSN getter and setter
    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

	// year publish getter and setter
    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    // Override equals() method -- books are the same if IBSN and author are same
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return ISBN.equals(book.ISBN) && author.equals(book.author);
    }

    // Override toString() method to return string representation of object
    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + ISBN + ", Year Published: " + yearPublished;
    }
}
}
