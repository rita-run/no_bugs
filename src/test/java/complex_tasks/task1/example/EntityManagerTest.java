package complex_tasks.task1.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EntityManagerTest {
    /*
    Test cases:
    adding elements
    add 1 element to an empty manager / 0 -> 1
    add 1 element to an NOT empty manager / 2 -> 3
    add 1 el by several threads (integration check)
     */
    @Test
    public void addEntityTest() {
        EntityManger<Student> manger = new EntityManger<>();

        int initialSize = manger.getAll().size();

        Student expectedStudent = new Student("Nick", 17, true);
        Student expectedStudentNewObject = new Student("Nick", 17, true);

        manger.add(expectedStudent);

//      add element
//      expected result: it is on the final list
//      expected: the item we passed equals the item added
//      expected: added 1 element

        assertTrue(manger.getAll().contains(expectedStudent));

        Student actualStudent = manger.getAll().getFirst();
        assertEquals(expectedStudentNewObject, actualStudent);
        assertEquals(initialSize +1, manger.getAll().size());
//        assertEquals("Nick", manger.getAll().getFirst().getName());
    }
}