/**
 * Manager class extending Employee for polymorphism activity
 */
public class Manager extends Employee {
    private double bonus;
    
    public Manager(String name, String id, double baseSalary, double bonus) {
        super(name, id, baseSalary);
        this.bonus = bonus;
    }
    
    // Override method from Employee class
    @Override
    public double calculateSalary() {
        return baseSalary + bonus;
    }
    
    // Override method from Employee class
    @Override
    public void displayDetails() {
        System.out.println("Manager [ID: " + id + ", Name: " + name + "]");
        System.out.println("Base Salary: $" + baseSalary);
        System.out.println("Bonus: $" + bonus);
    }
} 