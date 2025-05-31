/**
 * Employee base class for polymorphism activity
 */
public class Employee {
    protected String name;
    protected String id;
    protected double baseSalary;
    
    public Employee(String name, String id, double baseSalary) {
        this.name = name;
        this.id = id;
        this.baseSalary = baseSalary;
    }
    
    // Method to be overridden by subclasses
    public double calculateSalary() {
        return baseSalary;
    }
    
    // Method to be overridden by subclasses
    public void displayDetails() {
        System.out.println("Employee [ID: " + id + ", Name: " + name + "]");
        System.out.println("Base Salary: $" + baseSalary);
    }
    
    // Getters
    public String getName() {
        return name;
    }
    
    public String getId() {
        return id;
    }
} 