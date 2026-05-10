package Command.Challenge;

public class CreateOrderCommand implements Command {

    private OrderSystem orderSystem;

    public CreateOrderCommand(OrderSystem orderSystem) {
        this.orderSystem = orderSystem;
    }

    @Override
    public void execute() {
        orderSystem.createOrder();
    }
}
