package fleet;

class ElectricCar extends Vehicle {
    @Override
    double fuelCost(int km) {
        return km * 2.0;
    }
}
