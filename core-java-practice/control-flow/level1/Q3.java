import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        int first = scanner.nextInt();
        System.out.println("Enter second number:");
        int second = scanner.nextInt();
        System.out.println("Enter third number:");
        int third = scanner.nextInt();

        boolean isFirstLargest = (first >= second && first >= third);
        boolean isSecondLargest = (second >= first && second >= third);
        boolean isThirdLargest = (third >= first && third >= second);

        System.out.println("Is the first number the largest? " + (isFirstLargest ? "Yes" : "No"));
        System.out.println("Is the second number the largest? " + (isSecondLargest ? "Yes" : "No"));
        System.out.println("Is the third number the largest? " + (isThirdLargest ? "Yes" : "No"));

        scanner.close();
    }
}
