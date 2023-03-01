package Lesson6;

import Lesson6.Student;

public class Class_L6_3 {
    public static void main(String[] args) {
        Student[] students = new Student[14];
        for (int i = 0; i < 14; i++) {
            students[i] = new Student("Name_" + (i + 1), 1, (int) (Math.random() * 10));
            if (students[i].mark > 8) {
                students[i].displayInfo();
            }
        }
    }
}




