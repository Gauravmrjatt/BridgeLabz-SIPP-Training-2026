package inheritance;

public class GradStudent extends Student {
    private String thesis;

    public GradStudent(String name, int age, int studentId, double gpa, String thesis) {
        super(name, age, studentId, gpa);
        this.thesis = thesis;
    }

    public String getThesis() {
        return thesis;
    }

    @Override
    public String toString() {
        return "GradStudent[thesis=" + thesis + ", " + super.toString() + "]";
    }
}
