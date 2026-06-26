package toll;

public class TollDemo {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
            new Car("MH01AB1234", "Rahul Sharma"),
            new Bus("MH02CD5678", "State Transport"),
            new Truck("MH03EF9012", "Logistics Pvt Ltd"),
            new Car("MH04GH3456", "Priya Patel"),
            new Truck("MH05IJ7890", "FastCargo Inc"),
            new Bus("MH06KL1234", "City Bus Service"),
            new Car("MH07MN5678", "Amit Singh")
        };

        System.out.println("=== Toll Plaza Report ===");
        for (Vehicle v : vehicles) {
            System.out.println(v.ownerName + " (" + v.vehicleNumber + ") paid $" + v.calculateToll());
        }

        System.out.println("\nTotal Revenue: $" + calculateTotalRevenue(vehicles));

        String searchNum = "MH03EF9012";
        System.out.println("\nSearching for vehicle: " + searchNum);
        Vehicle found = searchVehicle(vehicles, searchNum);
        if (found != null) {
            System.out.println("Found - Owner: " + found.ownerName + ", Toll: $" + found.calculateToll());
        } else {
            System.out.println("Vehicle not found");
        }

        Vehicle highest = findHighestToll(vehicles);
        System.out.println("\nHighest Toll Payer: " + highest.ownerName + " ($" + highest.calculateToll() + ")");

        countByType(vehicles);
    }

    static double calculateTotalRevenue(Vehicle[] vehicles) {
        double total = 0;
        for (Vehicle v : vehicles) {
            total += v.calculateToll();
        }
        return total;
    }

    static Vehicle searchVehicle(Vehicle[] vehicles, String vehicleNumber) {
        for (Vehicle v : vehicles) {
            if (v.vehicleNumber.equals(vehicleNumber)) {
                return v;
            }
        }
        return null;
    }

    static Vehicle findHighestToll(Vehicle[] vehicles) {
        Vehicle max = vehicles[0];
        for (Vehicle v : vehicles) {
            if (v.calculateToll() > max.calculateToll()) {
                max = v;
            }
        }
        return max;
    }

    static void countByType(Vehicle[] vehicles) {
        int cars = 0, buses = 0, trucks = 0;
        for (Vehicle v : vehicles) {
            if (v instanceof Car) cars++;
            else if (v instanceof Bus) buses++;
            else if (v instanceof Truck) trucks++;
        }
        System.out.println("\nVehicle Count - Cars: " + cars + ", Buses: " + buses + ", Trucks: " + trucks);
    }
}
