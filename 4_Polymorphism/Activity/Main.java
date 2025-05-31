/**
 * Main class for polymorphism activity
 */
public class Main {
    public static void main(String[] args) {
        // Example of the base Employee class
        Employee genericEmployee = new Employee("John Smith", "EMP100", 50000);
        genericEmployee.displayDetails();
        System.out.println("Salary: $" + genericEmployee.calculateSalary());
        
        System.out.println("\n----- Your Task -----");
        System.out.println("1. Create two classes that extend Employee:");
        System.out.println("   - Manager: with a bonus field");
        System.out.println("   - Developer: with a programming language field");
        System.out.println("2. Override calculateSalary() in both classes:");
        System.out.println("   - Manager: add the bonus to base salary");
        System.out.println("   - Developer: add 10% to base salary if they know Java");
        System.out.println("3. Override displayDetails() to include the additional fields");
        System.out.println("4. Create a payroll method that processes an array of Employees");
        
        System.out.println("\n----- Implement -----");
        System.out.println("// TODO: Create Manager and Developer classes");
        
        System.out.println("\n// TODO: Uncomment and complete this code once you've created your classes");
        /*
        // Create employees
        Employee manager = new Manager("Jane Doe", "MGR200", 80000, 10000);
        Employee javaDev = new Developer("Bob Johnson", "DEV300", 65000, "Java");
        Employee pythonDev = new Developer("Alice Williams", "DEV301", 62000, "Python");
        
        // Create employee array
        Employee[] employees = {genericEmployee, manager, javaDev, pythonDev};
        
        // Use polymorphism to process all employees
        System.out.println("\n===== PAYROLL SYSTEM =====");
        processPayroll(employees);
        */
        
        System.out.println("\n// TODO: Implement the processPayroll method");
        /*
        // Sample implementation of processPayroll
        public static void processPayroll(Employee[] employees) {
            double totalPayroll = 0;
            
            for (Employee emp : employees) {
                System.out.println("\nProcessing payment for: " + emp.getName());
                emp.displayDetails();
                double salary = emp.calculateSalary();
                System.out.println("Final Salary: $" + salary);
                totalPayroll += salary;
            }
            
            System.out.println("\nTotal Payroll: $" + totalPayroll);
        }
        */
    }
} 