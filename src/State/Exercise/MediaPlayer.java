package State.Exercise;

public class MediaPlayer {
    private State state;

    private String icon;

    public MediaPlayer() {
        state = new PausedState();
        icon = "PAUSE";
    }

    public void play() {
        state.play(this);
    }

    public void pause() {
        state.pause(this);
    }

    public void setState(State state) {
        this.state = state;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getIcon() {
        return icon;
    }
}
