import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class AddressBookApp {

    static class Contact {
        String name;
        String phone;
        String email;

        Contact(String name, String phone, String email) {
            this.name = name;
            this.phone = phone;
            this.email = email;
        }

        @Override
        public String toString() {
            return String.format("%-20s %-15s %-25s", name, phone, email);
        }
    }

    private List<Contact> contactList = new ArrayList<>();
    private HashMap<String, Contact> contactMap = new HashMap<>();
    private HashSet<String> phoneSet = new HashSet<>();

    public boolean addContact(String name, String phone, String email) {
        if (phoneSet.contains(phone)) {
            System.out.println("Duplicate phone number. Contact not added.");
            return false;
        }
        Contact c = new Contact(name, phone, email);
        contactList.add(c);
        contactMap.put(name, c);
        phoneSet.add(phone);
        System.out.println("Contact added successfully.");
        return true;
    }

    public void searchContact(String name) {
        Contact c = contactMap.get(name);
        if (c == null) {
            System.out.println("Contact not found.");
            return;
        }
        System.out.println(c);
    }

    public boolean deleteContact(String name) {
        Contact c = contactMap.remove(name);
        if (c == null) {
            System.out.println("Contact not found.");
            return false;
        }
        contactList.remove(c);
        phoneSet.remove(c.phone);
        System.out.println("Contact deleted successfully.");
        return true;
    }

    public void displaySortedByName() {
        if (contactList.isEmpty()) {
            System.out.println("No contacts to display.");
            return;
        }
        List<Contact> sorted = new ArrayList<>(contactList);
        Collections.sort(sorted, (a, b) -> a.name.compareToIgnoreCase(b.name));
        System.out.printf("%-20s %-15s %-25s%n", "Name", "Phone", "Email");
        System.out.println("---------------------------------------------------------------");
        for (Contact c : sorted) {
            System.out.println(c);
        }
    }

    public static void main(String[] args) {
        AddressBookApp app = new AddressBookApp();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- Address Book Menu ---");
            System.out.println("1. Add Contact");
            System.out.println("2. Search Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. Display Sorted by Name");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            String input = scanner.nextLine().trim();
            int choice;
            try {
                choice = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid choice. Please enter a number.");
                continue;
            }
            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine().trim();
                    System.out.print("Enter phone: ");
                    String phone = scanner.nextLine().trim();
                    System.out.print("Enter email: ");
                    String email = scanner.nextLine().trim();
                    app.addContact(name, phone, email);
                    break;
                case 2:
                    System.out.print("Enter name to search: ");
                    String searchName = scanner.nextLine().trim();
                    app.searchContact(searchName);
                    break;
                case 3:
                    System.out.print("Enter name to delete: ");
                    String deleteName = scanner.nextLine().trim();
                    app.deleteContact(deleteName);
                    break;
                case 4:
                    app.displaySortedByName();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please choose 1-5.");
            }
        }
    }
}
