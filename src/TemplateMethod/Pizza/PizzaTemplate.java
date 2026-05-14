package TemplateMethod.Pizza;

public abstract class PizzaTemplate {
    public final void makePizza() {

        prepareDough();
        addToppings();
        bake();
        cutPizza();
    }

    private void prepareDough() {
        System.out.println("Chuẩn bị bột bánh");
    }

    protected abstract void addToppings();

    private void bake() {
        System.out.println("Nướng pizza");
    }

    private void cutPizza() {
        System.out.println("Cắt pizza");
    }
}
