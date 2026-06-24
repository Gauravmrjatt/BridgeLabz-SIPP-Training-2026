package inheritance.education;

public class Course {
    protected String courseName;
    protected int duration;

    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    public void display() {
        System.out.println("Course: " + courseName + ", Duration: " + duration + " weeks");
    }
}
