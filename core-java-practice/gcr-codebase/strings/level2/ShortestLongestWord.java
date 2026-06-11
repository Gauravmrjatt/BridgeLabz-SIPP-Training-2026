import java.util.Scanner;

public class ShortestLongestWord {

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

    static int[] findShortestLongest(String[][] data) {
        int shortestIdx = 0;
        int longestIdx = 0;
        int minLen = Integer.parseInt(data[0][1]);
        int maxLen = Integer.parseInt(data[0][1]);
        for (int i = 1; i < data.length; i++) {
            int curLen = Integer.parseInt(data[i][1]);
            if (curLen < minLen) {
                minLen = curLen;
                shortestIdx = i;
            }
            if (curLen > maxLen) {
                maxLen = curLen;
                longestIdx = i;
            }
        }
        int[] result = { shortestIdx, longestIdx };
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        String[] words = splitWords(sentence);
        String[][] wordData = create2DArray(words);
        int[] indexes = findShortestLongest(wordData);

        System.out.println("All words:");
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i] + " (" + wordData[i][1] + ")");
        }

        System.out.println("Shortest word: " + wordData[indexes[0]][0] + " (length " + wordData[indexes[0]][1] + ")");
        System.out.println("Longest word: " + wordData[indexes[1]][0] + " (length " + wordData[indexes[1]][1] + ")");

        sc.close();
    }
}
