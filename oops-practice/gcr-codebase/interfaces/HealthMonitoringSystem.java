interface HeartRateMonitor {
    int getHeartRate();
    default void displayHealthTips() {
        System.out.println("Heart Health: Exercise 30 mins daily, avoid stress.");
    }
}

interface TemperatureMonitor {
    double getTemperature();
    default void displayHealthTips() {
        System.out.println("Temperature Care: Stay hydrated, rest if feverish.");
    }
    static boolean isPatientIdValid(String patientId) {
        return patientId != null && patientId.matches("PAT\\d{4}");
    }
}

class HealthMonitoringSystem implements HeartRateMonitor, TemperatureMonitor {
    private String[] patientNames = {"John", "Jane", "Alice", "Bob"};
    private String[] patientIds = {"PAT1234", "PAT567", "PAT9012", "PAT3456"};
    private int[] heartRates = {72, 88, 95, 65};
    private double[] temperatures = {98.6, 100.2, 99.1, 97.8};

    public int getHeartRate() {
        return 0;
    }

    public double getTemperature() {
        return 0.0;
    }

    public void displayHealthTips() {
        HeartRateMonitor.super.displayHealthTips();
        TemperatureMonitor.super.displayHealthTips();
    }

    public void processPatients() {
        System.out.println("=== Health Monitoring Report ===");
        System.out.println();
        displayHealthTips();
        System.out.println();
        for (int i = 0; i < patientNames.length; i++) {
            System.out.println("Patient: " + patientNames[i] + " (ID: " + patientIds[i] + ")");
            boolean validId = TemperatureMonitor.isPatientIdValid(patientIds[i]);
            System.out.println("  ID Valid: " + (validId ? "Yes" : "No"));
            if (!validId) {
                System.out.println("  Status: Skipped - Invalid ID");
                System.out.println();
                continue;
            }
            System.out.println("  Heart Rate: " + heartRates[i] + " bpm");
            System.out.println("  Temperature: " + temperatures[i] + " F");
            String status = "Normal";
            if (heartRates[i] > 90) status = "High heart rate - Consult doctor";
            else if (heartRates[i] < 60) status = "Low heart rate - Monitor";
            if (temperatures[i] > 100.0) status += " | Fever detected";
            System.out.println("  Status: " + status);
            System.out.println();
        }
        System.out.println("=== Report Complete ===");
    }
}

class HealthMonitorDemo {
    public static void main(String[] args) {
        HealthMonitoringSystem hms = new HealthMonitoringSystem();
        hms.processPatients();
    }
}
