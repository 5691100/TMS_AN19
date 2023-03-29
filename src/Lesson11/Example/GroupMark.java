package Lesson11.Example;

public class GroupMark {
    private  String group;
    private int studentsAmount;
    private float mark;

    public GroupMark(String group, int studentsAmount, float mark) {
        this.group = group;
        this.studentsAmount = studentsAmount;
        this.mark = mark;
    }

    public GroupMark() {
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setStudentsAmount(int studentsAmount) {
        this.studentsAmount = studentsAmount;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }

    public String getGroup() {
        return group;
    }

    public int getStudentsAmount() {
        return studentsAmount;
    }

    public float getMark() {
        return mark;
    }

    @Override
    public String toString() {
        return "GroupMark{" +
                "group='" + group + '\'' +
                ", studentsAmount=" + studentsAmount +
                ", mark=" + mark +
                '}';
    }
}
