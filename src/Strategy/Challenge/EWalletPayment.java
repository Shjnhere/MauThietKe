package Strategy.Challenge;

public class EWalletPayment implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("Thanh toán ví điện tử: " + amount);
    }
}
