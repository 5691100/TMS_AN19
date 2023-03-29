package Lesson9.HW.StudentsTable;

public class Discipline {
    private String discipline;

    public Discipline(String discipline) {
        this.discipline = discipline;
    }

    public String getDiscipline() {
        return discipline;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    @Override
    public String toString() {
        return "Discipline{" +
                "discipline='" + discipline + '\'' +
                '}';
    }
}
