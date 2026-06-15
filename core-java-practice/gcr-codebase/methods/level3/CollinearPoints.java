import java.util.Scanner;

public class CollinearPoints {
    public static boolean areCollinearBySlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        int abSlopeNum = (y2 - y1) * (x3 - x2);
        int bcSlopeNum = (y3 - y2) * (x2 - x1);
        return abSlopeNum == bcSlopeNum;
    }

    public static boolean areCollinearByArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        int area = x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2);
        return area == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x1 y1: ");
        int x1 = sc.nextInt(), y1 = sc.nextInt();
        System.out.print("Enter x2 y2: ");
        int x2 = sc.nextInt(), y2 = sc.nextInt();
        System.out.print("Enter x3 y3: ");
        int x3 = sc.nextInt(), y3 = sc.nextInt();
        boolean slopeResult = areCollinearBySlope(x1, y1, x2, y2, x3, y3);
        boolean areaResult = areCollinearByArea(x1, y1, x2, y2, x3, y3);
        System.out.println("Collinear by slope: " + slopeResult);
        System.out.println("Collinear by area: " + areaResult);
    }
}
