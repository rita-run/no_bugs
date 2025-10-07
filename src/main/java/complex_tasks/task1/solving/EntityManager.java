package complex_tasks.task1.solving;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

public class EntityManager<T extends User> {
    /*
    Task:
    Разработайте класс EntityManager<T>, который будет управлять коллекцией объектов произвольного типа T,
    обеспечивая потокобезопасное добавление, удаление и получение элементов.
    Класс также должен предоставлять специфические методы фильтрации данных,
    которые позволяют пользователю извлекать элементы по определённым критериям.

    Main points to consider:
    - entity manager (adds, deletes, gets, filters elements)
    - collection of elements of type T ---> means we'll have several collection of different types (in our case -
    users of different types), that we'll manage via the Manger. E.g. Ordinary Users and Subscription Users or whatever
    - manager have collections of Users, that it can add users to, depending on the type of user
    - collection should be easy to add an element, delete, get and filter AND be thread safe --> CopyOnWriteArrayList

    Possible classes:
    1) EntityManager<T>
    2) User (parent class)
    3) Ordinary user (subclass of User)
    4) Subscription Users (subclass of User)

    Properties of User:
    - age (private)
    - name (private)
    - current activity (private)
    Methods of User:
    - getters and setters?

    Properties of EntityManager:
    - collection of users (CopyOnWriteArrayList)

    Methods of EntityManager<T>:
    - add a user
    - delete user
    - get user
    - filters
        - by age range
        - by name
        - by activity
     */

    private CopyOnWriteArrayList<T> users;

    public EntityManager() {
        this.users = new CopyOnWriteArrayList<>();
    }

    public void addUser(T user) {
        users.add(user);
    }

    public List<T> getAllUsers() {
        return new ArrayList<T>(users);
    }

    public boolean deleteUser(T user) {
        return users.remove(user);
    }

    public List<T> filterByAge(int min, int max) {
        return users.stream().filter(user -> user.getAge() >= min && user.getAge() <= max)
                .collect(Collectors.toList());
    }

    public List<T> filterByName(String string) {
        return users.stream().filter(user -> user.getName().contains(string))
                .collect(Collectors.toList());
    }

    public List<T> filterByActivity(boolean isActive) {
        return users.stream().filter(user -> user.isActive() == isActive)
                .collect(Collectors.toList());
    }
}