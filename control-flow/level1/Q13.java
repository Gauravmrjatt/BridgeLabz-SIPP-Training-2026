import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Not a natural number");
            return;
        }

        long formulaSum = (long) n * (n + 1) / 2;

        long loopSum = 0;
        for (int i = 1; i <= n; i++) {
            loopSum += i;
        }

        System.out.println("Sum using formula: " + formulaSum);
        System.out.println("Sum using for loop: " + loopSum);

        if (formulaSum == loopSum) {
            System.out.println("Both results are equal");
        } else {
            System.out.println("Results differ");
        }

        scanner.close();
    }
}
