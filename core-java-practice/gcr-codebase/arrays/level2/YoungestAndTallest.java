import java.util.Scanner;

public class YoungestAndTallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = 3;
        double[] ages = new double[n];
        double[] heights = new double[n];
        
        String[] names = {"Amar", "Akbar", "Anthony"};
        
        for (int i = 0; i < n; i++) {
            System.out.println("Enter age for " + names[i] + ": ");
            ages[i] = scanner.nextDouble();
            
            System.out.println("Enter height for " + names[i] + " (in cm): ");
            heights[i] = scanner.nextDouble();
        }
        
        int youngestIndex = 0;
        int tallestIndex = 0;
        
        for (int i = 1; i < n; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
            
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }
        
        System.out.println("\nResults:");
        System.out.println("The youngest friend among " + names[0] + ", " + names[1] + ", and " + names[2] + " is " + names[youngestIndex] + " with age " + ages[youngestIndex]);
        System.out.println("The tallest friend among " + names[0] + ", " + names[1] + ", and " + names[2] + " is " + names[tallestIndex] + " with height " + heights[tallestIndex] + " cm");
    }
}