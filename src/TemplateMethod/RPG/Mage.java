package TemplateMethod.RPG;

public class Mage extends CharacterTemplate {

    @Override
    protected void attack() {
        System.out.println("Mage bắn phép");
    }

    @Override
    protected void useSkill() {
        System.out.println("Mage dùng Fireball");
    }
}
