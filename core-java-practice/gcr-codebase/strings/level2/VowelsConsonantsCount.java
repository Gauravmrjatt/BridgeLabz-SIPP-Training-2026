import java.util.Scanner;

public class VowelsConsonantsCount {

   static String checkCharType(char c) {
    if (c >= 'A' && c <= 'Z') {
     c = (char)(c + 32);
    }
    if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
     return "Vowel";
    } else if (c >= 'a' && c <= 'z') {
     return "Consonant";
    } else {
      return "Not a Letter";}
   }

 static int[] countVowelsConsonants(String text) {
    int v = 0, con = 0;
   for (int i = 0; i < text.length(); i++) {
    String t = checkCharType(text.charAt(i));
    if (t.equals("Vowel")) v++;
    else if (t.equals("Consonant")) con++;
   }
  return new int[]{v, con};
 }

public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter a string: ");
  String s = sc.nextLine();
  int[] res = countVowelsConsonants(s);
 System.out.println("Vowels: " + res[0]);
   System.out.println("Consonants: " + res[1]);
  sc.close();
}

}
