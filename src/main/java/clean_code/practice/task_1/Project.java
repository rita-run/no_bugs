package clean_code.task_1;

class Project {
    private UserRepository userRepository;
    private TaskRepository taskRepository;

    public Project(UserRepository userRepository, TaskRepository taskRepository) {
        this.userRepository = userRepository;
        this.taskRepository = taskRepository;
    }

    public void addTask(Task task) {
        taskRepository.addTask(task);
    }

    public void assignTaskToUser(String title, String username) {
        Task task = taskRepository.findTask(title);
        task.setUser(userRepository.findUser(username));
        System.out.println("Task " + title + " was assigned to " + username);
    }

    public void completeTask(String title) {
        Task task = taskRepository.findTask(title);
        task.setCompleted(true);
        System.out.println("Task " + title + " was completed");
    }
}
