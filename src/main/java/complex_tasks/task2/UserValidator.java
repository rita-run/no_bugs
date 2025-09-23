package complex_tasks.task2;

public class UserValidator {
    /*
    Entities:
    - Validator:
    properties:
    - ??
    methods (throw InvalidUserException):
    - check name
    - check age
    - check email

    - User
    properties:
    - name
    - age
    - email
    methods:
    getters

    - global flag validationEnabled
        - if the flag is true --> can check the User
        - if the flag is false --> user can not be checked
     */

    private boolean validationEnabledFlag;

    public void setValidationEnabled(boolean validationEnabledValue) {
        this.validationEnabledFlag = validationEnabledValue;
    }

    public boolean isValidationEnabled() {
        return validationEnabledFlag;
    }

    //Проверка имени: Имя должно быть не пустым и начинаться с заглавной буквы.
    public boolean checkName(User user) {
        if (isValidationEnabled()) {
            if (user.getName() != null && user.getName().matches("^[A-Z].*$")) {
                System.out.println("Name is valid");
                return true;
            } else {
                throw new InvalidUserException("Invalid user!");
            }
        } else {
            System.out.println("Validation is disabled!");
            return false;
        }
    }

    //Проверка возраста: Возраст должен быть в пределах от 18 до 100 лет.
    public boolean checkAge(User user) {
        if (isValidationEnabled()) {
            if (user.getAge() >= 18 || user.getAge() <= 100) {
                System.out.println("Age is valid");
                return true;
            } else {
                throw new InvalidUserException("Invalid user!");
            }
        } else {
            System.out.println("Validation is disabled!");
            return false;
        }
    }

    //    Проверка email: Email должен соответствовать стандартному формату электронной почты.
    public boolean checkEmail(User user) {
        //1) should have @ & .
        //2) should consist of letters and numbers only
        if (isValidationEnabled()) {
            if (user.getEmail().matches("^[a-zA-Z0-9]+@[a-zA-Z0-9.]+$")) {
                System.out.println("Email is valid");
                return true;
            } else {
                throw new InvalidUserException("Invalid user!");
            }
        } else {
            System.out.println("Validation is disabled!");
            return false;
        }
    }
}