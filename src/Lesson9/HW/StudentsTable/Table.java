package Lesson9.HW.StudentsTable;

import java.time.LocalDate;

public class Table {
    LocalDate date;
    Lesson lesson;

    public Table() {
    }

    public Table(LocalDate date, Lesson lesson) {
        this.date = date;
        this.lesson = lesson;
    }

    @Override
    public String toString() {
        return "Table{" +
                "date=" + date +
                ", lesson=" + lesson +
                '}';
    }
}
