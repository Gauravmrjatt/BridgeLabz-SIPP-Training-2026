import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number <= 0 || number >= 100) {
            System.out.println("Please enter a positive integer less than 100.");
            return;
        }

        System.out.println("Multiples of " + number + " below 100:");
        int counter = number - 1;
        while (counter > 1) {
            if (number % counter == 0) {
                System.out.println(number);
            }
            counter--;
        }
        scanner.close();
    }
}
