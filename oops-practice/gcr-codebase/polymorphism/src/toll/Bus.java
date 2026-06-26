package toll;

class Bus extends Vehicle {
    Bus(String vehicleNumber, String ownerName) {
        super(vehicleNumber, ownerName);
    }

    @Override
    double calculateToll() {
        return 200.0;
    }
}
