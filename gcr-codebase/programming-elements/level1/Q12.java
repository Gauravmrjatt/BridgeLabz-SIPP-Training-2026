import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base: ");
        double base = input.nextDouble();
        System.out.print("Enter height: ");
        double height = input.nextDouble();
        double areaSqInches = 0.5 * base * height;
        double areaSqCm = areaSqInches * 6.4516;
        System.out.println("The area of the triangle is " + areaSqInches + " square inches and " + areaSqCm + " square centimeters");
        input.close();
    }
}
