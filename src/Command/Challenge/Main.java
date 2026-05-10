package Command.Challenge;

public class Main {

    public static void main(String[] args) {

        OrderSystem orderSystem = new OrderSystem();

        Command createCmd =
                new CreateOrderCommand(orderSystem);

        Command cancelCmd =
                new CancelOrderCommand(orderSystem);

        Button createButton = new Button(createCmd);
        Button cancelButton = new Button(cancelCmd);

        createButton.click();
        cancelButton.click();
    }
}
