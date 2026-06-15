import java.util.Random;

public class FootballTeam {
    public static int[] generateHeights() {
        Random rand = new Random();
        int[] heights = new int[11];
        for (int i = 0; i < heights.length; i++) {
            heights[i] = rand.nextInt(101) + 150;
        }
        return heights;
    }

    public static int sum(int[] arr) {
        int total = 0;
        for (int num : arr) total += num;
        return total;
    }

    public static double meanHeight(int[] arr) {
        return (double) sum(arr) / arr.length;
    }

    public static int shortestHeight(int[] arr) {
        int min = arr[0];
        for (int h : arr) if (h < min) min = h;
        return min;
    }

    public static int tallestHeight(int[] arr) {
        int max = arr[0];
        for (int h : arr) if (h > max) max = h;
        return max;
    }

    public static void main(String[] args) {
        int[] heights = generateHeights();
        System.out.print("Heights: ");
        for (int h : heights) System.out.print(h + " ");
        System.out.println();
        System.out.println("Shortest: " + shortestHeight(heights) + " cm");
        System.out.println("Tallest: " + tallestHeight(heights) + " cm");
        System.out.println("Mean: " + String.format("%.2f", meanHeight(heights)) + " cm");
    }
}
