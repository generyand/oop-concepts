/**
 * Main class for the inheritance activity
 */
public class Main {
    public static void main(String[] args) {
        // Example usage of the base Vehicle class
        Vehicle genericVehicle = new Vehicle("Generic", "Vehicle", 2023);
        System.out.println("Generic Vehicle Info: " + genericVehicle.getInfo());
        genericVehicle.startEngine();
        genericVehicle.stopEngine();
        
        System.out.println("\n----- Your Task -----");
        System.out.println("1. Create two classes that extend Vehicle:");
        System.out.println("   - Car with an additmional 'numDoors' field");
        System.out.println("   - Motorcycle with an additional 'hasSidecar' field");
        System.out.println("2. Override the startEngine() method in both classes to print a more specific message");
        System.out.println("3. Override the getInfo() method to include the additional information");
        System.out.println("4. Add a unique method to each class (e.g., honkHorn() for Car)");
        System.out.println("5. Create instances of your classes and test all the methods");
        
        // TODO: Uncomment and complete once you've created your classes
        /*
        // Testing Car class
        Car myCar = new Car("Toyota", "Camry", 2022, 4);
        System.out.println("\nCar Info: " + myCar.getInfo());
        myCar.startEngine();
        myCar.honkHorn(); // Your unique Car method
        myCar.stopEngine();
        
        // Testing Motorcycle class
        Motorcycle myMotorcycle = new Motorcycle("Harley-Davidson", "Sportster", 2021, false);
        System.out.println("\nMotorcycle Info: " + myMotorcycle.getInfo());
        myMotorcycle.startEngine();
        myMotorcycle.doWheelie(); // Your unique Motorcycle method
        myMotorcycle.stopEngine();
        */
    }
} 