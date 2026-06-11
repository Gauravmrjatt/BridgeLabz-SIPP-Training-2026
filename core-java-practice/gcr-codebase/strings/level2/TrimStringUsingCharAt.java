import java.util.Scanner;

public class TrimStringUsingCharAt {

  static int[] findTrimPoints(String text) {
   int s = 0, e = text.length() - 1;
  while (s < text.length() && text.charAt(s) == ' ') {
   s++;
  }
   while (e >= 0 && text.charAt(e) == ' ') {
    e--;
  }
  return new int[]{s, e + 1};
 }

 static String createSubstring(String text, int start, int end) {
  String r = "";
  for (int i = start; i < end; i++) {
    r = r + text.charAt(i);
  }
   return r;
 }

static boolean compareStrings(String s1, String s2) {
 if (s1.length() != s2.length()) return false;
  for (int i = 0; i < s1.length(); i++) {
   if (s1.charAt(i) != s2.charAt(i)) return false;
  }
 return true;
}

 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
   System.out.print("Enter a string with spaces: ");
  String s = sc.nextLine();
   int[] pts = findTrimPoints(s);
  String trimmed = createSubstring(s, pts[0], pts[1]);
   String builtInTrim = s.trim();
  System.out.println("Trimmed using charAt: \"" + trimmed + "\"");
   System.out.println("Trimmed using built-in: \"" + builtInTrim + "\"");
  boolean match = compareStrings(trimmed, builtInTrim);
   if (match) {
    System.out.println("Both trimmed strings are equal.");
   } else {
    System.out.println("Both trimmed strings are not equal.");
   }
  sc.close();
 }

}
