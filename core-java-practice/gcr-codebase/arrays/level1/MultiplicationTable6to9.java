import java.util.Scanner;

public class MultiplicationTable6to9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] multiplicationResult = new int[4];

        for (int i = 0; i < 4; i++) {
            multiplicationResult[i] = number * (6 + i);
        }

        System.out.println("\nMultiplication Table of " + number + " (6 to 9):");
        for (int i = 0; i < multiplicationResult.length; i++) {
            System.out.println(number + " * " + (6 + i) + " = " + multiplicationResult[i]);
        }

        sc.close();
    }
}