package inheritance.education;

public class PaidOnlineCourse extends OnlineCourse {
    private double fee;
    private double discount;

    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Fee: $" + fee + ", Discount: " + discount + "%");
    }
}
