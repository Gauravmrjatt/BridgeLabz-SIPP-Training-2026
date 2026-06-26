package game;

public class GameDemo {
    public static void main(String[] args) {
        GameCharacter[] party = {
            new Warrior("Arthur"),
            new Mage("Merlin"),
            new Archer("Elena"),
            new Warrior("Gorim"),
            new Mage("Saruman"),
            new Archer("Legolas"),
            new Warrior("Siegfried")
        };

        System.out.println("=== Battle Started ===");
        startBattle(party);
        System.out.println("\n=== Battle Statistics ===");

        int warriorCount = 0, mageCount = 0, archerCount = 0;
        for (GameCharacter c : party) {
            if (c instanceof Warrior) warriorCount++;
            else if (c instanceof Mage) mageCount++;
            else if (c instanceof Archer) archerCount++;
        }

        System.out.println("Warriors: " + warriorCount);
        System.out.println("Mages: " + mageCount);
        System.out.println("Archers: " + archerCount);
    }

    static void startBattle(GameCharacter[] characters) {
        for (GameCharacter c : characters) {
            c.performAttack();
        }
    }
}
