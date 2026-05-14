package Strategy.Challenge;

public class CreditCardPayment implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("Thanh toán bằng thẻ: " + amount);
    }
}
