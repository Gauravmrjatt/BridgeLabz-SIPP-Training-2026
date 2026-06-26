package library;

abstract class LibraryMember {
    String memberName;
    String memberId;

    LibraryMember(String memberName, String memberId) {
        this.memberName = memberName;
        this.memberId = memberId;
    }

    abstract int calculateFine(int overdueDays);

    void printDetails() {
        System.out.println("Name: " + memberName + ", ID: " + memberId);
    }
}
