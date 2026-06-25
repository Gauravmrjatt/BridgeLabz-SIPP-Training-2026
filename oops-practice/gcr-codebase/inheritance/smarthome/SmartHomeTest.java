package inheritance.smarthome;

public class SmartHomeTest {
    public static void main(String[] args) {
        Thermostat t = new Thermostat("T-001", "ON", 22);
        t.displayStatus();
    }
}
