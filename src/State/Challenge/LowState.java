package State.Challenge;

public class LowState implements FanState {

    @Override
    public void increase(Fan fan) {
        System.out.println("Quạt chuyển sang MEDIUM");
        fan.setState(new MediumState());
    }

    @Override
    public void decrease(Fan fan) {
        System.out.println("Quạt chuyển sang OFF");
        fan.setState(new OffState());
    }
}
