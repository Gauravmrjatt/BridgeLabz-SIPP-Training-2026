package inheritance.smarthome;

public class Thermostat extends Device {
    private int temperatureSetting;

    public Thermostat(String deviceId, String status, int temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    @Override
    public void displayStatus() {
        super.displayStatus();
        System.out.println("Thermostat[" + deviceId + "] Temperature Setting: " + temperatureSetting + "°C");
    }
}
