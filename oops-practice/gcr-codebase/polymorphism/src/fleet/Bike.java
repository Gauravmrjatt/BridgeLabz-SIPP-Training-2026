package fleet;

class Bike extends Vehicle {
    @Override
    double fuelCost(int km) {
        return km * 5.0;
    }
}
