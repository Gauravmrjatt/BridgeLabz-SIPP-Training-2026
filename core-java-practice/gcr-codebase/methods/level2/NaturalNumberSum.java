import java.util.Scanner;

public class NaturalNumberSum {

    public static int recursiveSum(int n) {
        if (n == 1) return 1;
        return n + recursiveSum(n - 1);
    }

    public static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Not a natural number");
            sc.close();
            return;
        }

        int recursive = recursiveSum(n);
        int formula = formulaSum(n);

        System.out.println("Recursive sum: " + recursive);
        System.out.println("Formula sum: " + formula);
        System.out.println("Both results match: " + (recursive == formula));

        sc.close();
    }
}
