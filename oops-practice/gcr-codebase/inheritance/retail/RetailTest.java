package inheritance.retail;

public class RetailTest {
    public static void main(String[] args) {
        Order o = new Order("ORD001", "2026-06-01");
        ShippedOrder s = new ShippedOrder("ORD002", "2026-06-02", "TRACK123");
        DeliveredOrder d = new DeliveredOrder("ORD003", "2026-06-03", "TRACK456", "2026-06-10");

        System.out.println("Order: " + o.getOrderStatus());
        System.out.println("Shipped: " + s.getOrderStatus());
        System.out.println("Delivered: " + d.getOrderStatus());
    }
}
