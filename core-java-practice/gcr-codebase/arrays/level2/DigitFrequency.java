import java.util.Scanner;

public class DigitFrequency {
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
        temp = originalNumber;
        for (int i = 0; i < count; i++) {
            digits[i] = temp % 10;
            temp = temp / 10;
        }
        
        int[] frequency = new int[10];
        for (int digit : digits) {
            if (digit >= 0 && digit <= 9) {
                frequency[digit]++;
            }
        }
        
        System.out.println("\nFrequency of each digit in " + number + ":");
        for (int digit = 0; digit < 10; digit++) {
            if (frequency[digit] > 0) {
                System.out.println(digit + ": " + frequency[digit] + " time(s)");
            }
        }
    }
}