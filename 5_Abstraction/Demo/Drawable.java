/**
 * Interface to demonstrate abstraction through interfaces
 */
public interface Drawable {
    // Abstract methods - must be implemented by classes that implement this interface
    void draw();
    
    // Constants in interface
    String TOOL = "Pen";
    
    // Default method (Java 8+)
    default void displayDrawingInfo() {
        System.out.println("Drawing with " + TOOL);
    }
} 