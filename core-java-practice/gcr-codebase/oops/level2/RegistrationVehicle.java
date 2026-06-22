public class RegistrationVehicle {
    static double registrationFee = 500.0;

    final String registrationNumber;
    String ownerName;
    String vehicleType;

    public RegistrationVehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Registration fee updated to $" + registrationFee);
    }

    public void displayDetails() {
        if (this instanceof RegistrationVehicle) {
            System.out.println("Owner: " + ownerName);
            System.out.println("Type: " + vehicleType);
            System.out.println("Reg No: " + registrationNumber);
            System.out.println("Fee: $" + registrationFee);
        }
    }

    public static void main(String[] args) {
        RegistrationVehicle v1 = new RegistrationVehicle("Alice", "Car", "MH-01-AB-1234");
        RegistrationVehicle v2 = new RegistrationVehicle("Bob", "Bike", "MH-02-XY-5678");
        v1.displayDetails();
        v2.displayDetails();
        updateRegistrationFee(600.0);
        v1.displayDetails();
    }
}
