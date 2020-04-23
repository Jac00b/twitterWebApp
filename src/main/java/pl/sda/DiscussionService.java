package pl.sda;

import pl.sda.model.Discussion;
import pl.sda.model.User;

import java.util.ArrayList;
import java.util.List;

public class DiscussionService {

    UserService userService = new UserService();

    private static final List<Discussion> twitts = new ArrayList<>();


    static {
        twitts.add(new Discussion("admin","Owoce", "Owoce są bardzo zdrowe"));
        twitts.add(new Discussion("admin","Warzywa", "Warzywa są bardzo zdrowe"));
    }

    public static List<Discussion> getTwiits() {
        return twitts;
    }

    public void createTwiit(String login, String title, String text) {
        twitts.add(new Discussion(login, title, text));
    }


}
