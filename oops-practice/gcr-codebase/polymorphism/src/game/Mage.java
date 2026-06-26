package game;

class Mage extends GameCharacter {
    Mage(String characterName) {
        super(characterName);
    }

    @Override
    void performAttack() {
        System.out.println(characterName + " casts fireball!");
    }
}
