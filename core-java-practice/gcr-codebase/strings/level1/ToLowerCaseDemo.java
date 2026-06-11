public class ToLowerCaseDemo {

 static String toLowerCaseUsingCharAt(String text) {
        String result = "";
   for (int i = 0; i < text.length(); i++) {
    char c = text.charAt(i);
         if (c >= 'A' && c <= 'Z') {
      c = (char)(c + 32);
     }
   result += c;
  }
        return result;
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
  java.util.Scanner sc = new java.util.Scanner(System.in);
     System.out.print("Enter a text: ");
  String text = sc.nextLine();
        String builtInResult = text.toLowerCase();
   String customResult = toLowerCaseUsingCharAt(text);
 System.out.println("Built-in toLowerCase: " + builtInResult);
      System.out.println("Custom toLowerCase: " + customResult);
  boolean isEqual = compareStringsUsingCharAt(builtInResult, customResult);
          System.out.println("Both results equal: " + isEqual);
   }
}
