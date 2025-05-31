/**
 * PolymorphismDemo class to demonstrate polymorphism
 */
public class PolymorphismDemo {
    public static void main(String[] args) {
        // Create shape objects
        Shape genericShape = new Shape("Generic");
        Shape circle = new Circle("Circle One", 5.0);
        Shape rectangle = new Rectangle("Rectangle One", 4.0, 6.0);
        
        // Polymorphism in action - call methods on the base type
        System.out.println("=== Polymorphism with Methods ===");
        System.out.println(genericShape.getName() + " area: " + genericShape.calculateArea());
        System.out.println(circle.getName() + " area: " + circle.calculateArea());
        System.out.println(rectangle.getName() + " area: " + rectangle.calculateArea());
        
        System.out.println("\n=== Drawing Shapes ===");
        genericShape.draw();
        circle.draw();
        rectangle.draw();
        
        // Array of shapes - polymorphism with collections
        System.out.println("\n=== Polymorphism with Collections ===");
        Shape[] shapes = new Shape[3];
        shapes[0] = genericShape;
        shapes[1] = circle;
        shapes[2] = rectangle;
        
        // Process all shapes uniformly
        processShapes(shapes);
        
        // Accessing specific methods requires casting
        System.out.println("\n=== Accessing Specific Methods ===");
        // This won't work without casting: double radius = circle.getRadius();
        Circle actualCircle = (Circle) circle;
        System.out.println("Circle radius: " + actualCircle.getRadius());
        
        Rectangle actualRectangle = (Rectangle) rectangle;
        System.out.println("Rectangle dimensions: " + actualRectangle.getWidth() + " x " + actualRectangle.getHeight());
    }
    
    // Method that works with any Shape - demonstrates polymorphism
    public static void processShapes(Shape[] shapes) {
        for (Shape shape : shapes) {
            System.out.println(shape.getName() + ": ");
            shape.draw();
            System.out.println("Area: " + shape.calculateArea());
        }
    }
} 