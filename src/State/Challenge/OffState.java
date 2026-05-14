package State.Challenge;

public class OffState implements FanState {

    @Override
    public void increase(Fan fan) {
        System.out.println("Quạt chuyển sang LOW");
        fan.setState(new LowState());
    }

    @Override
    public void decrease(Fan fan) {
        System.out.println("Quạt đang OFF");
    }
}
