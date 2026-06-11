public class ArrayIndexOutOfBoundsDemo {

static void generateException() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
  System.out.print("Enter array size: ");
int size = sc.nextInt();
String[] names = new String[size];
  System.out.println("Enter " + size + " names:");
        for (int i = 0; i < size; i++) {
        names[i] = sc.next();
   }
 System.out.println("Accessing index " + (size + 1) + ": " + names[size + 1]);
}

 static void handleException() {
  java.util.Scanner sc = new java.util.Scanner(System.in);
    System.out.print("Enter array size: ");
  int size = sc.nextInt();
        String[] names = new String[size];
 System.out.println("Enter " + size + " names:");
   for (int i = 0; i < size; i++) {
          names[i] = sc.next();
    }
  try {
   System.out.println("Accessing index " + (size + 1) + ": " + names[size + 1]);
  } catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
   } catch (RuntimeException e) {
     System.out.println("Caught RuntimeException: " + e.getMessage());
        }
  }

public static void main(String[] args) {
  generateException();
        handleException();
 }
}
