import java.util.Scanner;

public class NestedTryCatchExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter array size: ");
            int size = Integer.parseInt(scanner.nextLine());
            int[] arr = new int[size];
            System.out.print("Enter index: ");
            int index = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter divisor: ");
            int divisor = Integer.parseInt(scanner.nextLine());
            try {
                int value = arr[index];
                int result = value / divisor;
                System.out.println("Result: " + result);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid array index!");
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero!");
            }
        } catch (Exception e) {
            System.out.println("Invalid input!");
        }
    }
}