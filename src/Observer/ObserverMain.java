package Observer;

public class ObserverMain {
    public static void main(String[] args) {

        Connection user = new Connection();

        SocialMediaFeed feed1 = new SocialMediaFeed();
        SocialMediaFeed feed2 = new SocialMediaFeed();

        // Đăng ký observer
        user.addObserver(feed1);
        user.addObserver(feed2);

        // Cập nhật trạng thái
        user.setStatus("Hôm nay trời đẹp!");
        user.setStatus("Đang học Observer Pattern");

        feed1.showFeed();
        feed2.showFeed();
    }
}
