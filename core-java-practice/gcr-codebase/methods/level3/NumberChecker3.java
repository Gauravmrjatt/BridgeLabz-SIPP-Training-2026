public class NumberChecker3 {
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

    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += d;
        return sum;
    }

    public static int sumOfSquaresOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += Math.pow(d, 2);
        return sum;
    }

    public static boolean isHarshadNumber(int number) {
        int[] digits = getDigits(number);
        int sum = sumOfDigits(digits);
        return sum != 0 && number % sum == 0;
    }

    public static int[][] digitFrequency(int number) {
        int[] digits = getDigits(number);
        int[][] freq = new int[10][2];
        for (int i = 0; i < 10; i++) freq[i][0] = i;
        for (int d : digits) freq[d][1]++;
        int count = 0;
        for (int i = 0; i < 10; i++) if (freq[i][1] > 0) count++;
        int[][] result = new int[count][2];
        int idx = 0;
        for (int i = 0; i < 10; i++) if (freq[i][1] > 0) result[idx++] = freq[i];
        return result;
    }

    public static void main(String[] args) {
        int num = 153;
        System.out.println("Number: " + num);
        int[] digits = getDigits(num);
        System.out.println("Sum of digits: " + sumOfDigits(digits));
        System.out.println("Sum of squares of digits: " + sumOfSquaresOfDigits(digits));
        System.out.println("Harshad number: " + isHarshadNumber(num));
        int[][] freq = digitFrequency(num);
        System.out.println("Digit Frequency:");
        for (int[] f : freq) System.out.println("  " + f[0] + " -> " + f[1]);
    }
}
