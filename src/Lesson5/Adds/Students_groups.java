package Lesson5.Adds;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

// Создать класс Student с полями name, group, mark.
// Создать массив студентов (достаточно просто в коде создать нескольких чтоб можно было тестировать).
// После этого сделать меню в консоли - 1. Вывести на экран самую слабую группу (средняя оценка минимальная)
// 2. Отчислить самого слабого студента с оценкой < 4 (вывести на экран кого отчислили, если несколько
// с одинаковой оценкой - отчислить несколько), 3. Просмотр всех студентов 4. Просмотр группы,
// 5. Выход. Ввод через сканнер, программа не заканчивается после выполнения любого пункта кроме выхода,
// а возвращается назад к меню.

public class Students_groups {
    public static void main(String[] args) {
        Student[] students = new Student[12];
        students[0] = new Student("Tom", "1a", 6);
        students[1] = new Student("Bob", "1b", 7);
        students[2] = new Student("Joe", "1a", 3);
        students[3] = new Student("Jim", "1a", 2);
        students[4] = new Student("Dan", "1b", 4);
        students[5] = new Student("Bill", "1a", 1);
        students[6] = new Student("John", "1b", 3);
        students[7] = new Student("Jill", "1b", 8);
        students[8] = new Student("Ben", "2a", 9);
        students[9] = new Student("Drew", "2a", 9);
        students[10] = new Student("Ed", "2a", 9);
        students[11] = new Student("Greg", "2a", 9);

        int menu = 0;
        Arrays.sort(students, Comparator.comparing((Student::getGroup)));

        while (menu != 5) {

            System.out.println("Choose the option: 1. Weakest group; 2. Expelled students; 3. All students; 4. Group; 5. Exit");
            Scanner sc = new Scanner(System.in);
            menu = sc.nextInt();


            switch (menu) {
                case 1 -> {
                    double weakestGroupScore = Double.MAX_VALUE;
                    String weakestGroupNumber = "";
                    int startIndex = 0;
                    for (int i = 0; i < students.length; i++) {
                        if (((i == students.length - 1) || !students[i].equals(students[i + 1]))) {
                            double groupScore = 0.0;
                            int numberStudents = 0;
                            for (int j = startIndex; j < i + 1; j++) {
                                groupScore += students[j].mark;
                                numberStudents++;
                            }
                            if (groupScore / numberStudents < weakestGroupScore) {
                                weakestGroupNumber = students[i].group;
                                weakestGroupScore = groupScore / numberStudents;
                            }
                            startIndex = i + 1;
                        }
                    }
                    System.out.println("The weakest group is: " + weakestGroupNumber);
                }
                case 2 -> {
                    for (Student student : students) {
                        if (student.mark < 4) {
                            student.group = "Expelled";
                        }
                    }
                    for (Student student : students) {
                        student.displayInfo();
                    }
                }
                case 3 -> {
                    for (Student student : students) {
                        student.displayInfo();
                    }
                }
                case 4 -> {
                    System.out.println("Enter the group number: ");
                    Scanner sc2 = new Scanner(System.in);
                    String group = sc2.nextLine();
                    for (Student student : students) {
                        if (student.equals1(group)) {
                            student.displayInfo();
                        }
                    }
                }
            }
            System.out.println();
        }
    }
}

class Student {
    String name;
    String group;
    int mark;

    Student(String n, String g, int m) {
        name = n;
        group = g;
        mark = m;
    }

    void displayInfo() {
        System.out.printf("Name: %s\tGroup: %s\tMark: %d\n", name, group, mark);
    }

    public String getGroup() {
        return group;
    }

    public boolean equals(Student student) {
        return this.group == student.group;
    }

    public boolean equals1(String group) {
        return this.group == group;
    }

}
