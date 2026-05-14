package TemplateMethod.Pizza;

public class SeafoodPizza extends PizzaTemplate {

    @Override
    protected void addToppings() {
        System.out.println("Thêm hải sản");
    }
}
