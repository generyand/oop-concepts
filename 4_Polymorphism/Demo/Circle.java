/**
 * Circle class that extends Shape
 */
public class Circle extends Shape {
    private double radius;
    
    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }
    
    // Override the base class method
    @Override
    public double calculateArea() {
        double area = Math.PI * radius * radius;
        return area;
    }
    
    // Override the base class method
    @Override
    public void draw() {
        System.out.println("Drawing a circle with radius " + radius);
    }
    
    // Circle-specific method
    public double getRadius() {
        return radius;
    }
} 