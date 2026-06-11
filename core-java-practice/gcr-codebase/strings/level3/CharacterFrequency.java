import java.util.Scanner;

public class CharacterFrequency {

    public static String[][] findFrequency(String text) {
        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }
        int uniqueCount = 0;
        boolean[] seen = new boolean[256];
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (!seen[c]) {
                seen[c] = true;
                uniqueCount++;
            }
        }
        String[][] result = new String[uniqueCount][2];
        int idx = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (freq[c] > 0) {
                result[idx][0] = String.valueOf(c);
                result[idx][1] = String.valueOf(freq[c]);
                freq[c] = 0;
                idx++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.next();
        String[][] freqData = findFrequency(input);
        System.out.printf("%-12s %-12s%n", "Character", "Frequency");
        System.out.println("----------------------");
        for (int i = 0; i < freqData.length; i++) {
            System.out.printf("%-12s %-12s%n", freqData[i][0], freqData[i][1]);
        }
        sc.close();
    }
}
