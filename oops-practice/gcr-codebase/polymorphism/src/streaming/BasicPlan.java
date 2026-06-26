package streaming;

class BasicPlan extends Subscription {
    BasicPlan(String subscriberName, String subscriptionId) {
        super(subscriberName, subscriptionId);
    }

    @Override
    double calculateMonthlyCharge() {
        return 9.99;
    }
}
