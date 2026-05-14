package State.Challenge;

public class Fan {

    private FanState state;

    public Fan() {
        state = new OffState();
    }

    public void increase() {
        state.increase(this);
    }

    public void decrease() {
        state.decrease(this);
    }

    public void setState(FanState state) {
        this.state = state;
    }
}