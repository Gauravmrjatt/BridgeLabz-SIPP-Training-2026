import java.util.Scanner;

public class ReverseNumberArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        int originalNumber = Math.abs(number);
        
        int count = 0;
        int temp = originalNumber;
        while (temp != 0) {
            temp = temp / 10;
            count++;
        }
        
        int[] digits = new int[count];
        for (int i = 0; i < count; i++) {
            digits[i] = originalNumber % 10;
            originalNumber = originalNumber / 10;
        }
        
        int[] reversedDigits = new int[count];
        for (int i = 0; i < count; i++) {
            reversedDigits[i] = digits[count - 1 - i];
        }
        
        System.out.println("\nOriginal number: " + number);
        System.out.println("Digits in reverse order: ");
        for (int digit : reversedDigits) {
            System.out.print(digit + " ");
        }
    }
}