public class NumberChecker6 {
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

    public static int sumOfProperDivisors(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) if (number % i == 0) sum += i;
        return sum;
    }

    public static boolean isPerfectNumber(int number) {
        return number > 0 && sumOfProperDivisors(number) == number;
    }

    public static boolean isAbundantNumber(int number) {
        return number > 0 && sumOfProperDivisors(number) > number;
    }

    public static boolean isDeficientNumber(int number) {
        return number > 0 && sumOfProperDivisors(number) < number;
    }

    public static boolean isStrongNumber(int number) {
        int[] digits = getDigits(number);
        int sum = 0;
        for (int d : digits) sum += factorial(d);
        return sum == number;
    }

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) fact *= i;
        return fact;
    }

    public static void main(String[] args) {
        int[] nums = {6, 12, 15, 145, 28};
        for (int num : nums) {
            System.out.println("Number: " + num);
            System.out.println("  Perfect: " + isPerfectNumber(num));
            System.out.println("  Abundant: " + isAbundantNumber(num));
            System.out.println("  Deficient: " + isDeficientNumber(num));
            System.out.println("  Strong: " + isStrongNumber(num));
        }
    }
}
