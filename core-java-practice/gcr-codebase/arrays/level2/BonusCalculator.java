import java.util.Scanner;

public class BonusCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = 10;
        double[] salaries = new double[n];
        double[] yearsOfService = new double[n];
        double[] bonuses = new double[n];
        double[] newSalaries = new double[n];
        
        double totalBonus = 0;\n        double totalOldSalary = 0;
        double totalNewSalary = 0;
        
        int index = 0;
        while (index < n) {
            System.out.println("Enter salary for employee " + (index + 1) + ": ");
            if (scanner.hasNextDouble()) {
                salaries[index] = scanner.nextDouble();
                if (salaries[index] < 0) {
                    System.out.println("Salary cannot be negative. Enter again: ");
                    continue;
                }
            } else {
                System.out.println("Invalid input. Enter a valid number: ");
                scanner.next();
                continue;
            }
            
            System.out.println("Enter years of service for employee " + (index + 1) + ": ");
            if (scanner.hasNextDouble()) {
                yearsOfService[index] = scanner.nextDouble();
                if (yearsOfService[index] < 0) {
                    System.out.println("Years of service cannot be negative. Enter again: ");
                    continue;
                }
            } else {
                System.out.println("Invalid input. Enter a valid number: ");
                scanner.next();
                continue;
            }
            
            index++;
        }
        
        for (int i = 0; i < n; i++) {
            double bonusPercentage;
            if (yearsOfService[i] > 5) {
                bonusPercentage = 0.05;
            } else {
                bonusPercentage = 0.02;
            }
            
            bonuses[i] = salaries[i] * bonusPercentage;
            newSalaries[i] = salaries[i] + bonuses[i];
            
            totalBonus += bonuses[i];
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }
        
        System.out.println("\nBonus Calculation Results:");
        System.out.println("Total Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
    }
}