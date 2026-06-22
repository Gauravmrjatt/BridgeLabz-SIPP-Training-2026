public class HospitalPatient {
    static String hospitalName = "City Hospital";
    static int totalPatients = 0;

    final String patientID;
    String name;
    int age;
    String ailment;

    public HospitalPatient(String name, int age, String ailment, String patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    public static void getTotalPatients() {
        System.out.println("Total patients: " + totalPatients);
    }

    public void displayDetails() {
        if (this instanceof HospitalPatient) {
            System.out.println("Hospital: " + hospitalName);
            System.out.println("Patient: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
            System.out.println("ID: " + patientID);
        }
    }

    public static void main(String[] args) {
        HospitalPatient p1 = new HospitalPatient("John", 45, "Fever", "P001");
        HospitalPatient p2 = new HospitalPatient("Jane", 30, "Fracture", "P002");
        p1.displayDetails();
        p2.displayDetails();
        getTotalPatients();
    }
}
