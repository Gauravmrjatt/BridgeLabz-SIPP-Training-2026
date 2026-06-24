package inheritance;

public class UniversityTest {
    public static void main(String[] args) {
        GradStudent gs = new GradStudent("Alice", 25, 101, 3.8, "AI in Healthcare");

        System.out.println(gs);
        System.out.println("IS-A GradStudent: " + (gs instanceof GradStudent));
        System.out.println("IS-A Student: " + (gs instanceof Student));
        System.out.println("IS-A Person: " + (gs instanceof Person));
        System.out.println("IS-A Object: " + (gs instanceof Object));
    }
}
