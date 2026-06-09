import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int m = scanner.nextInt();

        System.out.print("Enter day (1-31): ");
        int d = scanner.nextInt();

        System.out.print("Enter year: ");
        int y = scanner.nextInt();

        int y1 = y - (14 - m) / 12;
        int x = y1 + y1 / 4 - y1 / 100 + y1 / 400;
        int m2 = m + 12 * ((14 - m) / 12) - 2;
        int dayOfWeek = (d + x + 31 * m2 / 7) % 7;

        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        System.out.println("Day of the week: " + dayOfWeek + " (" + days[dayOfWeek] + ")");
        scanner.close();
    }
}
