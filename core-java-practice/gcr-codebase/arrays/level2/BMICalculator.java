import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter number of persons: ");
        int numberOfPersons = scanner.nextInt();
        
        double[] weights = new double[numberOfPersons];
        double[] heights = new double[numberOfPersons];
        double[] bmis = new double[numberOfPersons];
        String[] weightStatuses = new String[numberOfPersons];
        
        for (int i = 0; i < numberOfPersons; i++) {
            while (true) {
                System.out.println("Enter weight (kg) for person " + (i + 1) + ": ");
                weights[i] = scanner.nextDouble();
                if (weights[i] > 0) {
                    break;
                } else {
                    System.out.println("Weight must be positive. Enter again.");
                }
            }
            
            while (true) {
                System.out.println("Enter height (m) for person " + (i + 1) + ": ");
                heights[i] = scanner.nextDouble();
                if (heights[i] > 0) {
                    break;
                } else {
                    System.out.println("Height must be positive. Enter again.");
                }
            }
            
            bmis[i] = weights[i] / (heights[i] * heights[i]);
            
            if (bmis[i] < 18.5) {
                weightStatuses[i] = "Underweight";
            } else if (bmis[i] >= 18.5 && bmis[i] <= 24.9) {
                weightStatuses[i] = "Normal";
            } else if (bmis[i] >= 25 && bmis[i] <= 29.9) {
                weightStatuses[i] = "Overweight";
            } else {
                weightStatuses[i] = "Obese";
            }
        }
        
        System.out.println("\nBMI Analysis Results:");
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.println("  Height: " + heights[i] + " m");
            System.out.println("  Weight: " + weights[i] + " kg");
            System.out.println("  BMI: " + bmis[i]);
            System.out.println("  Status: " + weightStatuses[i]);
        }
    }
}