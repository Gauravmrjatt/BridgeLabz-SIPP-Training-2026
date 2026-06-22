public class ChargingStation {
    static int totalStations = 0;
    static double electricityRate = 0.15;

    String stationId;
    double unitsConsumed;

    public ChargingStation(String stationId) {
        this.stationId = stationId;
        this.unitsConsumed = 0;
        totalStations++;
    }

    public static void updateElectricityRate(double newRate) {
        electricityRate = newRate;
        System.out.println("Electricity rate updated to $" + electricityRate + "/kWh for all stations");
    }

    public void charge(double units) {
        unitsConsumed += units;
    }

    public double calculateBill() {
        return unitsConsumed * electricityRate;
    }

    public void displayStationDetails() {
        System.out.println("Station: " + stationId);
        System.out.println("Units Consumed: " + unitsConsumed + " kWh");
        System.out.println("Rate: $" + electricityRate + "/kWh");
        System.out.println("Bill: $" + calculateBill());
    }

    public static void main(String[] args) {
        ChargingStation s1 = new ChargingStation("CS-001");
        ChargingStation s2 = new ChargingStation("CS-002");
        ChargingStation s3 = new ChargingStation("CS-003");
        ChargingStation s4 = new ChargingStation("CS-004");
        ChargingStation s5 = new ChargingStation("CS-005");

        s1.charge(50);
        s2.charge(120);
        s3.charge(80);
        s4.charge(200);
        s5.charge(65);

        System.out.println("--- Current Rate ---");
        s1.displayStationDetails();
        s2.displayStationDetails();

        updateElectricityRate(0.20);

        System.out.println("--- After Rate Change ---");
        s1.displayStationDetails();
        s2.displayStationDetails();

        System.out.println("Total stations: " + totalStations);
    }
}
