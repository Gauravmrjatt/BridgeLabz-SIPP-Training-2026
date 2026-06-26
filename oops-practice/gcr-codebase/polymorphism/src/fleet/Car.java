package fleet;

class Car extends Vehicle {
    @Override
    double fuelCost(int km) {
        return km * 10.0;
    }
}
