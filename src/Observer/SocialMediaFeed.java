package Observer;

import java.util.ArrayList;
import java.util.List;

public class SocialMediaFeed implements Observer {

    private List<String> feed = new ArrayList<>();

    @Override
    public void update(String status) {
        feed.add(status);
        System.out.println("Feed updated: " + status);
    }

    public void showFeed() {
        System.out.println(feed);
    }
}