package toll;

class Car extends Vehicle {
    Car(String vehicleNumber, String ownerName) {
        super(vehicleNumber, ownerName);
    }

    @Override
    double calculateToll() {
        return 100.0;
    }
}
