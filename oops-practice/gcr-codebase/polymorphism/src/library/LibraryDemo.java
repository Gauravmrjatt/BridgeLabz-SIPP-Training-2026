package library;

public class LibraryDemo {
    public static void main(String[] args) {
        LibraryMember[] members = {
            new StudentMember("Alice Johnson", "STU001"),
            new FacultyMember("Dr. Smith", "FAC001"),
            new GuestMember("Bob Brown", "GST001"),
            new StudentMember("Charlie Lee", "STU002"),
            new FacultyMember("Prof. Davis", "FAC002"),
            new GuestMember("Diana Rose", "GST002")
        };

        System.out.println("=== Library Members ===");
        printAllMembers(members);

        System.out.println("\n=== Fine Calculation (7 overdue days) ===");
        for (LibraryMember m : members) {
            System.out.println(m.memberName + " fine: $" + m.calculateFine(7));
        }

        String searchId = "FAC001";
        System.out.println("\n=== Searching for Member ID: " + searchId + " ===");
        LibraryMember found = findMemberById(members, searchId);
        if (found != null) {
            found.printDetails();
            System.out.println("Fine for 3 overdue days: $" + found.calculateFine(3));
        } else {
            System.out.println("Member not found");
        }
    }

    static void printAllMembers(LibraryMember[] members) {
        for (LibraryMember m : members) {
            m.printDetails();
        }
    }

    static LibraryMember findMemberById(LibraryMember[] members, String targetId) {
        for (LibraryMember m : members) {
            if (m.memberId.equals(targetId)) {
                return m;
            }
        }
        return null;
    }
}
