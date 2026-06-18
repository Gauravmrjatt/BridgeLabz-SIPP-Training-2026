import java.util.Scanner;

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class HospitalBilling {
    public double calculateBill(int items, double pricePerItem) {
        if (items <= 0) {
            throw new ArithmeticException("Items must be greater than zero");
        }
        if (pricePerItem < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }
        return items * pricePerItem;
    }

    public String getPatient(int index, String[] patients) {
        if (patients == null) {
            throw new NullPointerException("Patient array not initialized");
        }
        if (index < 0 || index >= patients.length) {
            throw new ArrayIndexOutOfBoundsException("Invalid patient index");
        }
        return patients[index];
    }

    public int parsePatientAge(String ageStr) {
        try {
            return Integer.parseInt(ageStr);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Invalid age format");
        }
    }

    public static void main(String[] args) {
        HospitalBilling hospital = new HospitalBilling();
        String[] patients = {"John", "Jane", "Bob", "Alice"};

        try {
            System.out.println("Calculating bill for 3 items at $10 each");
            double bill = hospital.calculateBill(3, 10.0);
            System.out.println("Bill amount: " + bill);
        } catch (ArithmeticException | IllegalArgumentException e) {
            System.out.println("Billing error: " + e.getMessage());
        }

        try {
            String patient = hospital.getPatient(2, patients);
            System.out.println("Patient at index 2: " + patient);
        } catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
            System.out.println("Patient error: " + e.getMessage());
        }

        try {
            int age = hospital.parsePatientAge("twenty");
            System.out.println("Parsed age: " + age);
        } catch (NumberFormatException e) {
            System.out.println("Age parsing error: " + e.getMessage());
        }

        try {
            double bill = hospital.calculateBill(-1, 10.0);
            System.out.println("Bill: " + bill);
        } catch (ArithmeticException | IllegalArgumentException e) {
            System.out.println("Payment failure: " + e.getMessage());
        }
    }
}