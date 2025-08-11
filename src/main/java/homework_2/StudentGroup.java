package homework_2;

public class StudentGroup {
    String groupName;
    int studentCount;

    StudentGroup(String groupName, int studentCount) {
        this.groupName = groupName;
        this.studentCount = studentCount;
    }

    String getGroupName() {
        return this.groupName;
    }

    int getStudentCount() {
        return this.studentCount;
    }

    void setGroupName(String newGroupName) {
        this.groupName = newGroupName;
    }


    void setGroupCount(int newStudentCount) {
        this.studentCount = newStudentCount;
    }

    void printInfo() {
        System.out.println("Group name: " + this.groupName + " Number of students: " + this.studentCount);

    }
}
