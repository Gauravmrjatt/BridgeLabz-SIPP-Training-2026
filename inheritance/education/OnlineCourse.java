package inheritance.education;

public class OnlineCourse extends Course {
    protected String platform;
    protected boolean isRecorded;

    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Platform: " + platform + ", Recorded: " + isRecorded);
    }
}
