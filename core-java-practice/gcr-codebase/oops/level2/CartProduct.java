public class CartProduct {
    static double discount = 5.0;

    final String productID;
    String productName;
    double price;
    int quantity;

    public CartProduct(String productName, double price, int quantity, String productID) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
        System.out.println("Discount updated to " + discount + "%");
    }

    public double calculateTotal() {
        return (price * quantity) * (1 - discount / 100);
    }

    public void displayDetails() {
        if (this instanceof CartProduct) {
            System.out.println("Product: " + productName);
            System.out.println("ID: " + productID);
            System.out.println("Price: $" + price);
            System.out.println("Qty: " + quantity);
            System.out.println("Discount: " + discount + "%");
            System.out.println("Total: $" + calculateTotal());
        }
    }

    public static void main(String[] args) {
        CartProduct p1 = new CartProduct("Laptop", 1000, 1, "P1001");
        CartProduct p2 = new CartProduct("Mouse", 25, 2, "P1002");
        p1.displayDetails();
        p2.displayDetails();
        updateDiscount(10.0);
        p1.displayDetails();
    }
}
