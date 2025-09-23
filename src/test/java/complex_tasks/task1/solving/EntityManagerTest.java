package complex_tasks.task1.solving;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EntityManagerTest {
    private EntityManager<User> manager;
    private User harry;
    private User lilly;
    private User ron;
    private User hermione;

    @BeforeEach
    public void setUpTest() {
        manager = new EntityManager<>();
        harry = new User("Harry Potter", 18, true);
        lilly = new User("Lilly Potter", 25, true);
        ron = new User("Ron Wisely", 19, false);
        hermione = new User("Hermione Granger", 17, false);
        manager.addUser(harry);
        manager.addUser(lilly);
        manager.addUser(ron);
        manager.addUser(hermione);
    }

    @Test
    public void managerCanAddUser() {
        //0. define test data: HP - a user with the fields: name: Harry Potter, age: 18, isActive: true
        //1. we need to define an expected result -> name of 1st user = HarryPotter
        //2. we need to get the actual one -> add user Harry, get the name of the 1st user
        //3. we need to compare it
        assertEquals("Harry Potter", manager.getAllUsers().getFirst().getName());
    }

    @Test
    public void managerCanDeleteUser() {
        assertTrue(manager.deleteUser(ron));
    }

    @Test
    public void managerCanFilterByAge() {
        List<User> expectedFilteredByAge = List.of(harry, ron);
        List<User> actualFilteredByAge = manager.filterByAge(18, 19);
        assertEquals(expectedFilteredByAge, actualFilteredByAge);
    }

    @Test
    public void managerCanFilterByName() {
        List<User> expectedFilteredByName = List.of(harry, lilly);
        List<User> actualFilteredByName = manager.filterByName("Potter");
        assertEquals(expectedFilteredByName, actualFilteredByName);
    }

    @Test
    public void managerCanFilterByActivity() {
        List<User> expectedFilteredByActivity = List.of(harry, lilly);
        List<User> actualFilteredByActivity = manager.filterByActivity(true);
        assertEquals(expectedFilteredByActivity, actualFilteredByActivity);
    }
}