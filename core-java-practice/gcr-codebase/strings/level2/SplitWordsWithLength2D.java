import java.util.Scanner;

public class SplitWordsWithLength2D {

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

    static String[][] create2DArray(String[] words) {
        String[][] data = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            data[i][0] = words[i];
            int len = findLength(words[i]);
            data[i][1] = String.valueOf(len);
        }
        return data;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        String[] words = splitWords(sentence);
        String[][] wordData = create2DArray(words);

        System.out.println("Word    Length");
        System.out.println("---------------");
        for (int i = 0; i < wordData.length; i++) {
            System.out.printf("%-10s %d%n", wordData[i][0], Integer.parseInt(wordData[i][1]));
        }

        sc.close();
    }
}
