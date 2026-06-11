import java.util.Scanner;

public class IllegalArgumentExceptionDemo {

    static void generateException() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.next();
        System.out.println(s.substring(3, 1));
        sc.close();
    }

    static void handleException() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.next();
        try {
            System.out.println(s.substring(3, 1));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
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
