package Lesson9.HW.StudentsTable;

public class Lesson {
    Group group;
    Discipline discipline;
    Teacher teacher;

    public Lesson(Group group, Discipline discipline, Teacher teacher) {
        this.group = group;
        this.discipline = discipline;
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "group=" + group +
                ", discipline=" + discipline +
                ", teacher=" + teacher +
                '}';
    }
}
