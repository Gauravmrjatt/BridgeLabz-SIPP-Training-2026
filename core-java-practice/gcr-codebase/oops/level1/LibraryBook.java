public class LibraryBook {
    String title;
    String author;
    double price;
    boolean isAvailable;

    public LibraryBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = true;
    }

    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println(title + " has been borrowed.");
        } else {
            System.out.println(title + " is currently unavailable.");
        }
    }

    public void returnBook() {
        isAvailable = true;
        System.out.println(title + " has been returned.");
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
    }

    public static void main(String[] args) {
        LibraryBook book = new LibraryBook("The Great Gatsby", "F. Scott Fitzgerald", 12.99);
        book.displayDetails();
        book.borrowBook();
        book.borrowBook();
        book.returnBook();
        book.borrowBook();
    }
}
