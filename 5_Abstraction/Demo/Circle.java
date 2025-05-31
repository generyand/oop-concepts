/**
 * Circle class that extends abstract Shape and implements Drawable
 */
public class Circle extends Shape implements Drawable {
    private double radius;
    
    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }
    
    // Implement abstract method from Shape
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    
    // Implement abstract method from Drawable interface
    @Override
    public void draw() {
        System.out.println("Drawing a circle with radius " + radius);
    }
    
    public double getRadius() {
        return radius;
    }
} 