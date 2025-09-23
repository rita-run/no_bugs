package complex_tasks.task1.solving;

public class User {
    /* Properties of User:
            - age (private)
    - name (private)
    - current activity (private)
    Methods of User:
            - getters and setters?
     */

    private String name;
    private int age;
    private boolean isActive;

    public User(String name, int age, boolean isActive) {
        this.name = name;
        this.age = age;
        this.isActive = isActive;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isActive() {
        return isActive;
    }
}