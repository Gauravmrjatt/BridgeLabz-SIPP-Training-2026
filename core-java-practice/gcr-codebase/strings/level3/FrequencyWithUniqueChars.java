import java.util.Scanner;

public class FrequencyWithUniqueChars {

   static char[] findUniqueChars(String text) {
    char[] temp = new char[text.length()];
   int uniqueCount = 0;
    for (int i = 0; i < text.length(); i++) {
     char current = text.charAt(i);
      boolean isUnique = true;
     for (int j = 0; j < uniqueCount; j++) {
       if (temp[j] == current) {
        isUnique = false;
        break;
       }
     }
      if (isUnique) {
       temp[uniqueCount] = current;
        uniqueCount++;
     }
    }
    char[] result = new char[uniqueCount];
   for (int i = 0; i < uniqueCount; i++) {
      result[i] = temp[i];
    }
    return result;
   }

 static String[][] findFrequency(String text) {
  int[] freq = new int[256];
   for (int i = 0; i < text.length(); i++) {
    freq[text.charAt(i)]++;
   }
  char[] uniqueChars = findUniqueChars(text);
   String[][] freqTable = new String[uniqueChars.length][2];
  for (int i = 0; i < uniqueChars.length; i++) {
   freqTable[i][0] = String.valueOf(uniqueChars[i]);
    freqTable[i][1] = String.valueOf(freq[uniqueChars[i]]);
  }
   return freqTable;
 }

  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string: ");
   String input = sc.next();
    String[][] result = findFrequency(input);
   System.out.println("Character | Frequency");
    System.out.println("--------- | ---------");
   for (int i = 0; i < result.length; i++) {
    System.out.printf("%-10s| %s%n", result[i][0], result[i][1]);
   }
    sc.close();
  }

}
