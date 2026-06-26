package game;

class Archer extends GameCharacter {
    Archer(String characterName) {
        super(characterName);
    }

    @Override
    void performAttack() {
        System.out.println(characterName + " shoots an arrow!");
    }
}
