package Lesson9.HW.StudentsTable;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class University {
    List<Table> tables = new ArrayList<>();
    List<Student> allStudents = new ArrayList<>();
    List<Teacher> teachers = new ArrayList<>();
    List<Discipline> disciplines = new ArrayList<>();

    public University() {
    }

    public void setStudentsToUniversity(Student... student) {
        allStudents.addAll(Arrays.asList(student));
    }

    public void setTables(Table... table) {
        tables.addAll(Arrays.asList(table));
    }

    public void setTeachers(Teacher... teacher) {
        teachers.addAll(Arrays.asList(teacher));
    }

    public void setDisciplines(Discipline... discipline) {
        disciplines.addAll(Arrays.asList(discipline));
    }

    public List<Discipline> getTimeTable(String studentName, LocalDate date) {
        List<Discipline> timeTable = new ArrayList<>();
        String currentGroup = null;
        for (Student student : allStudents) {
            if (student.getName().equals(studentName)) {
                currentGroup = student.getGroupNumber();
            }
        }
        for (Table table : tables) {
            if (table.date.equals(date)) {
                if (table.lesson.group.getGroupNumber().equals(currentGroup)) {
                    timeTable.add(table.lesson.discipline);
                }
            }
        }
        return timeTable;
    }

    @Override
    public String toString() {
        return "University{" +
                "tables=" + tables +
                ", allStudents=" + allStudents +
                ", teachers=" + teachers +
                ", disciplines=" + disciplines +
                '}';
    }
}
