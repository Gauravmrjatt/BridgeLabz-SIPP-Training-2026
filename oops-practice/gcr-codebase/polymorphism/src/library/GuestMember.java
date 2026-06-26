package library;

class GuestMember extends LibraryMember {
    GuestMember(String memberName, String memberId) {
        super(memberName, memberId);
    }

    @Override
    int calculateFine(int overdueDays) {
        return overdueDays * 10;
    }
}
