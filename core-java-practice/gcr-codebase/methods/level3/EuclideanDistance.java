import java.util.Scanner;

public class EuclideanDistance {
    public static double calculateDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static double[] findLineEquation(int x1, int y1, int x2, int y2) {
        double slope = (double) (y2 - y1) / (x2 - x1);
        double intercept = y1 - slope * x1;
        return new double[]{slope, intercept};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x1 y1: ");
        int x1 = sc.nextInt(), y1 = sc.nextInt();
        System.out.print("Enter x2 y2: ");
        int x2 = sc.nextInt(), y2 = sc.nextInt();
        double distance = calculateDistance(x1, y1, x2, y2);
        System.out.println("Euclidean distance: " + distance);
        double[] line = findLineEquation(x1, y1, x2, y2);
        System.out.println("Line equation: y = " + String.format("%.2f", line[0]) + "x + " + String.format("%.2f", line[1]));
    }
}
