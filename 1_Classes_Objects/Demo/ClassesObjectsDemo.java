/**
 * ClassesObjectsDemo class to demonstrate creating and using objects
 */
public class ClassesObjectsDemo {
    public static void main(String[] args) {
        // Creating objects (instances) of the Book class
        Book harryPotter = new Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling", 320);
        Book lordOfRings = new Book("The Lord of the Rings", "J.R.R. Tolkien", 1178);
        
        // Using the objects by calling their methods
        System.out.println("First book:");
        harryPotter.displayInfo();
        
        System.out.println("\nSecond book:");
        lordOfRings.displayInfo();
        
        // This demonstrates:
        // 1. Class as a template (Book)
        // 2. Objects as instances of a class (harryPotter, lordOfRings)
        // 3. Objects having attributes (title, author, pages)
        // 4. Objects having behaviors (displayInfo method)
    }
} 