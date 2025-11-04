package clean_code.homework.programming_principles.task3;

public class User {
    /*
    Задача: Удалите неиспользуемые поля и оставьте только необходимые данные.
     */
    private String name;
    private String email;
    private String phoneNumber;
    public User(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
}