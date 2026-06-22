public class EmployeeSystem {
    static String companyName = "TechCorp";
    static int totalEmployees = 0;

    final String id;
    String name;
    String designation;

    public EmployeeSystem(String name, String id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    public static void displayTotalEmployees() {
        System.out.println("Total employees: " + totalEmployees);
    }

    public void displayDetails() {
        if (this instanceof EmployeeSystem) {
            System.out.println("Company: " + companyName);
            System.out.println("Name: " + name);
            System.out.println("ID: " + id);
            System.out.println("Designation: " + designation);
        }
    }

    public static void main(String[] args) {
        EmployeeSystem emp1 = new EmployeeSystem("Alice", "E001", "Developer");
        EmployeeSystem emp2 = new EmployeeSystem("Bob", "E002", "Manager");
        emp1.displayDetails();
        emp2.displayDetails();
        displayTotalEmployees();
    }
}
