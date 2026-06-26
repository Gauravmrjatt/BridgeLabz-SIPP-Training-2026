package rescue;

public class RescueDemo {
    public static void main(String[] args) {
        RescueTeam[] teams = {
            new MedicalTeam("MED01", "Zone A"),
            new FireRescueTeam("FIR01", "Zone B"),
            new FoodSupplyTeam("FOO01", "Zone A"),
            new MedicalTeam("MED02", "Zone C"),
            new FireRescueTeam("FIR02", "Zone A"),
            new FoodSupplyTeam("FOO02", "Zone B"),
            new MedicalTeam("MED03", "Zone B"),
            new FireRescueTeam("FIR03", "Zone C")
        };

        System.out.println("=== Performing Duties ===");
        performAllDuties(teams);

        System.out.println("\n=== Teams in Zone A ===");
        RescueTeam[] zoneATeams = findTeamByLocation(teams, "Zone A");
        for (RescueTeam t : zoneATeams) {
            System.out.println("  " + t.teamId + " (" + t.getClass().getSimpleName() + ")");
        }

        System.out.println("\n=== Teams with prefix 'MED' ===");
        displayTeamsByPrefix(teams, "MED");

        System.out.println("\n=== Team Deployment Count ===");
        int medical = 0, fire = 0, food = 0;
        for (RescueTeam t : teams) {
            if (t instanceof MedicalTeam) medical++;
            else if (t instanceof FireRescueTeam) fire++;
            else if (t instanceof FoodSupplyTeam) food++;
        }
        System.out.println("Medical: " + medical + ", Fire: " + fire + ", Food: " + food);

        String maxCategory = "Medical";
        int maxCount = medical;
        if (fire > maxCount) {
            maxCount = fire;
            maxCategory = "FireRescue";
        }
        if (food > maxCount) {
            maxCount = food;
            maxCategory = "FoodSupply";
        }
        System.out.println("Category with max deployments: " + maxCategory + " (" + maxCount + ")");
    }

    static void performAllDuties(RescueTeam[] teams) {
        for (RescueTeam t : teams) {
            t.performDuty();
        }
    }

    static RescueTeam[] findTeamByLocation(RescueTeam[] teams, String location) {
        int count = 0;
        for (RescueTeam t : teams) {
            if (t.location.equals(location)) count++;
        }
        RescueTeam[] result = new RescueTeam[count];
        int idx = 0;
        for (RescueTeam t : teams) {
            if (t.location.equals(location)) {
                result[idx++] = t;
            }
        }
        return result;
    }

    static void displayTeamsByPrefix(RescueTeam[] teams, String prefix) {
        for (RescueTeam t : teams) {
            if (t.teamId.startsWith(prefix)) {
                System.out.println("  " + t.teamId + " - " + t.getClass().getSimpleName());
            }
        }
    }
}
