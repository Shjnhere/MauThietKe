package TemplateMethod.Pizza;

public class Main {
    public static void main(String[] args) {

        PizzaTemplate cheese = new CheesePizza();

        System.out.println("=== Cheese Pizza ===");
        cheese.makePizza();

        System.out.println();

        PizzaTemplate seafood = new SeafoodPizza();

        System.out.println("=== Seafood Pizza ===");
        seafood.makePizza();
    }
}
