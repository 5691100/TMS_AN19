package Lesson9.HW.StudentsTable;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        Discipline math = new Discipline("Math");
        Discipline chemistry = new Discipline("Chemistry");
        Discipline finance = new Discipline("Finance");
        Discipline accounting = new Discipline("Accounting");
        Discipline geometry = new Discipline("Geometry");
        Discipline management = new Discipline("Management");
        Discipline strategy = new Discipline("Strategy");
        Discipline law = new Discipline("Law");

        Teacher teacher1 = new Teacher("Tom Hanks");
        Teacher teacher2 = new Teacher("Sean Connery");
        Teacher teacher3 = new Teacher("Harrison Ford");
        Teacher teacher4 = new Teacher("Anthony Hopkins");
        Teacher teacher5 = new Teacher("Bryan Cranston");

        teacher1.setSpecialization(math,geometry);
        teacher2.setSpecialization(finance,accounting);
        teacher3.setSpecialization(management,strategy);
        teacher4.setSpecialization(law);
        teacher5.setSpecialization(chemistry);

        Student student1 = new Student("Bob");
        Student student2 = new Student("Rob");
        Student student3 = new Student("John");
        Student student4 = new Student("Jack");
        Student student5 = new Student("Bill");
        Student student6 = new Student("Ben");
        Student student7 = new Student("Jim");
        Student student8 = new Student("Fill");
        Student student9 = new Student("Pit");
        Student student10 = new Student("Tim");
        Student student11 = new Student("Tom");

        Group group1 = new Group("1a");
        Group group2 = new Group("2a");
        Group group3 = new Group("3a");

        group1.setStudentToGroup(student1,student2,student3,student4);
        group2.setStudentToGroup(student5,student6,student7,student8);
        group3.setStudentToGroup(student9,student10,student11);

        Lesson math1a = new Lesson(group1,math,teacher1);
        Lesson math2a = new Lesson(group2,math,teacher1);
        Lesson math3a = new Lesson(group3,math,teacher1);
        Lesson chem1a = new Lesson(group1,chemistry,teacher5);

        LocalDate date1 = LocalDate.of(2023, Month.MARCH, 21);
        LocalDate date2 = LocalDate.of(2023, Month.MARCH, 22);
        LocalDate date3 = LocalDate.of(2023, Month.MARCH, 23);
        LocalDate date4 = LocalDate.of(2023, Month.MARCH, 24);
        LocalDate date5 = LocalDate.of(2023, Month.MARCH, 25);

        Table math1aDate1 = new Table(date1,math1a);
        Table math2aDate1 = new Table(date1,math2a);
        Table math3aDate1 = new Table(date1,math3a);
        Table chem1aDate1 = new Table(date1,chem1a);

        University university = new University();
        university.setDisciplines(math,chemistry,management,strategy,finance,accounting,law,geometry);
        university.setStudentsToUniversity(student1,student2,student3,student4,student5,student6,student7,student8,student9,student10,student11);
        university.setTeachers(teacher1,teacher2,teacher3,teacher4,teacher5);
        university.setTables(math1aDate1,math2aDate1,math3aDate1,chem1aDate1);


        System.out.println(university.getTimeTable("Bob",date1));









    }
}
