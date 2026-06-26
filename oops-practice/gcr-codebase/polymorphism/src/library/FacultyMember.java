package library;

class FacultyMember extends LibraryMember {
    FacultyMember(String memberName, String memberId) {
        super(memberName, memberId);
    }

    @Override
    int calculateFine(int overdueDays) {
        return overdueDays * 5;
    }
}
