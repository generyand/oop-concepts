/**
 * Subclass extending Animal to demonstrate inheritance
 */
public class Dog extends Animal {
    // Additional field for the subclass
    private String breed;
    
    // Constructor
    public Dog(String name, int age, String breed) {
        // Call the parent constructor
        super(name, age);
        this.breed = breed;
    }
    
    // Override parent method
    @Override
    public void makeSound() {
        System.out.println(name + " barks: Woof! Woof!");
    }
    
    // Additional method specific to Dog
    public void fetch() {
        System.out.println(name + " is fetching the ball");
    }
    
    // Getter for the additional field
    public String getBreed() {
        return breed;
    }
} 