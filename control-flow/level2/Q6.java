import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter age of Amar: ");
        int amarAge = scanner.nextInt();
        System.out.print("Enter height of Amar: ");
        int amarHeight = scanner.nextInt();

        System.out.print("Enter age of Akbar: ");
        int akbarAge = scanner.nextInt();
        System.out.print("Enter height of Akbar: ");
        int akbarHeight = scanner.nextInt();

        System.out.print("Enter age of Anthony: ");
        int anthonyAge = scanner.nextInt();
        System.out.print("Enter height of Anthony: ");
        int anthonyHeight = scanner.nextInt();

        String youngest = "Amar";
        int minAge = amarAge;

        if (akbarAge < minAge) {
            minAge = akbarAge;
            youngest = "Akbar";
        }
        if (anthonyAge < minAge) {
            youngest = "Anthony";
        }

        String tallest = "Amar";
        int maxHeight = amarHeight;

        if (akbarHeight > maxHeight) {
            maxHeight = akbarHeight;
            tallest = "Akbar";
        }
        if (anthonyHeight > maxHeight) {
            tallest = "Anthony";
        }

        System.out.println("Youngest friend: " + youngest);
        System.out.println("Tallest friend: " + tallest);
        scanner.close();
    }
}
