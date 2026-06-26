interface Trackable {
    void logActivity();
    default void resetData() {
        System.out.println("Data reset to default values.");
    }
}

interface Reportable {
    void generateReport();
}

interface Notifiable {
    void sendAlert();
}

class FitnessDevice implements Trackable, Reportable, Notifiable {
    private String deviceName;

    public FitnessDevice(String deviceName) {
        this.deviceName = deviceName;
    }

    public void logActivity() {
        System.out.println(deviceName + ": Logging fitness activity.");
    }

    public void generateReport() {
        System.out.println(deviceName + ": Generating fitness report.");
    }

    public void sendAlert() {
        System.out.println(deviceName + ": Sending health alert.");
    }
}

public class FitnessTracker {
    public static void main(String[] args) {
        FitnessDevice fd = new FitnessDevice("FitBand Pro");
        fd.logActivity();
        fd.generateReport();
        fd.sendAlert();
        fd.resetData();
    }
}
