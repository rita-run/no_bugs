package live_coding_oop.users;

import java.util.HashSet;
import java.util.Set;

public class UserManager {
    private Set<User> users = new HashSet<>();

    public void addUser(User user) {
        users.add(user);
    }

    public boolean findByEmail(User user) {
        for (User u : users) {
            if (u.getEmail().equals(user.getEmail())) {
                return true;
            }
        }
        return false;
    }
}