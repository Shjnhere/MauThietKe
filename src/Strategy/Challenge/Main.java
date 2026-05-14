package Strategy.Challenge;

public class Main {
    public static void main(String[] args) {

        PaymentProcessor processor = new PaymentProcessor();

        processor.setStrategy(new CashPayment());
        processor.processPayment(100);

        processor.setStrategy(new CreditCardPayment());
        processor.processPayment(200);

        processor.setStrategy(new EWalletPayment());
        processor.processPayment(300);
    }
}
