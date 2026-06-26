package library;

class StudentMember extends LibraryMember {
    StudentMember(String memberName, String memberId) {
        super(memberName, memberId);
    }

    @Override
    int calculateFine(int overdueDays) {
        return overdueDays * 2;
    }
}
