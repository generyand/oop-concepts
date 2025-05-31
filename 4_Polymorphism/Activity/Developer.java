/**
 * Developer class extending Employee for polymorphism activity
 */
public class Developer extends Employee {
    private String programmingLanguage;
    
    public Developer(String name, String id, double baseSalary, String programmingLanguage) {
        super(name, id, baseSalary);
        this.programmingLanguage = programmingLanguage;
    }
    
    // Override method from Employee class
    @Override
    public double calculateSalary() {
        // Add 10% bonus if they know Java
        if (programmingLanguage.equalsIgnoreCase("Java")) {
            return baseSalary * 1.10; // 10% more
        }
        return baseSalary;
    }
    
    // Override method from Employee class
    @Override
    public void displayDetails() {
        System.out.println("Developer [ID: " + id + ", Name: " + name + "]");
        System.out.println("Base Salary: $" + baseSalary);
        System.out.println("Programming Language: " + programmingLanguage);
    }
} 