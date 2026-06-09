import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        int first = scanner.nextInt();
        System.out.println("Enter second number:");
        int second = scanner.nextInt();
        System.out.println("Enter third number:");
        int third = scanner.nextInt();

        boolean isFirstSmallest = (first <= second && first <= third);

        System.out.println("Is the first number the smallest? " + (isFirstSmallest ? "Yes" : "No"));

        scanner.close();
    }
}
