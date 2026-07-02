import java.util.HashSet;
import java.util.Scanner;

public class EventEntryVerificationSystem {
    private HashSet<String> participants;

    public EventEntryVerificationSystem() {
        participants = new HashSet<>();
    }

    public boolean registerParticipant(String email) {
        if (participants.contains(email)) {
            System.out.println("Registration failed: Email " + email + " is already registered.");
            return false;
        }
        participants.add(email);
        System.out.println("Participant " + email + " registered successfully.");
        return true;
    }

    public void displayAllParticipants() {
        if (participants.isEmpty()) {
            System.out.println("No participants registered yet.");
            return;
        }
        System.out.println("Registered Participants:");
        for (String email : participants) {
            System.out.println("  " + email);
        }
    }

    public int getTotalAttendees() {
        return participants.size();
    }

    public static void main(String[] args) {
        EventEntryVerificationSystem system = new EventEntryVerificationSystem();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Event Entry Verification System ---");
            System.out.println("1. Register");
            System.out.println("2. Display All");
            System.out.println("3. Show Total");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter email to register: ");
                    String email = scanner.nextLine().trim();
                    system.registerParticipant(email);
                    break;
                case 2:
                    system.displayAllParticipants();
                    break;
                case 3:
                    System.out.println("Total attendees eligible to enter: " + system.getTotalAttendees());
                    break;
                case 4:
                    System.out.println("Exiting. Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
