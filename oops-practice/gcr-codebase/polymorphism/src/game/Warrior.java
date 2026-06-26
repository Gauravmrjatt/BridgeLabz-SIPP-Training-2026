package game;

class Warrior extends GameCharacter {
    Warrior(String characterName) {
        super(characterName);
    }

    @Override
    void performAttack() {
        System.out.println(characterName + " attacks with sword!");
    }
}
