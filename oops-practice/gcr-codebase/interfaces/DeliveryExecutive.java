interface FoodDelivery {
    default void trackOrder() {
        System.out.println("Food Delivery: Order is being prepared and will arrive in 30 mins.");
    }
}

interface GroceryDelivery {
    default void trackOrder() {
        System.out.println("Grocery Delivery: Items are being packed and will arrive in 45 mins.");
    }
    static String generateDeliveryCode() {
        return "DEL" + System.currentTimeMillis() % 100000;
    }
}

class DeliveryExecutive implements FoodDelivery, GroceryDelivery {
    private String[] customers = {"Alice", "Bob", "Charlie", "Diana", "Eve"};
    private String[] types = {"Food", "Grocery", "Food", "Grocery", "Food"};

    public void trackOrder() {
        FoodDelivery.super.trackOrder();
        GroceryDelivery.super.trackOrder();
        System.out.println("Combined: Your items are on the way!");
    }

    public void processDeliveries() {
        for (int i = 0; i < customers.length; i++) {
            String code = GroceryDelivery.generateDeliveryCode();
            System.out.println("Customer: " + customers[i] + " | Type: " + types[i] + " | Code: " + code);
            trackOrder();
            System.out.println("Delivery completed for " + customers[i]);
            System.out.println();
        }
    }
}

class DeliveryDemo {
    public static void main(String[] args) {
        DeliveryExecutive de = new DeliveryExecutive();
        de.processDeliveries();
    }
}
