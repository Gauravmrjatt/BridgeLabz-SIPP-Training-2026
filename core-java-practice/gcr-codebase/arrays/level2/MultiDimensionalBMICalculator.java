import java.util.Scanner;

public class MultiDimensionalBMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter number of persons: ");
        int numberOfPersons = scanner.nextInt();
        
        double[][] personData = new double[numberOfPersons][3];
        String[] weightStatus = new String[numberOfPersons];
        
        for (int i = 0; i < numberOfPersons; i++) {
            while (true) {
                System.out.println("Enter weight (kg) for person " + (i + 1) + ": ");
                personData[i][0] = scanner.nextDouble();
                if (personData[i][0] > 0) {
                    break;
                } else {
                    System.out.println("Weight must be positive. Enter again.");
                }
            }
            
            while (true) {
                System.out.println("Enter height (m) for person " + (i + 1) + ": ");
                personData[i][1] = scanner.nextDouble();
                if (personData[i][1] > 0) {
                    break;
                } else {
                    System.out.println("Height must be positive. Enter again.");
                }
            }
            
            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);
            
            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] >= 18.5 && personData[i][2] <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (personData[i][2] >= 25 && personData[i][2] <= 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }
        
        System.out.println("\nBMI Analysis Results (Multi-dimensional Array):");
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.println("  Weight: " + personData[i][0] + " kg");
            System.out.println("  Height: " + personData[i][1] + " m");
            System.out.println("  BMI: " + personData[i][2]);
            System.out.println("  Status: " + weightStatus[i]);
        }
    }
}