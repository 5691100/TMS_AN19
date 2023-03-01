package Lesson6;

public class Student {
String name;
int group;
int mark;

    public Student(String name, int group, int mark) {
        this.name = name;
        this.group = group;
        this.mark = mark;
    }

    public Student(String name, int group) {
        this.name = name;
        this.group = group;
    }

    public Student(int mark) {
        this.mark = mark;
    }

    void displayInfo() {
        System.out.println("Name: " + name + " Group: " + group + " Mark: " + mark);
    }
}
