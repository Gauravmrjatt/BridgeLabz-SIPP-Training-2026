public class NumberChecker5 {
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

    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) if (number % i == 0) return false;
        return true;
    }

    public static boolean isNeonNumber(int number) {
        int square = number * number;
        int[] digits = getDigits(square);
        int sum = 0;
        for (int d : digits) sum += d;
        return sum == number;
    }

    public static boolean isSpyNumber(int number) {
        int[] digits = getDigits(number);
        int sum = 0, product = 1;
        for (int d : digits) {
            sum += d;
            product *= d;
        }
        return sum == product;
    }

    public static boolean isAutomorphicNumber(int number) {
        int square = number * number;
        return String.valueOf(square).endsWith(String.valueOf(number));
    }

    public static boolean isBuzzNumber(int number) {
        return number % 7 == 0 || number % 10 == 7;
    }

    public static void main(String[] args) {
        int[] nums = {7, 9, 153, 1124, 25, 5, 37};
        for (int num : nums) {
            System.out.println("Number: " + num);
            System.out.println("  Prime: " + isPrime(num));
            System.out.println("  Neon: " + isNeonNumber(num));
            System.out.println("  Spy: " + isSpyNumber(num));
            System.out.println("  Automorphic: " + isAutomorphicNumber(num));
            System.out.println("  Buzz: " + isBuzzNumber(num));
        }
    }
}
