import java.util.Scanner;

public class DigitsLargestSecondLargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        int originalNumber = Math.abs(number);
        
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;
        
        while (originalNumber != 0) {
            int digit = originalNumber % 10;
            digits[index] = digit;
            originalNumber = originalNumber / 10;
            index++;
            
            if (index == maxDigit) {
                int[] tempArray = new int[maxDigit + 10];
                for (int i = 0; i < index; i++) {
                    tempArray[i] = digits[i];
                }
                digits = tempArray;
                maxDigit += 10;
            }
        }
        
        int largest = 0;
        int secondLargest = 0;
        
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }
        
        System.out.println("\nDigit analysis:");
        System.out.println("Number of digits: " + index);
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);
    }
}