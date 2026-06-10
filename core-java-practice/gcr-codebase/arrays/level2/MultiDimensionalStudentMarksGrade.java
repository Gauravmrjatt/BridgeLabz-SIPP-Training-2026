import java.util.Scanner;

public class MultiDimensionalStudentMarksGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter number of students: ");
        int numberOfStudents = scanner.nextInt();
        
        double[][] studentMarks = new double[numberOfStudents][3];
        double[] percentages = new double[numberOfStudents];
        String[] grades = new String[numberOfStudents];
        
        String[] subjects = {"Physics", "Chemistry", "Maths"};
        
        for (int i = 0; i < numberOfStudents; i++) {
            for (int j = 0; j < 3; j++) {
                while (true) {
                    System.out.println("Enter marks in " + subjects[j] + " for student " + (i + 1) + ": ");
                    studentMarks[i][j] = scanner.nextDouble();
                    if (studentMarks[i][j] >= 0) {
                        break;
                    } else {
                        System.out.println("Marks cannot be negative. Enter again.");
                    }
                }
            }
            
            percentages[i] = (studentMarks[i][0] + studentMarks[i][1] + studentMarks[i][2]) / 3.0;
            
            if (percentages[i] >= 90) {
                grades[i] = "A";
            } else if (percentages[i] >= 80) {
                grades[i] = "B";
            } else if (percentages[i] >= 70) {
                grades[i] = "C";
            } else if (percentages[i] >= 60) {
                grades[i] = "D";
            } else {
                grades[i] = "F";
            }
        }
        
        System.out.println("\nStudent Results (Multi-dimensional Array):");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Student " + (i + 1) + ":");
            System.out.println("  Physics: " + studentMarks[i][0]);
            System.out.println("  Chemistry: " + studentMarks[i][1]);
            System.out.println("  Maths: " + studentMarks[i][2]);
            System.out.println("  Percentage: " + percentages[i]);
            System.out.println("  Grade: " + grades[i]);
        }
    }
}