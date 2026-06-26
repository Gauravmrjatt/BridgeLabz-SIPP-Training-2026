package rescue;

class FoodSupplyTeam extends RescueTeam {
    FoodSupplyTeam(String teamId, String location) {
        super(teamId, location);
    }

    @Override
    void performDuty() {
        System.out.println("Food supply team " + teamId + " distributing food in " + location);
    }
}
