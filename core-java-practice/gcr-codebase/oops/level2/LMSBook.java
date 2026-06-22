public class LMSBook {
    static String libraryName = "City Central Library";

    final String isbn;
    String title;
    String author;

    public LMSBook(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public static void displayLibraryName() {
        System.out.println("Library: " + libraryName);
    }

    public void displayDetails() {
        if (this instanceof LMSBook) {
            System.out.println("Library: " + libraryName);
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        }
    }

    public static void main(String[] args) {
        LMSBook book1 = new LMSBook("Clean Code", "Robert C. Martin", "978-0132350884");
        LMSBook book2 = new LMSBook("Effective Java", "Joshua Bloch", "978-0134685991");
        displayLibraryName();
        book1.displayDetails();
        book2.displayDetails();
    }
}
