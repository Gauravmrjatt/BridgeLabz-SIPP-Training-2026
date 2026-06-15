import java.util.Scanner;

public class NumberChecker {

    public static boolean isPositive(int number) {
        return number > 0;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static int compare(int num1, int num2) {
        if (num1 > num2) return 1;
        if (num1 < num2) return -1;
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        System.out.println("\nNumber Analysis:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Number " + numbers[i] + ": ");
            if (isPositive(numbers[i])) {
                System.out.print("Positive");
                if (isEven(numbers[i])) {
                    System.out.println(" and Even");
                } else {
                    System.out.println(" and Odd");
                }
            } else {
                System.out.println("Negative");
            }
        }

        int result = compare(numbers[0], numbers[4]);
        System.out.println("\nComparing first (" + numbers[0] + ") and last (" + numbers[4] + ") elements:");
        if (result == 1) {
            System.out.println("First element is greater than last element");
        } else if (result == -1) {
            System.out.println("First element is less than last element");
        } else {
            System.out.println("Both elements are equal");
        }

        sc.close();
    }
}
