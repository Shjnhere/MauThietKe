package Strategy.Challenge;

public class PaymentProcessor {
    private PaymentStrategy strategy;

    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void processPayment(double amount) {

        if(strategy == null) {
            System.out.println("Chưa chọn phương thức thanh toán!");
            return;
        }

        strategy.pay(amount);
    }
}
