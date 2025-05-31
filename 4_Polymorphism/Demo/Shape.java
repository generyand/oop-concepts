/**
 * Base Shape class to demonstrate polymorphism
 */
public class Shape {
    protected String name;
    
    public Shape(String name) {
        this.name = name;
    }
    
    // Method to be overridden by subclasses
    public double calculateArea() {
        System.out.println("Cannot calculate area for generic shape");
        return 0.0;
    }
    
    // Method to be overridden by subclasses
    public void draw() {
        System.out.println("Drawing a generic shape");
    }
    
    public String getName() {
        return name;
    }
} 