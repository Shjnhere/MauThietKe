package State.Exercise;

public class Main {
    public static void main(String[] args) {

        MediaPlayer player = new MediaPlayer();

        player.play();
        System.out.println(player.getIcon());

        player.pause();
        System.out.println(player.getIcon());

        player.pause();

        player.play();
    }
}
