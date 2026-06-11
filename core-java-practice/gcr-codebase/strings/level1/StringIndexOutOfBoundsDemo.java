import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {

    static void generateException() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.next();
        System.out.println(s.charAt(s.length()));
        sc.close();
    }

    static void handleException() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.next();
        try {
            System.out.println(s.charAt(s.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
        sc.close();
    }

    public static void main(String[] args) {
        // generateException();

        handleException();
    }
}
