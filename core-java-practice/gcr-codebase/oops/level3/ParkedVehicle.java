public class ParkedVehicle {
    String vehicleNumber;
    String ownerName;
    String vehicleType;

    public ParkedVehicle(String vehicleNumber, String ownerName, String vehicleType) {
        this.vehicleNumber = vehicleNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public static void displayCars(ParkedVehicle[] vehicles) {
        System.out.println("--- Cars ---");
        for (ParkedVehicle v : vehicles) {
            if (v.vehicleType.equalsIgnoreCase("Car")) {
                System.out.println(v.vehicleNumber + " - " + v.ownerName);
            }
        }
    }

    public static void displayBikes(ParkedVehicle[] vehicles) {
        System.out.println("--- Bikes ---");
        for (ParkedVehicle v : vehicles) {
            if (v.vehicleType.equalsIgnoreCase("Bike")) {
                System.out.println(v.vehicleNumber + " - " + v.ownerName);
            }
        }
    }

    public static void main(String[] args) {
        ParkedVehicle[] vehicles = new ParkedVehicle[10];
        vehicles[0] = new ParkedVehicle("MH-01-AB-1001", "Alice", "Car");
        vehicles[1] = new ParkedVehicle("MH-02-CD-2002", "Bob", "Bike");
        vehicles[2] = new ParkedVehicle("MH-03-EF-3003", "Charlie", "Car");
        vehicles[3] = new ParkedVehicle("MH-04-GH-4004", "Diana", "Bike");
        vehicles[4] = new ParkedVehicle("MH-05-IJ-5005", "Eve", "Truck");
        vehicles[5] = new ParkedVehicle("MH-06-KL-6006", "Frank", "Car");
        vehicles[6] = new ParkedVehicle("MH-07-MN-7007", "Grace", "Bike");
        vehicles[7] = new ParkedVehicle("MH-08-OP-8008", "Henry", "Car");
        vehicles[8] = new ParkedVehicle("MH-09-QR-9009", "Ivy", "Bike");
        vehicles[9] = new ParkedVehicle("MH-10-ST-1010", "Jack", "Car");

        displayCars(vehicles);
        displayBikes(vehicles);
    }
}
