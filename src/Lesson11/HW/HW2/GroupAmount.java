package Lesson11.HW.HW2;

public class GroupAmount {
    private String group;
    private int studentAmount;

    public GroupAmount() {
    }

    public GroupAmount(String group, int studentAmount) {
        this.group = group;
        this.studentAmount = studentAmount;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getStudentAmount() {
        return studentAmount;
    }

    public void setStudentAmount(int studentAmount) {
        this.studentAmount = studentAmount;
    }

    @Override
    public String toString() {
        return "GroupAmount{" +
                "group='" + group + '\'' +
                ", studentAmount=" + studentAmount +
                '}';
    }
}
