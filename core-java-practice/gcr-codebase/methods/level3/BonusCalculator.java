import java.util.Random;

public class BonusCalculator {
    public static int[][] getEmployeeData(int count) {
        Random rand = new Random();
        int[][] data = new int[count][2];
        for (int i = 0; i < count; i++) {
            data[i][0] = rand.nextInt(90000) + 10000;
            data[i][1] = rand.nextInt(15) + 1;
        }
        return data;
    }

    public static double[][] calculateBonusAndNewSalary(int[][] data) {
        double[][] result = new double[data.length][2];
        for (int i = 0; i < data.length; i++) {
            double bonusPercent = data[i][1] > 5 ? 5.0 : 2.0;
            double bonus = data[i][0] * bonusPercent / 100;
            result[i][0] = data[i][0] + bonus;
            result[i][1] = bonus;
        }
        return result;
    }

    public static void main(String[] args) {
        int count = 10;
        int[][] employees = getEmployeeData(count);
        double[][] newData = calculateBonusAndNewSalary(employees);
        double oldTotal = 0, newTotal = 0, bonusTotal = 0;
        System.out.println("Emp\tOld Salary\tYears\tBonus\tNew Salary");
        for (int i = 0; i < count; i++) {
            oldTotal += employees[i][0];
            newTotal += newData[i][0];
            bonusTotal += newData[i][1];
            System.out.println((i + 1) + "\t" + employees[i][0] + "\t\t" + employees[i][1] + "\t" +
                               String.format("%.0f", newData[i][1]) + "\t" + String.format("%.0f", newData[i][0]));
        }
        System.out.println("\nTotal Old Salary: " + String.format("%.0f", oldTotal));
        System.out.println("Total New Salary: " + String.format("%.0f", newTotal));
        System.out.println("Total Bonus Amount: " + String.format("%.0f", bonusTotal));
    }
}
