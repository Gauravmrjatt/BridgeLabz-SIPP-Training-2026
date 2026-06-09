import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Not a natural number.");
            scanner.close();
            return;
        }

        int formulaSum = n * (n + 1) / 2;

        int loopSum = 0;
        int i = 1;
        while (i <= n) {
            loopSum += i;
            i++;
        }

        System.out.println("Sum using formula: " + formulaSum);
        System.out.println("Sum using while loop: " + loopSum);

        if (formulaSum == loopSum) {
            System.out.println("Both results match.");
        } else {
            System.out.println("Results do not match.");
        }

        scanner.close();
    }
}
