package TemplateMethod.RPG;

public class Archer extends CharacterTemplate {

    @Override
    protected void attack() {
        System.out.println("Archer bắn tên");
    }

    @Override
    protected void useSkill() {
        System.out.println("Archer dùng Multi Shot");
    }
}
