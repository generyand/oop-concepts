/**
 * A simple Book class to demonstrate class structure in Java
 */
public class Book {
    // Fields (attributes)
    String title;
    String author;
    int pages;
    
    // Constructor
    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }
    
    // Method
    public void displayInfo() {
        System.out.println("Book Details:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
    }
} 