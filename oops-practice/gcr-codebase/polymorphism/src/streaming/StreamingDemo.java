package streaming;

public class StreamingDemo {
    public static void main(String[] args) {
        Subscription[] subscriptions = {
            new BasicPlan("Alice", "BAS001"),
            new PremiumPlan("Bob", "PRE001"),
            new FamilyPlan("Charlie", "FAM001"),
            new BasicPlan("Diana", "BAS002"),
            new PremiumPlan("Eve", "PRE002"),
            new FamilyPlan("Frank", "FAM002")
        };

        System.out.println("=== Subscriber Billing ===");
        for (Subscription s : subscriptions) {
            System.out.println(s.subscriberName + " (" + s.subscriptionId + ") - $" + s.calculateMonthlyCharge());
        }

        System.out.println("\nTotal Monthly Revenue: $" + calculateTotalRevenue(subscriptions));

        String searchId = "PRE001";
        System.out.println("\nSearching for subscription: " + searchId);
        Subscription found = searchById(subscriptions, searchId);
        if (found != null) {
            System.out.println("Found - " + found.subscriberName + " charges $" + found.calculateMonthlyCharge());
        }

        char letter = 'A';
        System.out.println("\nSubscribers starting with '" + letter + "':");
        displayByStartingLetter(subscriptions, letter);

        Subscription mostExpensive = findMostExpensive(subscriptions);
        System.out.println("\nMost Expensive Subscription: " + mostExpensive.subscriberName
            + " ($" + mostExpensive.calculateMonthlyCharge() + ")");
    }

    static double calculateTotalRevenue(Subscription[] subs) {
        double total = 0;
        for (Subscription s : subs) {
            total += s.calculateMonthlyCharge();
        }
        return total;
    }

    static Subscription searchById(Subscription[] subs, String id) {
        for (Subscription s : subs) {
            if (s.subscriptionId.equals(id)) {
                return s;
            }
        }
        return null;
    }

    static void displayByStartingLetter(Subscription[] subs, char letter) {
        boolean found = false;
        for (Subscription s : subs) {
            if (s.subscriberName.charAt(0) == letter) {
                System.out.println("  " + s.subscriberName + " - " + s.subscriptionId);
                found = true;
            }
        }
        if (!found) {
            System.out.println("  No subscribers found");
        }
    }

    static Subscription findMostExpensive(Subscription[] subs) {
        Subscription max = subs[0];
        for (Subscription s : subs) {
            if (s.calculateMonthlyCharge() > max.calculateMonthlyCharge()) {
                max = s;
            }
        }
        return max;
    }
}
