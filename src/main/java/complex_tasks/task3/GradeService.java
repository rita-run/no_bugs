package complex_tasks.task3;

import java.util.ArrayList;
import java.util.List;

public class GradeService <T extends StudentGrade<?>> {
    private final List<T> gradesList = new ArrayList<>();

    public synchronized void addGrade(T grade) {
        if (grade.getGrade().doubleValue() >= 0) {
            gradesList.add(grade);
        } else throw new InvalidGradeException("Invalid grade!");
    }

    public List<T> returnAllGrades() {
        return List.copyOf(gradesList);
    }

    //Метод для расчёта среднего значения оценок по конкретному предмету.
    public double calculateMeanGradeOfSubject(String subject) {
        double meanGrade = gradesList.stream()
                .filter(grade -> grade.getSubject().equals(subject))
                .mapToDouble(grade -> grade.getGrade().doubleValue())
                .average()
                .orElse(0.0);
        return meanGrade;
    }
}