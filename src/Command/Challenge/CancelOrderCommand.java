package Command.Challenge;

public class CancelOrderCommand implements Command {

    private OrderSystem orderSystem;

    public CancelOrderCommand(OrderSystem orderSystem) {
        this.orderSystem = orderSystem;
    }

    @Override
    public void execute() {
        orderSystem.cancelOrder();
    }
}
