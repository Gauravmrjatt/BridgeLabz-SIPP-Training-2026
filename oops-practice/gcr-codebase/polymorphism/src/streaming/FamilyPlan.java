package streaming;

class FamilyPlan extends Subscription {
    FamilyPlan(String subscriberName, String subscriptionId) {
        super(subscriberName, subscriptionId);
    }

    @Override
    double calculateMonthlyCharge() {
        return 22.99;
    }
}
