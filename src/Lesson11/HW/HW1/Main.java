package Lesson11.HW.HW1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("John", 6f));
        students.add(new Student("Bill", 7f));
        students.add(new Student("Peter", 9f));
        students.add(new Student("Vera", 10f));
        students.add(new Student("Bob", 4f));
        students.add(new Student("Jack", 9f));
        students.add(new Student("Jim", 10f));

        for (int i =0; i< students.size(); i++)
        {
            if (students.get(i).getMark()>8)
            {
                System.out.println(students.get(i));
            }
        }
    }
}
