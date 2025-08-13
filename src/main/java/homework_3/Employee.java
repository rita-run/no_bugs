package homework_3;

public class Employee {
    static String companyName;
    final int employeeID;
    String employeeName;

    Employee(int employeeID, String employeeName) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
    }

    static void printCompanyName() {
        System.out.println(companyName);
    }

    String getEmployeeName() {
        return this.employeeName;
    }

    void setEmployeeName(String newName) {
        this.employeeName = newName;
    }

}
