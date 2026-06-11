import java.util.Scanner;

public class StudentVotingEligibility {

    public static int[] generateAges(int n) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }
        return ages;
    }

    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            if (ages[i] < 0) {
                result[i][1] = "Can't Vote";
            } else if (ages[i] >= 18) {
                result[i][1] = "true";
            } else {
                result[i][1] = "false";
            }
        }
        return result;
    }

    public static void displayTable(String[][] data) {
        System.out.println("+-------+----------+");
        System.out.printf("| %-5s | %-8s |\n", "Age", "Can Vote");
        System.out.println("+-------+----------+");
        for (String[] row : data) {
            System.out.printf("| %-5s | %-8s |\n", row[0], row[1]);
        }
        System.out.println("+-------+----------+");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int[] ages = generateAges(n);
        String[][] eligibility = checkVotingEligibility(ages);
        displayTable(eligibility);
    }
}
