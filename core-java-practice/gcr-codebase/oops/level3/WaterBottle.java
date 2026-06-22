public class WaterBottle {
    String ownerName;
    int dailyTarget;

    public WaterBottle(String ownerName, int dailyTarget) {
        this.ownerName = ownerName;
        this.dailyTarget = dailyTarget;
    }

    public void displayBottleInfo() {
        System.out.println("Owner: " + ownerName);
        System.out.println("Daily Target: " + dailyTarget + " ml");
    }

    public static void main(String[] args) {
        WaterBottle b1 = new WaterBottle("Alice", 2000);
        WaterBottle b2 = new WaterBottle("Bob", 2500);
        b1.displayBottleInfo();
        b2.displayBottleInfo();
    }
}
