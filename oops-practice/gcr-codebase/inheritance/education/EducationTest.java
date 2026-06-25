package inheritance.education;

public class EducationTest {
    public static void main(String[] args) {
        PaidOnlineCourse p = new PaidOnlineCourse("Java Masterclass", 12, "Udemy", true, 199.99, 20);
        p.display();
    }
}
