package toll;

class Truck extends Vehicle {
    Truck(String vehicleNumber, String ownerName) {
        super(vehicleNumber, ownerName);
    }

    @Override
    double calculateToll() {
        return 350.0;
    }
}
