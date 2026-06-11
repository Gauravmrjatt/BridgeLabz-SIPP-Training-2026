import java.util.Scanner;

public class BMICalculator {

    public static String[][] findBMIAndStatus(double[][] data) {
        String[][] result = new String[data.length][4];
        for (int i = 0; i < data.length; i++) {
            double hCm = data[i][0];
            double wKg = data[i][1];
            double hM = hCm / 100.0;
            double bmi = wKg / (hM * hM);
            bmi = (double) Math.round(bmi * 100.0) / 100.0;
            String status;
            if (bmi < 18.5) {
                status = "Underweight";
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                status = "Normal";
            } else if (bmi >= 25 && bmi <= 29.9) {
                status = "Overweight";
            } else {
                status = "Obese";
            }
            result[i][0] = String.valueOf(hCm);
            result[i][1] = String.valueOf(wKg);
            result[i][2] = String.valueOf(bmi);
            result[i][3] = status;
        }
        return result;
    }

    public static String[][] processData(double[][] inputData) {
        return findBMIAndStatus(inputData);
    }

    public static void displayTable(String[][] data) {
        System.out.printf("%-8s %-12s %-12s %-10s %-15s%n", "Person", "Height(cm)", "Weight(kg)", "BMI", "Status");
        System.out.println("-------------------------------------------------------------------");
        for (int i = 0; i < data.length; i++) {
            System.out.printf("%-8s %-12s %-12s %-10s %-15s%n", "Person " + (i + 1), data[i][0], data[i][1], data[i][2], data[i][3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] inputData = new double[10][2];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            inputData[i][0] = sc.nextDouble();
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            inputData[i][1] = sc.nextDouble();
        }
        String[][] tableData = processData(inputData);
        displayTable(tableData);
        sc.close();
    }
}
