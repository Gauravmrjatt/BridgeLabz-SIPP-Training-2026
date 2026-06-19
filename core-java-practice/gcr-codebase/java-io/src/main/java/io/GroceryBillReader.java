package io;

import java.io.*;

public class GroceryBillReader {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("bill.txt");
        BufferedReader br = new BufferedReader(reader);
        
        String line;
        int lineCount = 0;
        System.out.println("Bill Contents:");
        while ((line = br.readLine()) != null) {
            System.out.println(line);
            lineCount++;
        }
        
        br.close();
        System.out.println("\nTotal lines: " + lineCount);
    }
}