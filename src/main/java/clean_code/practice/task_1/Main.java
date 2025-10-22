package clean_code.task_1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("Harry", "harry_potter@gmail.com"));
        users.add(new User("Ron", "ron_wisley@gmail.com"));

        UserRepository userRepository = new UserRepository(users);
        TaskRepository taskRepository = new TaskRepository();

        Project project = new Project(userRepository, taskRepository);

        project.addTask(new Task("Clean floor", "please do", new Date()));
        project.assignTaskToUser("Clean floor", "Harry");
        project.completeTask("Clean floor");
    }
}