package rescue;

class MedicalTeam extends RescueTeam {
    MedicalTeam(String teamId, String location) {
        super(teamId, location);
    }

    @Override
    void performDuty() {
        System.out.println("Medical team " + teamId + " providing medical aid in " + location);
    }
}
