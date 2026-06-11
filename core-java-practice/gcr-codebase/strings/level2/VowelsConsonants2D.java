import java.util.Scanner;

public class VowelsConsonants2D {

   static String checkCharType(char c) {
   if (c >= 'A' && c <= 'Z') {
     c = (char)(c + 32);
   }
    if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
     return "Vowel";
   } else if (c >= 'a' && c <= 'z') {
    return "Consonant";
    } else {
     return "Not a Letter";
   }
   }

 static String[][] findVowelsConsonants(String text) {
  String[][] data = new String[text.length()][2];
 for (int i = 0; i < text.length(); i++) {
  data[i][0] = String.valueOf(text.charAt(i));
   data[i][1] = checkCharType(text.charAt(i));
  }
  return data;
 }

static void displayTable(String[][] data) {
 System.out.printf("%-10s %-15s%n", "Character", "Type");
  System.out.printf("%-10s %-15s%n", "---------", "----");
 for (int i = 0; i < data.length; i++) {
   System.out.printf("%-10s %-15s%n", data[i][0], data[i][1]);
 }
  }

public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
  System.out.print("Enter a string: ");
 String s = sc.nextLine();
  String[][] result = findVowelsConsonants(s);
 displayTable(result);
   sc.close();
}

}
