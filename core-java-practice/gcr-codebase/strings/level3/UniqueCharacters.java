import java.util.Scanner;

public class UniqueCharacters {

    public static int findLength(String s) {
        int len = 0;
        try {
            while (true) {
                s.charAt(len);
                len++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return len;
        }
    }

    public static char[] findUniqueChars(String text) {
        int n = findLength(text);
        char[] temp = new char[n];
        int idx = 0;
        for (int i = 0; i < n; i++) {
            char cur = text.charAt(i);
            boolean flag = false;
            for (int j = 0; j < idx; j++) {
                if (temp[j] == cur) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                temp[idx] = cur;
                idx++;
            }
        }
        char[] result = new char[idx];
        for (int i = 0; i < idx; i++) {
            result[i] = temp[i];
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.next();
        char[] unique = findUniqueChars(input);
        System.out.print("Unique characters: ");
        for (int i = 0; i < unique.length; i++) {
            System.out.print(unique[i] + " ");
        }
        System.out.println();
        sc.close();
    }
}
