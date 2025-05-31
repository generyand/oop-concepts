/**
 * AbstractionDemo class to demonstrate abstraction
 */
public class AbstractionDemo {
    public static void main(String[] args) {
        // Cannot instantiate abstract class
        // Shape shape = new Shape("Generic"); // This would cause a compilation error
        
        // Create concrete implementations
        Shape circle = new Circle("Circle One", 5.0);
        Shape rectangle = new Rectangle("Rectangle One", 4.0, 6.0);
        
        System.out.println("=== Using Abstract Class Methods ===");
        // Call methods from abstract class
        circle.displayInfo();
        rectangle.displayInfo();
        
        System.out.println("\n=== Using Interface Methods ===");
        // Using the interface type
        Drawable circleDrawable = (Circle) circle;
        Drawable rectangleDrawable = (Rectangle) rectangle;
        
        // Call methods from interface
        circleDrawable.draw();
        circleDrawable.displayDrawingInfo(); // Default method
        
        rectangleDrawable.draw();
        rectangleDrawable.displayDrawingInfo(); // Default method
        
        System.out.println("\n=== Processing Different Shapes ===");
        // Demonstrate polymorphism with abstract classes
        processShapes(new Shape[] {circle, rectangle});
        
        System.out.println("\n=== Drawing Different Objects ===");
        // Demonstrate polymorphism with interfaces
        drawObjects(new Drawable[] {(Drawable)circle, (Drawable)rectangle});
    }
    
    // Method that works with abstract Shape class
    public static void processShapes(Shape[] shapes) {
        for (Shape shape : shapes) {
            System.out.println(shape.getName() + " area: " + shape.calculateArea());
        }
    }
    
    // Method that works with Drawable interface
    public static void drawObjects(Drawable[] drawables) {
        for (Drawable drawable : drawables) {
            drawable.draw();
        }
    }
} 