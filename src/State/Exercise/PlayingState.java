package State.Exercise;

public class PlayingState implements State {

    @Override
    public void play(MediaPlayer player) {
        System.out.println("Đã đang phát nhạc!");
    }

    @Override
    public void pause(MediaPlayer player) {
        System.out.println("Tạm dừng nhạc");
        player.setState(new PausedState());
        player.setIcon("PAUSE");
    }
}