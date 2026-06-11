import java.util.Scanner;

public class SubstringUsingCharAt {

    static String createSubstring(String text, int start, int end) {
        String res = "";
        for (int i = start; i < end; i++) {
            res = res + text.charAt(i);
        }
        return res;
    }

    static boolean compareStringsUsingCharAt(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.next();

        System.out.print("Enter start index: ");
        int start = sc.nextInt();

        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        String sub1 = createSubstring(text, start, end);
        String sub2 = text.substring(start, end);

        System.out.println("Substring using charAt(): " + sub1);
        System.out.println("Substring using substring(): " + sub2);

        boolean match = compareStringsUsingCharAt(sub1, sub2);
        if (match) {
            System.out.println("Both substrings are equal.");
        } else {
            System.out.println("Both substrings are not equal.");
        }

        sc.close();
    }
}
