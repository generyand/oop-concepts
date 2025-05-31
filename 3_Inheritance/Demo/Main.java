/**
 * Main class to demonstrate inheritance
 */
public class Main {
    public static void main(String[] args) {
        // Create an instance of the parent class
        Animal genericAnimal = new Animal("Generic Animal", 5);
        
        // Create an instance of the child class
        Dog buddy = new Dog("Buddy", 3, "Golden Retriever");
        
        // Using parent class methods
        System.out.println("=== Generic Animal ===");
        System.out.println("Name: " + genericAnimal.getName());
        System.out.println("Age: " + genericAnimal.getAge());
        genericAnimal.eat();
        genericAnimal.sleep();
        genericAnimal.makeSound();
        
        System.out.println("\n=== Dog ===");
        // Using inherited methods
        System.out.println("Name: " + buddy.getName());
        System.out.println("Age: " + buddy.getAge());
        buddy.eat();    // Inherited from Animal
        buddy.sleep();  // Inherited from Animal
        
        // Using overridden method
        buddy.makeSound(); // Overridden version
        
        // Using dog-specific method and property
        System.out.println("Breed: " + buddy.getBreed());
        buddy.fetch();  // Dog-specific method
        
        // Demonstrating polymorphism (will be covered more in the next section)
        System.out.println("\n=== Polymorphism Preview ===");
        Animal dogAsAnimal = new Dog("Rex", 2, "German Shepherd");
        dogAsAnimal.makeSound(); // Calls Dog's version
    }
} 