import java.util.Scanner;

public class StudentGradeCalculator {

    public static int[][] generateScores(int numStudents) {
        Scanner sc = new Scanner(System.in);
        int[][] scores = new int[numStudents][3];
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + ":");
            System.out.print("Physics: ");
            scores[i][0] = sc.nextInt();
            System.out.print("Chemistry: ");
            scores[i][1] = sc.nextInt();
            System.out.print("Maths: ");
            scores[i][2] = sc.nextInt();
        }
        return scores;
    }

    public static String[][] calculatePercentages(int[][] scores) {
        String[][] pcmData = new String[scores.length][3];
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double perc = (total / 300.0) * 100;
            perc = Math.round(perc * 100.0) / 100.0;
            pcmData[i][0] = String.valueOf(total);
            pcmData[i][1] = String.valueOf(Math.round(avg * 100.0) / 100.0);
            pcmData[i][2] = String.valueOf(perc);
        }
        return pcmData;
    }

    public static String[][] calculateGrades(String[][] percentages) {
        String[][] grades = new String[percentages.length][1];
        for (int i = 0; i < percentages.length; i++) {
            double perc = Double.parseDouble(percentages[i][2]);
            if (perc >= 90) {
                grades[i][0] = "A+";
            } else if (perc >= 80) {
                grades[i][0] = "A";
            } else if (perc >= 70) {
                grades[i][0] = "B+";
            } else if (perc >= 60) {
                grades[i][0] = "B";
            } else if (perc >= 50) {
                grades[i][0] = "C";
            } else if (perc >= 40) {
                grades[i][0] = "D";
            } else {
                grades[i][0] = "F";
            }
        }
        return grades;
    }

    public static void displayScorecard(int[][] scores, String[][] pcmData, String[][] grades) {
        System.out.println("\n=== Student Scorecard ===");
        System.out.println("+---------+---------+-----------+-------+-------+---------+------------+-------+");
        System.out.printf("| %-7s | %-7s | %-9s | %-5s | %-5s | %-7s | %-10s | %-5s |\n",
                "Student", "Physics", "Chemistry", "Maths", "Total", "Average", "Percentage", "Grade");
        System.out.println("+---------+---------+-----------+-------+-------+---------+------------+-------+");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("| %-7s | %-7s | %-9s | %-5s | %-5s | %-7s | %-10s | %-5s |\n",
                    "S" + (i + 1), scores[i][0], scores[i][1], scores[i][2],
                    pcmData[i][0], pcmData[i][1], pcmData[i][2], grades[i][0]);
        }
        System.out.println("+---------+---------+-----------+-------+-------+---------+------------+-------+");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int num = sc.nextInt();
        int[][] scores = generateScores(num);
        String[][] pcmData = calculatePercentages(scores);
        String[][] grades = calculateGrades(pcmData);
        displayScorecard(scores, pcmData, grades);
    }
}
