package Lesson11.Example.Class1;

public class Student {
    private String name;
    private String group;
    private float mark;

    public Student() {
    }

    public Student(String name, String group, float mark) {
        this.name = name;
        this.group = group;
        this.mark = mark;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public float getMark() {
        return mark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", mark=" + mark +
                '}';
    }
}
