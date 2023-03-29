package Lesson9.HW.StudentsTable;

public class Student extends Person {
    private String groupNumber;
    public Student(String name) {
        super(name);
    }

    public Student(String name, String groupNumber) {
        super(name);
        this.groupNumber = groupNumber;
    }

    public String getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(String groupNumber) {
        this.groupNumber = groupNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "groupNumber='" + groupNumber + '\'' +
                '}';
    }
}
