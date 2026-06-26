package fleet;

class Bus extends Vehicle {
    @Override
    double fuelCost(int km) {
        return km * 15.0;
    }
}
