package io;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SchoolResultPortal {
    public static void main(String[] args) {
        String inputFile = "students.txt";
        String outputFile = "reportCard.txt";
        
        try {
            List<String> reportCards = processStudentData(inputFile);
            writeReportCards(outputFile, reportCards);
        } catch (FileNotFoundException e) {
            System.out.println("Input file not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error processing files: " + e.getMessage());
        }
    }
    
    private static List<String> processStudentData(String filename) throws IOException {
        List<String> reportCards = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(" ");
            if (parts.length >= 2) {
                String name = parts[0];
                int marks = Integer.parseInt(parts[1]);
                double average = marks / 2.0;
                String grade = calculateGrade(average);
                reportCards.add(String.format("%s: %d marks -> %.1f average -> %s", 
                    name, marks, average, grade));
            }
        }
        reader.close();
        return reportCards;
    }
    
    private static String calculateGrade(double average) {
        if (average >= 90) return "A";
        if (average >= 80) return "B";
        if (average >= 70) return "C";
        if (average >= 60) return "D";
        return "F";
    }
    
    private static void writeReportCards(String filename, List<String> reportCards) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true));
        for (String card : reportCards) {
            writer.write(card);
            writer.newLine();
        }
        writer.close();
    }
}