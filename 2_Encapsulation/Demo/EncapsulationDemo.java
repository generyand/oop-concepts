/**
 * EncapsulationDemo class to demonstrate encapsulation with BankAccount
 */
public class EncapsulationDemo {
    public static void main(String[] args) {
        // Create a bank account
        BankAccount account = new BankAccount("ACC12345", "John Smith");
        
        // Using getters to access data
        System.out.println("Account Details:");
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Owner: " + account.getOwnerName());
        System.out.println("Initial Balance: $" + account.getBalance());
        
        // Deposit and withdraw through methods that control access to data
        account.deposit(1000);
        System.out.println("Balance after deposit: $" + account.getBalance());
        
        account.withdraw(500);
        System.out.println("Balance after withdrawal: $" + account.getBalance());
        
        // Attempt invalid operations
        account.withdraw(5000); // Should fail - insufficient funds
        
        // Using setter with validation
        account.setOwnerName("Jane Smith");
        System.out.println("New owner: " + account.getOwnerName());
        
        // Cannot directly access or modify private fields
        // account.balance = -1000; // This would cause a compilation error
    }
} 