package homework_3;

public class Person {
    private String firstName;
    private String lastName;
    private final String ssn;

    Person(String personFirstName, String personLastName, String personSsn) {
        this.firstName = personFirstName;
        this.lastName = personLastName;
        this.ssn = personSsn;
    }

    String getFirstName() {
        return this.firstName;
    }


    String getLastName() {
        return this.lastName;

    }
    String getSsn() {
        return this.ssn;
    }

    void setFirstName(String newFirstName) {
        this.firstName = newFirstName;
    }

    void setLastName(String newLastName) {
        this.lastName = newLastName;

    }

    void printPersonInfo() {
        System.out.println("Имя: " + this.firstName + ", Фамилия: " + this.lastName + ", SSN: " + this.ssn);
    }
}
