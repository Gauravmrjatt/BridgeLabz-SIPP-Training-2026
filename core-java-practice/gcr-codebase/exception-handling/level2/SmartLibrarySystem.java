class SmartLibrarySystem {
    public int getBookLength(int index, String[] books) {
        if (index < 0 || index >= books.length) {
            System.out.println("Invalid index! Index out of range.");
            return -1;
        }
        if (books[index] == null) {
            System.out.println("Book entry at index " + index + " contains null.");
            return -1;
        }
        return books[index].length();
    }

    public static void main(String[] args) {
        SmartLibrarySystem library = new SmartLibrarySystem();
        String[] books = {"Java", "Python", null, "C++"};

        System.out.println("Length of book at index 0: " + library.getBookLength(0, books));
        System.out.println("Length of book at index 1: " + library.getBookLength(1, books));
        System.out.println("Length of book at index 2: " + library.getBookLength(2, books));
        System.out.println("Length of book at index 5: " + library.getBookLength(5, books));
    }
}