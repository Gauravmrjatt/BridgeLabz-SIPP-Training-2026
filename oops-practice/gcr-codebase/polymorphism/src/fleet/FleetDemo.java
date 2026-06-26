package fleet;

public class FleetDemo {
    public static void main(String[] args) {
        Vehicle[] fleet = {new Car(), new Bus(), new Bike(), new ElectricCar()};

        System.out.println("=== Transport Fleet Fuel Cost ===");
        for (Vehicle v : fleet) {
            double cost = v.fuelCost(100);
            String type = "";
            if (v instanceof Car) {
                Car c = (Car) v;
                type = "Car";
            } else if (v instanceof Bus) {
                Bus b = (Bus) v;
                type = "Bus";
            } else if (v instanceof Bike) {
                Bike bk = (Bike) v;
                type = "Bike";
            } else if (v instanceof ElectricCar) {
                ElectricCar ec = (ElectricCar) v;
                type = "ElectricCar";
            }
            System.out.println(type + " fuel cost for 100 km: $" + cost);
        }

        processPolymorphically(fleet);
    }

    static void processPolymorphically(Vehicle[] vehicles) {
        System.out.println("\nPolymorphic processing:");
        for (Vehicle v : vehicles) {
            System.out.println("Fuel cost: " + v.fuelCost(100));
        }
    }
}
