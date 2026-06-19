package io;

import java.io.*;

public class ProductInventoryChecker {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("inventory.txt"));
        
        String line;
        System.out.println("Out of Stock Items:");
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split("-");
            if (parts.length == 2) {
                String product = parts[0].trim();
                int quantity = Integer.parseInt(parts[1].trim());
                if (quantity == 0) {
                    System.out.println(product + " is out of stock");
                }
            }
        }
        reader.close();
    }
}