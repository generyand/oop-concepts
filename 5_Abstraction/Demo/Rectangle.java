/**
 * Rectangle class that extends abstract Shape and implements Drawable
 */
public class Rectangle extends Shape implements Drawable {
    private double width;
    private double height;
    
    public Rectangle(String name, double width, double height) {
        super(name);
        this.width = width;
        this.height = height;
    }
    
    // Implement abstract method from Shape
    @Override
    public double calculateArea() {
        return width * height;
    }
    
    // Implement abstract method from Drawable interface
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle with width " + width + " and height " + height);
    }
    
    public double getWidth() {
        return width;
    }
    
    public double getHeight() {
        return height;
    }
} 