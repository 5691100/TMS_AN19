package Lesson9.HW.StudentsTable;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private String groupNumber;
    List<Student> students = new ArrayList<>();

    public Group(String groupNumber) {
        this.groupNumber = groupNumber;
    }

    public String getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(String groupNumber) {
        this.groupNumber = groupNumber;
    }

    public void setStudentToGroup (Student... student) {
        for (Student value : student) {
            value.setGroupNumber(groupNumber);
            students.add(value);
        }
    }

    @Override
    public String toString() {
        return "Group{" +
                "groupNumber='" + groupNumber + '\'' +
                ", students=" + students +
                '}';
    }
}
