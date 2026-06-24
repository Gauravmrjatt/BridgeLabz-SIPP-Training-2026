package inheritance.retail;

public class DeliveredOrder extends ShippedOrder {
    private String deliveryDate;

    public DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
        this.status = "DELIVERED";
    }

    @Override
    public String getOrderStatus() {
        return status + " on " + deliveryDate + " (Tracking: " + trackingNumber + ")";
    }
}
