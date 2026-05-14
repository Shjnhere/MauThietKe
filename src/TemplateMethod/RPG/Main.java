package TemplateMethod.RPG;

public class Main {
    public static void main(String[] args) {

        CharacterTemplate warrior = new Warrior();

        System.out.println("=== Warrior ===");
        warrior.playTurn();

        System.out.println();

        CharacterTemplate mage = new Mage();

        System.out.println("=== Mage ===");
        mage.playTurn();

        System.out.println();

        CharacterTemplate archer = new Archer();

        System.out.println("=== Archer ===");
        archer.playTurn();
    }
}
