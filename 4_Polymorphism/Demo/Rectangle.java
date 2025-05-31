/**
 * Rectangle class that extends Shape
 */
public class Rectangle extends Shape {
    private double width;
    private double height;
    
    public Rectangle(String name, double width, double height) {
        super(name);
        this.width = width;
        this.height = height;
    }
    
    // Override the base class method
    @Override
    public double calculateArea() {
        return width * height;
    }
    
    // Override the base class method
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle with width " + width + " and height " + height);
    }
    
    // Rectangle-specific methods
    public double getWidth() {
        return width;
    }
    
    public double getHeight() {
        return height;
    }
} 