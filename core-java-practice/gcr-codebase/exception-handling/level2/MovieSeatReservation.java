class MovieSeatReservation {
    public static int getSeat(int index, int[] seats) {
        try {
            return seats[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            return -1;
        }
    }

    public static void main(String[] args) {
        int[] seats = {101, 102, 103, 104, 105};
        int requestedIndex = 8;
        int seatNumber = getSeat(requestedIndex, seats);
        if (seatNumber == -1) {
            System.out.println("Invalid seat index. Returning -1.");
        } else {
            System.out.println("Seat number: " + seatNumber);
        }
    }
}