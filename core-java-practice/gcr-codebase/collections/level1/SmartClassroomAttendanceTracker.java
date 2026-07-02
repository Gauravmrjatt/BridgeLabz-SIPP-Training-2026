import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class SmartClassroomAttendanceTracker {

    private HashMap<String, ArrayList<String>> attendance;

    public SmartClassroomAttendanceTracker() {
        attendance = new HashMap<>();
    }

    public void markAttendance(String subject, String studentName) {
        attendance.putIfAbsent(subject, new ArrayList<>());
        ArrayList<String> students = attendance.get(subject);
        if (students.contains(studentName)) {
            System.out.println(studentName + " is already marked present in " + subject);
        } else {
            students.add(studentName);
            System.out.println("Attendance marked for " + studentName + " in " + subject);
        }
    }

    public void displayAttendanceBySubject(String subject) {
        ArrayList<String> students = attendance.get(subject);
        if (students == null || students.isEmpty()) {
            System.out.println("No attendance records for " + subject);
            return;
        }
        System.out.println("Students present in " + subject + ":");
        for (String student : students) {
            System.out.println("  - " + student);
        }
    }

    public void displayAllAttendance() {
        if (attendance.isEmpty()) {
            System.out.println("No attendance records available.");
            return;
        }
        for (String subject : attendance.keySet()) {
            ArrayList<String> students = attendance.get(subject);
            System.out.println("Subject: " + subject + " | Total Present: " + students.size());
            for (String student : students) {
                System.out.println("  - " + student);
            }
        }
    }

    public static void main(String[] args) {
        SmartClassroomAttendanceTracker tracker = new SmartClassroomAttendanceTracker();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n=== Smart Classroom Attendance Tracker ===");
            System.out.println("1. Mark Attendance");
            System.out.println("2. View Subject");
            System.out.println("3. View All");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            String input = scanner.nextLine().trim();
            int choice;
            try {
                choice = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid choice. Please enter a number.");
                continue;
            }
            switch (choice) {
                case 1:
                    System.out.print("Enter subject: ");
                    String subject = scanner.nextLine().trim();
                    System.out.print("Enter student name: ");
                    String student = scanner.nextLine().trim();
                    tracker.markAttendance(subject, student);
                    break;
                case 2:
                    System.out.print("Enter subject: ");
                    String viewSubject = scanner.nextLine().trim();
                    tracker.displayAttendanceBySubject(viewSubject);
                    break;
                case 3:
                    tracker.displayAllAttendance();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please choose 1-4.");
            }
        }
    }
}
