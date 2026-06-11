import java.util.Scanner;

public class NumberFormatExceptionDemo {

    static void generateException() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.next();
        System.out.println(Integer.parseInt(s));
        sc.close();
    }

    static void handleException() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.next();
        try {
            System.out.println(Integer.parseInt(s));
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
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
