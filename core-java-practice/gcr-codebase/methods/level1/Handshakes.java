import java.util.Scanner;

public class Handshakes {
    public static int maxHandshakes(int n) {
        return n * (n - 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int numberOfStudents = sc.nextInt();
        int handshakes = maxHandshakes(numberOfStudents);
        System.out.println("The number of possible handshakes is " + handshakes);
    }
}
