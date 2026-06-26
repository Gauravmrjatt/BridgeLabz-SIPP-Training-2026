package streaming;

class PremiumPlan extends Subscription {
    PremiumPlan(String subscriberName, String subscriptionId) {
        super(subscriberName, subscriptionId);
    }

    @Override
    double calculateMonthlyCharge() {
        return 15.99;
    }
}
