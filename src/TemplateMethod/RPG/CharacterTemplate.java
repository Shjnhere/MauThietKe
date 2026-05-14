package TemplateMethod.RPG;

public abstract class CharacterTemplate {
    public final void playTurn() {

        spawn();
        attack();
        useSkill();
        endTurn();
    }

    private void spawn() {
        System.out.println("Nhân vật xuất hiện");
    }

    protected abstract void attack();

    protected abstract void useSkill();

    private void endTurn() {
        System.out.println("Kết thúc lượt");
    }
}
