package pl.sda;

import pl.sda.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserService {

    private static final List<User> users = new ArrayList<User>();

    static {
        users.add(new User("admin", "admin"));
        users.add(new User("user", "user"));
    }


    public Optional<User> getUserByLogin(String login) {
        return users.stream().filter(user -> user.getLogin().equals(login)).findFirst();
    }

    public boolean IfUserExist(String login, String password) {
        for (int i = 0; i<users.size();i++) {
            if (users.get(i).getLogin().equals(login) && users.get(i).getPassword().equals(password))
                return true;
        }
        return false;
    }

    public void createUser(String login, String password) {
        users.add(new User(login, password));
    }

}
