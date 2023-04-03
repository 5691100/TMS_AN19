package Lesson13.CL;

import Lesson11.Example.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main1 {
    public static void main(String[] args) {
        List<Student> students = initCollection();
//        Stream<Student> studentStream = students.stream();
//        System.out.println(studentStream.count());


        long number = students.stream()
                .filter(student -> {
                    System.out.println("Filter1: " + student.getName());
                    return student.getMark() > 6f;
                })
                .filter(student -> {
                    System.out.println("Filter2: " + student.getName());
                    return student.getMark() > 7f;
                })
                .filter(student -> {
                    System.out.println("Filter3: " + student.getName());
                    return student.getMark() > 8f;
                })
                .count();
//                .filter(student -> student.getMark()>5f)
//                .count();
        System.out.println(number);


    }
    public static List<Student> initCollection() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Slava", "01", 8f));
        students.add(new Student("Roman", "02", 7f));
        students.add(new Student("Angelina", "01", 5f));
        students.add(new Student("Ivan", "02", 7f));
        students.add(new Student("Sasha", "02", 4f));
        students.add(new Student("Dmitry", "03", 9f));
        return students;

    }
}
