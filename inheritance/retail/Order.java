package inheritance.retail;

public class Order {
    protected String orderId;
    protected String orderDate;
    protected String status;

    public Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.status = "PLACED";
    }

    public String getOrderStatus() {
        return status;
    }
}
