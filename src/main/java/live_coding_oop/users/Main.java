package live_coding_oop.users;

public class Main {
    public static void main(String[] args) {
        UserManager manager = new UserManager();
        User harry = new User("Harry Potter", "harry@gmail.com");
        User cho = new User("Cho Chang", "cho@gmail.com");
        User luna = new User("Luna Lovegood", "luna@gmail.com");

        manager.addUser(harry);
        manager.addUser(cho);

        System.out.println(manager.findByEmail(cho));
        System.out.println(manager.findByEmail(luna));
    }
}