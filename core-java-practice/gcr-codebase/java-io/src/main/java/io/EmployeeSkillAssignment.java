package io;

import java.io.*;
import java.util.Scanner;

public class EmployeeSkillAssignment {
    static class Employee {
        int id;
        String name;
        String department;
        double salary;
        
        Employee(int id, String name, String department, double salary) {
            this.id = id;
            this.name = name;
            this.department = department;
            this.salary = salary;
        }
        
        public String toString() {
            return "Employee{id=" + id + ", name='" + name + "', department='" + department + "', salary=" + salary + "}";
        }
    }
    
    public static void main(String[] args) throws IOException {
        Employee[] employees = new Employee[5];
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter 5 employee details:");
        for (int i = 0; i < 5; i++) {
            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            
            System.out.print("Name: ");
            String name = scanner.nextLine();
            
            System.out.print("Department: ");
            String department = scanner.nextLine();
            
            System.out.print("Salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine();
            
            employees[i] = new Employee(id, name, department, salary);
        }
        
        serializeEmployees(employees);
        Employee[] recovered = deserializeEmployees();
        
        System.out.println("\nRecovered Employee Information:");
        for (Employee emp : recovered) {
            System.out.println(emp);
        }
    }
    
    private static void serializeEmployees(Employee[] employees) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("employees.ser"));
        for (Employee emp : employees) {
            writer.write(emp.id + "," + emp.name + "," + emp.department + "," + emp.salary);
            writer.newLine();
        }
        writer.close();
    }
    
    private static Employee[] deserializeEmployees() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("employees.ser"));
        Employee[] employees = new Employee[5];
        
        String line;
        int i = 0;
        while ((line = reader.readLine()) != null && i < 5) {
            String[] parts = line.split(",");
            employees[i] = new Employee(
                Integer.parseInt(parts[0]),
                parts[1],
                parts[2],
                Double.parseDouble(parts[3])
            );
            i++;
        }
        reader.close();
        return employees;
    }
}