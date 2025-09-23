package complex_tasks.task1.example;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

public class EntityManger<T extends Entity> {
    //we create a class EntityManager, that will manage our collections of elements
    //later we will be able to create several collections of different types (Entity or its children)
    //and we'll be able to manage these collections using this manager
    private CopyOnWriteArrayList<T> entities = new CopyOnWriteArrayList<>();

    //here we are creating a method that will take an object of type T (Entity or its children) as an argument
    public void add(T entity) {
        entities.add(entity);
    }

    public boolean remove(T entity) {
        return entities.remove(entity);
    }

    public List<T> getAll() {
        return List.copyOf(entities);
    }

    public List<T> filterByAge(int min, int max) {
        return entities.stream().filter(entity -> entity.getAge() >= min && entity.getAge() <= max)
                .collect(Collectors.toList());
    }

    public List<T> filterByName(String string) {
        return entities.stream().filter(entity -> entity.getName().contains(string))
                .collect(Collectors.toList());
    }

    public List<T> filterByActive(boolean isActive) {
        return entities.stream().filter((entity -> entity.isActive()))
                .collect(Collectors.toList());
    }
}