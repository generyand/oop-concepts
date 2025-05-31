/**
 * Drivable interface for the abstraction activity
 */
public interface Drivable {
    // Abstract methods
    void drive(int distance);
    void stop();
    
    // Default method
    default void honk() {
        System.out.println("Beep Beep!");
    }
} 