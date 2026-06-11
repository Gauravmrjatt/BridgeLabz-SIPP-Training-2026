import java.util.Scanner;

public class SplitTextIntoWords {

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

    static String[] splitWords(String text) {
        int spaceCount = 0;
        for (int i = 0; i < findLength(text); i++) {
            if (text.charAt(i) == ' ') {
                spaceCount++;
            }
        }
        int wordCount = spaceCount + 1;
        int[] spaceIndexes = new int[spaceCount];
        int idx = 0;
        for (int i = 0; i < findLength(text); i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[idx] = i;
                idx++;
            }
        }
        String[] words = new String[wordCount];
        int start = 0;
        for (int i = 0; i < wordCount; i++) {
            int end;
            if (i < spaceCount) {
                end = spaceIndexes[i];
            } else {
                end = findLength(text);
            }
            String w = "";
            for (int j = start; j < end; j++) {
                w = w + text.charAt(j);
            }
            words[i] = w;
            start = end + 1;
        }
        return words;
    }

    static boolean compareStringArrays(String[] a1, String[] a2) {
        if (a1.length != a2.length) {
            return false;
        }
        for (int i = 0; i < a1.length; i++) {
            if (!a1[i].equals(a2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        String[] myWords = splitWords(sentence);
        String[] builtinWords = sentence.split(" ");

        System.out.println("Words using splitWords():");
        for (int i = 0; i < myWords.length; i++) {
            System.out.println(myWords[i]);
        }

        System.out.println("Words using built-in split():");
        for (int i = 0; i < builtinWords.length; i++) {
            System.out.println(builtinWords[i]);
        }

        boolean match = compareStringArrays(myWords, builtinWords);
        if (match) {
            System.out.println("Both methods produce same result.");
        } else {
            System.out.println("Results are different.");
        }

        sc.close();
    }
}
