package workbook.stream_api.users;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        User harry = new User("Harry", "potter@gmail.com");
        User ron = new User("Ron", "ron@gmail.com");

        List<User> users = new ArrayList<>();
        users.add(harry);
        users.add(ron);

        List<String> emails = users.stream()
                .map(User::getEmail)
                .toList();

        System.out.println(emails);
    }
}