public class Drone {
    static String companyName = "SkyLogistics";

    String droneId;
    int batteryPercentage;

    public Drone(String droneId, int batteryPercentage) {
        this.droneId = droneId;
        this.batteryPercentage = batteryPercentage;
    }

    public void startDelivery() {
        if (batteryPercentage >= 20) {
            System.out.println(droneId + " starting delivery. Battery at " + batteryPercentage + "%");
            batteryPercentage -= 10;
        } else {
            System.out.println(droneId + " cannot start. Low battery: " + batteryPercentage + "%");
        }
    }

    public void displayStatus() {
        System.out.println("Company: " + companyName);
        System.out.println("Drone: " + droneId + " | Battery: " + batteryPercentage + "%");
    }

    public static void main(String[] args) {
        Drone d1 = new Drone("DRN-001", 85);
        Drone d2 = new Drone("DRN-002", 45);
        Drone d3 = new Drone("DRN-003", 15);

        d1.displayStatus();
        d2.displayStatus();
        d3.displayStatus();

        System.out.println();

        d1.startDelivery();
        d2.startDelivery();
        d3.startDelivery();
        d1.startDelivery();
    }
}
