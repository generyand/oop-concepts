/**
 * PolymorphismActivity class for polymorphism activity
 * 
 * Your Task:
 * 1. Create two classes that extend Employee:
 *    - Manager: with a bonus field
 *    - Developer: with a programming language field
 * 
 * 2. Override calculateSalary() in both classes:
 *    - Manager: add the bonus to base salary
 *    - Developer: add 10% to base salary if they know Java
 * 
 * 3. Override displayDetails() to include the additional fields
 * 
 * 4. Create a payroll method that processes an array of Employees
 * 
 * Expected Implementation:
 * 1. Create Manager.java and Developer.java files
 * 2. In this file, create a processPayroll method that:
 *    - Takes an array of Employee objects
 *    - Calls displayDetails() and calculateSalary() on each
 *    - Calculates and displays the total payroll
 * 3. In the main method:
 *    - Create instances of Manager and Developer
 *    - Create an array with all employees
 *    - Call the processPayroll method
 * 
 * Sample Output:
 * Employee [ID: EMP100, Name: John Smith]
 * Base Salary: $50000.0
 * Salary: $50000.0
 * 
 * Manager [ID: MGR200, Name: Jane Doe]
 * Base Salary: $80000.0
 * Bonus: $10000.0
 * Salary: $90000.0
 * 
 * Developer [ID: DEV300, Name: Bob Johnson]
 * Base Salary: $65000.0
 * Programming Language: Java
 * Salary: $71500.0
 */
public class PolymorphismActivity {
    public static void main(String[] args) {
        // Example of the base Employee class
        Employee genericEmployee = new Employee("John Smith", "EMP100", 50000);
        genericEmployee.displayDetails();
        System.out.println("Salary: $" + genericEmployee.calculateSalary());
        
        // TODO: Implement the rest of the activity according to the instructions above
    }
} 