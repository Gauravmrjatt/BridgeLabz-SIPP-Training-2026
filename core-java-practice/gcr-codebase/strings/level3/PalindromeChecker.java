import java.util.Scanner;

public class PalindromeChecker {

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

static boolean palindromeLogic1(String text) {
 int start = 0;
  int end = findLength(text) - 1;
 while (start < end) {
   if (text.charAt(start) != text.charAt(end)) {
    return false;
   }
  start++;
   end--;
 }
  return true;
}

 static boolean palindromeLogic2(String text, int start, int end) {
  if (start >= end) {
   return true;
  }
 if (text.charAt(start) != text.charAt(end)) {
   return false;
  }
 return palindromeLogic2(text, start + 1, end - 1);
}

static boolean palindromeLogic3(String text) {
 int len = findLength(text);
  char[] revArr = new char[len];
 for (int i = 0; i < len; i++) {
   revArr[i] = text.charAt(len - 1 - i);
  }
 char[] original = text.toCharArray();
  for (int i = 0; i < len; i++) {
   if (original[i] != revArr[i]) {
    return false;
   }
  }
 return true;
}

 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
   System.out.print("Enter a string: ");
  String input = sc.next();
   int len = findLength(input);
  boolean res1 = palindromeLogic1(input);
   boolean res2 = palindromeLogic2(input, 0, len - 1);
  boolean res3 = palindromeLogic3(input);
   System.out.println("PalindromeLogic1 (two-pointer): " + res1);
  System.out.println("PalindromeLogic2 (recursive): " + res2);
   System.out.println("PalindromeLogic3 (reverse-compare): " + res3);
  sc.close();
 }

}
