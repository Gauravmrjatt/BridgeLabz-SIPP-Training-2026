import java.util.Scanner;

public class FrequencyNestedLoops {

 static String[] findFrequency(String text) {
  char[] chars = text.toCharArray();
   int n = chars.length;
  int[] freq = new int[n];
   for (int i = 0; i < n; i++) {
    freq[i] = 1;
     for (int j = i + 1; j < n; j++) {
      if (chars[i] == chars[j] && chars[i] != '0') {
        freq[i]++;
       chars[j] = '0';
     }
    }
   }
  int count = 0;
   for (int i = 0; i < n; i++) {
    if (chars[i] != '0') {
      count++;
    }
   }
  String[] result = new String[count];
   int idx = 0;
  for (int i = 0; i < n; i++) {
    if (chars[i] != '0') {
     result[idx] = chars[i] + " -> " + freq[i];
      idx++;
   }
  }
   return result;
 }

  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string: ");
   String input = sc.next();
    String[] result = findFrequency(input);
   for (int i = 0; i < result.length; i++) {
    System.out.println(result[i]);
   }
    sc.close();
  }

}
