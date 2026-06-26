interface StreamingService {
    void streamContent();
    default void showSubscriptionDetails() {
        System.out.println("Streaming Service: Basic plan - $9.99/month");
    }
}

interface GamingService {
    void playGame();
    default void showSubscriptionDetails() {
        System.out.println("Gaming Service: Game Pass - $14.99/month");
    }
}

class SmartTV implements StreamingService, GamingService {
    private String[] movies = {"Inception", "Interstellar", "The Matrix", "Avatar", "Tenet"};
    private String[] games = {"Cyberpunk 2077", "FIFA 24", "GTA V", "Minecraft", "Fortnite"};

    public void streamContent() {
        System.out.println("Available Movies:");
        for (String m : movies) {
            System.out.println("  - " + m);
        }
    }

    public void playGame() {
        System.out.println("Available Games:");
        for (String g : games) {
            System.out.println("  - " + g);
        }
    }

    public void showSubscriptionDetails() {
        StreamingService.super.showSubscriptionDetails();
        GamingService.super.showSubscriptionDetails();
        System.out.println("Combo Offer: Both services - $19.99/month");
    }
}

class SmartTVDemo {
    public static void main(String[] args) {
        SmartTV tv = new SmartTV();
        tv.streamContent();
        tv.playGame();
        tv.showSubscriptionDetails();
    }
}
