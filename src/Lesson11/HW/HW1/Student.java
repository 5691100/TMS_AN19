package Lesson11.HW.HW1;

public class Student {
    private String nameStudent;
    private Float mark;

    public Student(String nameStudent, Float mark) {
        this.nameStudent = nameStudent;
        this.mark = mark;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public void setMark(Float mark) {
        this.mark = mark;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public Float getMark() {
        return mark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nameStudent='" + nameStudent + '\'' +
                ", mark=" + mark +
                '}';
    }
}
