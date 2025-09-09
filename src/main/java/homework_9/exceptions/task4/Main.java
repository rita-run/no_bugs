package homework_9.exceptions.task4;

public class Main {
    public static void main(String[] args) {
        //4. Создание и использование собственного непроверяемого исключения
        //Условие задачи: Напишите функцию, которая принимает строку в качестве аргумента и проверяет,
        // является ли строка правильным электронным адресом. Если строка не удовлетворяет критериям,
        // функция должна выбрасывать непроверяемое исключение.

        EmailChecker emailChecker = new EmailChecker();

        String[] testEmails = {"email@email.com", "email@emailcom", "emailemail.com", "emailemailcom"};

        for (String email : testEmails) {
            emailChecker.setEmail(email);
            try {
                emailChecker.checkEmail();
            } catch (InvalidEmailException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
