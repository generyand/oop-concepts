/**
 * AbstractionActivity class for the abstraction activity
 * 
 * Your Task:
 * 1. Create two concrete classes that extend the abstract Vehicle class:
 *    - Car: with fields for numDoors and fuelType
 *    - Motorcycle: with a field for engineSize (cc)
 * 
 * 2. Implement the abstract methods from Vehicle:
 *    - startEngine(): Print a unique starting message for each vehicle type
 *    - calculateFuelEfficiency():
 *      * Car: Return 25.0 for 'electric', 20.0 for 'hybrid', 15.0 for others
 *      * Motorcycle: Return 50.0 if engineSize < 500, otherwise 40.0
 * 
 * 3. Make both classes implement the Drivable interface:
 *    - drive(int distance): Print a message about driving the distance
 *    - stop(): Print a message about stopping
 *    - Override honk() for Car to print a custom message
 * 
 * 4. In this class (AbstractionActivity):
 *    - Create an array of Vehicles containing one Car and one Motorcycle
 *    - Create an array of Drivable objects with the same vehicles
 *    - Implement the processVehicles() and testDriving() methods
 * 
 * Expected Implementation:
 * 1. Create Car.java and Motorcycle.java files
 * 2. In this file, implement two methods:
 *    - processVehicles(): Takes an array of Vehicle objects
 *      * Prints vehicle info, starts engine, and shows fuel efficiency
 *    - testDriving(): Takes an array of Drivable objects
 *      * Tests drive, honk, and stop methods on each
 * 
 * Sample Output:
 * ===== VEHICLE INFORMATION =====
 * Vehicle: 2023 Tesla Model 3
 * Starting electric car...
 * Fuel Efficiency: 25.0 mpg
 * 
 * Vehicle: 2022 Honda CBR
 * Kick-starting motorcycle...
 * Fuel Efficiency: 40.0 mpg
 * 
 * ===== DRIVING TEST =====
 * Driving Tesla Model 3 for 100 miles on electric power
 * Honk honk! Tesla horn sounds
 * Electric car stopped
 * 
 * Motorcycle cruising for 100 miles
 * Beep Beep!
 * Motorcycle has stopped
 */
public class AbstractionActivity {
    public static void main(String[] args) {
        System.out.println("===== Abstraction Activity =====");
        System.out.println("See the class comments for instructions on completing this activity.");
        
        // TODO: Implement your solution here according to the instructions in the class comments
    }
} 