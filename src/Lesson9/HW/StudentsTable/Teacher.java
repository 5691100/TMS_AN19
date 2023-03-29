package Lesson9.HW.StudentsTable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Teacher extends Person {
    List<Discipline> specialization = new ArrayList<>();

    public Teacher(String name) {
        super(name);
    }

    public void setSpecialization (Discipline... discipline) {
        specialization.addAll(Arrays.asList(discipline));
    }
}


