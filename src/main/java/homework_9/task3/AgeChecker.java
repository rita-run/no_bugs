package homework_9.task3;

public class AgeChecker {
    //3. Создание и использование собственного проверяемого исключения
    //Условие задачи: Разработайте метод,
    // который проверяет валидность возраста пользователя.
    // Если возраст меньше 0 или больше 150,
    // метод должен выбрасывать проверяемое исключение.
    //age = 0;
    //checkAge(0) --> "the age is valid!"
    //0-150 - valid
    //0> invalid
    //150< invalid
    //boundaries: -1 0 1 145 150 151
    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public void checkAge() throws InvalidAgeException {
        if (this.age < 0 || this.age > 150) {
            throw new InvalidAgeException(this.age + ": invalid age! Age should be in range from 0 to 150!");
        } else System.out.println(this.age + ": valid age");
    }


}
