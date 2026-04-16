package Decorator;

public class Main {
    public static void main(String[] args) {

        Pizza pizza = new BasicPizza();
        System.out.println(pizza.getDescription() + " = $" + pizza.getCost());

        // Thêm cheese
        pizza = new CheeseDecorator(pizza);
        System.out.println(pizza.getDescription() + " = $" + pizza.getCost());

        // Thêm tiếp sausage
        pizza = new SausageDecorator(pizza);
        System.out.println(pizza.getDescription() + " = $" + pizza.getCost());
    }
}
