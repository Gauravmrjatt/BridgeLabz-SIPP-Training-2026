package io;

import java.io.*;

public class CustomerFeedbackAnalyzer {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("feedback.txt"));
        String line;
        int goodCount = 0;
        
        for (int i = 0; i < 5 && (line = reader.readLine()) != null; i++) {
            if (line.toLowerCase().contains("good")) {
                goodCount++;
            }
        }
        reader.close();
        
        System.out.println("Good Feedback Count = " + goodCount);
    }
}