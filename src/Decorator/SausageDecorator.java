package Decorator;

public class SausageDecorator extends PizzaDecorator {

    public SausageDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription() + " + Sausage";
    }

    @Override
    public double getCost() {
        return decoratedPizza.getCost() + 3.0;
    }
}