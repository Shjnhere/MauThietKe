package State.Challenge;

public class HighState implements FanState {

    @Override
    public void increase(Fan fan) {
        System.out.println("Quạt đã ở mức HIGH");
    }

    @Override
    public void decrease(Fan fan) {
        System.out.println("Quạt chuyển sang MEDIUM");
        fan.setState(new MediumState());
    }
}
