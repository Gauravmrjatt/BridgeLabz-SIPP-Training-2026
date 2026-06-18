import java.util.Scanner;

public class ThrowVsThrowsExample {
    public static double calculateInterest(double amount, double rate, int years) throws IllegalArgumentException {
        if (amount < 0 || rate < 0) {
            throw new IllegalArgumentException("Amount and rate must be positive");
        }
        return amount * rate * years / 100.0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter amount: ");
            double amount = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter rate: ");
            double rate = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter years: ");
            int years = Integer.parseInt(scanner.nextLine());
            double interest = calculateInterest(amount, rate, years);
            System.out.println("Interest: " + interest);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input: " + e.getMessage());
        }
    }
}