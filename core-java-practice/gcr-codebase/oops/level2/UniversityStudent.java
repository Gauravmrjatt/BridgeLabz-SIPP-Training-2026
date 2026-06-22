public class UniversityStudent {
    static String universityName = "State University";
    static int totalStudents = 0;

    final String rollNumber;
    String name;
    String grade;

    public UniversityStudent(String name, String rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    public static void displayTotalStudents() {
        System.out.println("Total students: " + totalStudents);
    }

    public void displayDetails() {
        if (this instanceof UniversityStudent) {
            System.out.println("University: " + universityName);
            System.out.println("Name: " + name);
            System.out.println("Roll: " + rollNumber);
            System.out.println("Grade: " + grade);
        }
    }

    public void updateGrade(String newGrade) {
        if (this instanceof UniversityStudent) {
            this.grade = newGrade;
            System.out.println("Grade updated to " + newGrade);
        }
    }

    public static void main(String[] args) {
        UniversityStudent s1 = new UniversityStudent("Alice", "R001", "A");
        UniversityStudent s2 = new UniversityStudent("Bob", "R002", "B+");
        s1.displayDetails();
        s2.displayDetails();
        displayTotalStudents();
    }
}
