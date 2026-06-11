import java.util.Scanner;

public class StringLengthWithoutLengthMethod {

    static int findLength(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.next();

        int len1 = findLength(str);
        int len2 = str.length();

        System.out.println("Length using user-defined method: " + len1);
        System.out.println("Length using built-in length(): " + len2);

        sc.close();
    }
}
