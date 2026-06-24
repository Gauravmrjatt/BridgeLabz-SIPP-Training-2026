package inheritance.restaurant;

public class RestaurantTest {
    public static void main(String[] args) {
        Chef c = new Chef("Gordon", 101);
        Waiter w = new Waiter("John", 102);

        c.performDuties();
        w.performDuties();
    }
}
