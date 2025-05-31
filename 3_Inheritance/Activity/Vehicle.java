/**
 * Base Vehicle class for the inheritance activity
 */
public class Vehicle {
    // Fields
    protected String make;
    protected String model;
    protected int year;
    
    // Constructor
    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    
    // Methods
    public void startEngine() {
        System.out.println("Vehicle engine started");
    }
    
    public void stopEngine() {
        System.out.println("Vehicle engine stopped");
    }
    
    public String getInfo() {
        return year + " " + make + " " + model;
    }
} 