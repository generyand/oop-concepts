/**
 * Main class for the abstraction activity
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("===== Abstraction Activity =====");
        System.out.println("Your task is to implement abstract classes and interfaces.");
        
        System.out.println("\n----- Your Task -----");
        System.out.println("1. Create two concrete classes that extend the abstract Vehicle class:");
        System.out.println("   - Car: with fields for numDoors and fuelType");
        System.out.println("   - Motorcycle: with a field for engineSize (cc)");
        
        System.out.println("\n2. Implement the abstract methods from Vehicle:");
        System.out.println("   - startEngine(): Print a unique starting message for each vehicle type");
        System.out.println("   - calculateFuelEfficiency(): ");
        System.out.println("     * Car: Return 25.0 for 'electric', 20.0 for 'hybrid', 15.0 for others");
        System.out.println("     * Motorcycle: Return 50.0 if engineSize < 500, otherwise 40.0");
        
        System.out.println("\n3. Make both classes implement the Drivable interface:");
        System.out.println("   - drive(int distance): Print a message about driving the distance");
        System.out.println("   - stop(): Print a message about stopping");
        System.out.println("   - Override honk() for Car to print a custom message");
        
        System.out.println("\n4. In this Main class:");
        System.out.println("   - Create an array of Vehicles containing one Car and one Motorcycle");
        System.out.println("   - Create an array of Drivable objects with the same vehicles");
        System.out.println("   - Implement the processVehicles() and testDriving() methods below");
        
        System.out.println("\n// TODO: Uncomment and complete this code once you've created your classes");
        /*
        // Create vehicles
        Vehicle electricCar = new Car("Tesla", "Model 3", 2023, 4, "electric");
        Vehicle sportBike = new Motorcycle("Honda", "CBR", 2022, 600);
        
        // Create arrays for polymorphism
        Vehicle[] vehicles = {electricCar, sportBike};
        Drivable[] drivables = {(Drivable)electricCar, (Drivable)sportBike};
        
        // Test methods
        System.out.println("\n===== VEHICLE INFORMATION =====");
        processVehicles(vehicles);
        
        System.out.println("\n===== DRIVING TEST =====");
        testDriving(drivables);
        */
        
        System.out.println("\n// TODO: Implement these methods");
        /*
        // Process vehicles using the Vehicle abstract class
        public static void processVehicles(Vehicle[] vehicles) {
            for (Vehicle v : vehicles) {
                System.out.println("\nVehicle: " + v.getVehicleInfo());
                v.startEngine();
                System.out.println("Fuel Efficiency: " + v.calculateFuelEfficiency() + " mpg");
            }
        }
        
        // Test driving using the Drivable interface
        public static void testDriving(Drivable[] drivables) {
            for (Drivable d : drivables) {
                d.drive(100);
                d.honk();
                d.stop();
                System.out.println();
            }
        }
        */
    }
} 