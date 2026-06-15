import java.util.Arrays;

public class NumberChecker4 {
    public static int countDigits(int number) {
        return String.valueOf(Math.abs(number)).length();
    }

    public static int[] getDigits(int number) {
        int num = Math.abs(number);
        int[] digits = new int[countDigits(num)];
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i] = num % 10;
            num /= 10;
        }
        return digits;
    }

    public static int[] reverseArray(int[] arr) {
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) reversed[i] = arr[arr.length - 1 - i];
        return reversed;
    }

    public static boolean areArraysEqual(int[] arr1, int[] arr2) {
        return Arrays.equals(arr1, arr2);
    }

    public static boolean isPalindrome(int number) {
        int[] digits = getDigits(number);
        int[] reversed = reverseArray(digits);
        return areArraysEqual(digits, reversed);
    }

    public static boolean isDuckNumber(int number) {
        int[] digits = getDigits(number);
        for (int d : digits) if (d != 0) return true;
        return false;
    }

    public static void main(String[] args) {
        int num = 1221;
        System.out.println("Number: " + num);
        int[] digits = getDigits(num);
        System.out.print("Digits: ");
        for (int d : digits) System.out.print(d + " ");
        System.out.println();
        int[] reversed = reverseArray(digits);
        System.out.print("Reversed: ");
        for (int d : reversed) System.out.print(d + " ");
        System.out.println();
        System.out.println("Arrays equal: " + areArraysEqual(digits, reversed));
        System.out.println("Palindrome: " + isPalindrome(num));
        System.out.println("Duck number: " + isDuckNumber(num));
    }
}
