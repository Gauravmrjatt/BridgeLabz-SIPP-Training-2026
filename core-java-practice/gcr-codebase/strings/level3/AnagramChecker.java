import java.util.Scanner;
public class AnagramChecker {

public static boolean checkAnagram(String text1, String text2) {
if (findLength(text1) != findLength(text2)) {
return false;
}
int[] freq1 = new int[256];
int[] freq2 = new int[256];
for (int i = 0; i < findLength(text1); i++) {
freq1[text1.charAt(i)]++;
}
for (int i = 0; i < findLength(text2); i++) {
freq2[text2.charAt(i)]++;
}
for (int i = 0; i < 256; i++) {
if (freq1[i] != freq2[i]) {
return false;
}
}
return true;
}

public static int findLength(String s) {
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

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter first text: ");
String t1 = sc.nextLine();
System.out.print("Enter second text: ");
String t2 = sc.nextLine();
if (checkAnagram(t1, t2)) {
System.out.println("are anagrams");
} else {
System.out.println("are not anagrams");
}
sc.close();
}
}