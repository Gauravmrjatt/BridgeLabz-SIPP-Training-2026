import java.util.ArrayList;
import java.util.Scanner;

public class SmartParkingSlotManager {
    private ArrayList<String> vehicles;
    private static final int MAX_SLOTS = 10;

    public SmartParkingSlotManager() {
        vehicles = new ArrayList<>();
    }

    public void addVehicle(String registrationNumber) {
        if (vehicles.size() >= MAX_SLOTS) {
            System.out.println("Parking is full. No slots available.");
            return;
        }
        if (vehicles.contains(registrationNumber)) {
            System.out.println("Vehicle " + registrationNumber + " is already parked.");
            return;
        }
        vehicles.add(registrationNumber);
        System.out.println("Vehicle " + registrationNumber + " parked successfully.");
    }

    public void removeVehicle(String registrationNumber) {
        if (vehicles.remove(registrationNumber)) {
            System.out.println("Vehicle " + registrationNumber + " has left the parking.");
        } else {
            System.out.println("Vehicle " + registrationNumber + " not found in parking.");
        }
    }

    public void searchVehicle(String registrationNumber) {
        int index = vehicles.indexOf(registrationNumber);
        if (index != -1) {
            System.out.println("Vehicle " + registrationNumber + " is parked at slot " + (index + 1) + ".");
        } else {
            System.out.println("Vehicle " + registrationNumber + " is not in the parking.");
        }
    }

    public void displayAllVehicles() {
        if (vehicles.isEmpty()) {
            System.out.println("No vehicles currently parked.");
            return;
        }
        System.out.println("Parked Vehicles:");
        for (int i = 0; i < vehicles.size(); i++) {
            System.out.println("Slot " + (i + 1) + ": " + vehicles.get(i));
        }
        System.out.println("Total occupied slots: " + vehicles.size());
    }

    public static void main(String[] args) {
        SmartParkingSlotManager manager = new SmartParkingSlotManager();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Smart Parking Slot Manager ---");
            System.out.println("1. Add Vehicle");
            System.out.println("2. Remove Vehicle");
            System.out.println("3. Search Vehicle");
            System.out.println("4. Display All Vehicles");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter vehicle registration number: ");
                    String regToAdd = scanner.nextLine();
                    manager.addVehicle(regToAdd);
                    break;
                case 2:
                    System.out.print("Enter vehicle registration number: ");
                    String regToRemove = scanner.nextLine();
                    manager.removeVehicle(regToRemove);
                    break;
                case 3:
                    System.out.print("Enter vehicle registration number: ");
                    String regToSearch = scanner.nextLine();
                    manager.searchVehicle(regToSearch);
                    break;
                case 4:
                    manager.displayAllVehicles();
                    break;
                case 5:
                    System.out.println("Exiting... Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
