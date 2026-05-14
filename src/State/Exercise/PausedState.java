package State.Exercise;

public class PausedState implements State {

    @Override
    public void play(MediaPlayer player) {
        System.out.println("Tiếp tục phát nhạc");
        player.setState(new PlayingState());
        player.setIcon("PLAY");
    }

    @Override
    public void pause(MediaPlayer player) {
        System.out.println("Đã tạm dừng rồi!");
    }
}