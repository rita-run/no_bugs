package homework_9.exceptions.task3;

public class Main {
    public static void main(String[] args) {
        //3. Создание и использование собственного проверяемого исключения
        //Условие задачи: Разработайте метод,
        // который проверяет валидность возраста пользователя.
        // Если возраст меньше 0 или больше 150,
        // метод должен выбрасывать проверяемое исключение.

        AgeChecker ageChecker = new AgeChecker();

        int[] testAges = {0, 1, 145, 150, -1, 151};

        for (int age : testAges) {
            ageChecker.setAge(age);
            try {
                ageChecker.checkAge();
             } catch (InvalidAgeException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }



    }
}
