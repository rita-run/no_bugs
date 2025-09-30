package complex_tasks.task3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GradeServiceTest {
    GradeService<StudentGrade<?>> service;
    StudentGrade<Integer> studentGrade1;
    StudentGrade<Integer> studentGrade2;
    StudentGrade<Integer> studentGrade3;
    StudentGrade<Integer> studentGrade4;


    @BeforeEach
    public void setupTest() {
        service = new GradeService<>();
        studentGrade1 = new StudentGrade<>("Luna Lovegood", "Herbology", 50);
        studentGrade2 = new StudentGrade<>("Neville Longbottom", "Herbology", 100);
        studentGrade3 = new StudentGrade<>("Ginny Weasley", "Defense Against the Dark Arts", 77);
        studentGrade4 = new StudentGrade<>("Ginny Weasley", "Defense Against the Dark Arts", -77);

        service.addGrade(studentGrade1);
        service.addGrade(studentGrade2);
        service.addGrade(studentGrade3);
    }

    //test addGrade method
    @Test
    public void gradeServiceCanAddValidGrade() {
        //1) define the expected result:
        // gradeList has a grade we wanted to add
        //("Luna Lovegood", "Herbology", 99)
        //2) get the actual result
        //3) compare
        assertEquals(50, service.returnAllGrades().getFirst().getGrade());
    }

    @Test
    public void gradeServiceCanNotAddInvalidGrade() {
        assertThrows(InvalidGradeException.class, () -> {
            service.addGrade(studentGrade4);
            }, "Invalid grade!");
    }

    //test calculateMeanGradeOfSubject method
    @Test
    public void gradeServiceCanCalculateMeanGrade() {
        //1) ER: meanGrade: 75
        //2) AR: service.returnMean...
        //3) compare
        assertEquals(75, service.calculateMeanGradeOfSubject("Herbology"));
    }
}