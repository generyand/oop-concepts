/**
 * Abstract class to demonstrate abstraction
 */
public abstract class Shape {
    protected String name;
    
    public Shape(String name) {
        this.name = name;
    }
    
    // Abstract methods - must be implemented by subclasses
    public abstract double calculateArea();
    public abstract void draw();
    
    // Concrete method
    public void displayInfo() {
        System.out.println("Shape: " + name);
        System.out.println("Area: " + calculateArea());
    }
    
    public String getName() {
        return name;
    }
} 