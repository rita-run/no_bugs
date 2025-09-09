package homework_9.exceptions.task4;

public class EmailChecker {
    //4. Создание и использование собственного непроверяемого исключения
    //Условие задачи: Напишите функцию, которая принимает строку в качестве аргумента и проверяет,
    // является ли строка правильным электронным адресом. Если строка не удовлетворяет критериям,
    // функция должна выбрасывать непроверяемое исключение.
    //@ .
    private String email;

    public void setEmail(String email) {
        this.email = email;
    }

    public void checkEmail() {
        //if there is no @ and . - throw an exception
        if(!this.email.contains("@") || !this.email.contains(".")) {
            throw new InvalidEmailException(this.email + ": invalid email! email should have @ and . ");
        } else System.out.println(this.email + ": email is correct");
    }
}
