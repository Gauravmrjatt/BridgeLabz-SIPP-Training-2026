package io;

import java.util.Scanner;
import java.io.*;

public class DailyExpenseLogger {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        BufferedWriter writer = new BufferedWriter(new FileWriter("expenses.txt", true));
        
        System.out.println("Enter expense details (or 'exit' to stop):");
        while (true) {
            System.out.print("Category and amount: ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) break;
            
            writer.write(input);
            writer.newLine();
        }
        
        writer.close();
        System.out.println("Expenses saved to expenses.txt");
    }
}