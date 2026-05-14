package State.Challenge;

public class MediumState implements FanState {

    @Override
    public void increase(Fan fan) {
        System.out.println("Quạt chuyển sang HIGH");
        fan.setState(new HighState());
    }

    @Override
    public void decrease(Fan fan) {
        System.out.println("Quạt chuyển sang LOW");
        fan.setState(new LowState());
    }
}