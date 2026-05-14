package TemplateMethod.RPG;

public class Warrior extends CharacterTemplate {

    @Override
    protected void attack() {
        System.out.println("Warrior chém kiếm");
    }

    @Override
    protected void useSkill() {
        System.out.println("Warrior dùng Rage");
    }
}
