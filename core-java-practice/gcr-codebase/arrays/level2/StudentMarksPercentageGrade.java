import java.util.Scanner;

public class StudentMarksPercentageGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter number of students: ");
        int numberOfStudents = scanner.nextInt();
        
        double[] physicsMarks = new double[numberOfStudents];
        double[] chemistryMarks = new double[numberOfStudents];
        double[] mathsMarks = new double[numberOfStudents];
        double[] percentages = new double[numberOfStudents];
        String[] grades = new String[numberOfStudents];
        
        for (int i = 0; i < numberOfStudents; i++) {
            while (true) {
                System.out.println("Enter marks in Physics for student " + (i + 1) + ": ");
                physicsMarks[i] = scanner.nextDouble();
                if (physicsMarks[i] >= 0) {
                    break;
                } else {
                    System.out.println("Marks cannot be negative. Enter again.");
                }
            }
            
            while (true) {
                System.out.println("Enter marks in Chemistry for student " + (i + 1) + ": ");
                chemistryMarks[i] = scanner.nextDouble();
                if (chemistryMarks[i] >= 0) {
                    break;
                } else {
                    System.out.println("Marks cannot be negative. Enter again.");
                }
            }
            
            while (true) {
                System.out.println("Enter marks in Maths for student " + (i + 1) + ": ");
                mathsMarks[i] = scanner.nextDouble();
                if (mathsMarks[i] >= 0) {
                    break;
                } else {
                    System.out.println("Marks cannot be negative. Enter again.");
                }
            }
            
            percentages[i] = (physicsMarks[i] + chemistryMarks[i] + mathsMarks[i]) / 3.0;
            
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
        
        System.out.println("\nStudent Results:");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Student " + (i + 1) + ":");
            System.out.println("  Physics: " + physicsMarks[i]);
            System.out.println("  Chemistry: " + chemistryMarks[i]);
            System.out.println("  Maths: " + mathsMarks[i]);
            System.out.println("  Percentage: " + percentages[i]);
            System.out.println("  Grade: " + grades[i]);
        }
    }
}