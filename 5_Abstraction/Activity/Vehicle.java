/**
 * Abstract Vehicle class for the abstraction activity
 */
public abstract class Vehicle {
    protected String make;
    protected String model;
    protected int year;
    
    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    
    // Abstract methods
    public abstract void startEngine();
    public abstract double calculateFuelEfficiency();
    
    // Concrete method
    public String getVehicleInfo() {
        return year + " " + make + " " + model;
    }
} 