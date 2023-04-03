package Lesson13.CL;

import Lesson11.Example.Student;

import java.util.List;
import java.util.Optional;

public class Main2 {
    public static void main(String[] args) {
        List<Student> students = Main1.initCollection();
        Optional<Float> sum = students.stream()
                .map(student -> student.getMark())
                .reduce((mark1,mark2) -> mark1+mark2);

        System.out.println(sum.get());

    }
}
