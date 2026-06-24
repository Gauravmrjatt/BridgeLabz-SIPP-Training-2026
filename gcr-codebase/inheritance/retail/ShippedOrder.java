package inheritance.retail;

public class ShippedOrder extends Order {
    protected String trackingNumber;

    public ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
        this.status = "SHIPPED";
    }

    @Override
    public String getOrderStatus() {
        return status + " (Tracking: " + trackingNumber + ")";
    }
}
