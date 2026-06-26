package rescue;

class FireRescueTeam extends RescueTeam {
    FireRescueTeam(String teamId, String location) {
        super(teamId, location);
    }

    @Override
    void performDuty() {
        System.out.println("Fire rescue team " + teamId + " fighting fires in " + location);
    }
}
