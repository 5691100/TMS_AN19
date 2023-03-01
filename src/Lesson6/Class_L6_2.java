package Lesson6;

public class Class_L6_2 {
    public static void main(String[] args) {
        Student[] students  = new Student[14];
        for (int i=0; i<14; i++) {
            students[i] = new Student("Name_"+(i+1),1, (int) (Math.random() * 10));
            students[i].displayInfo();
        }
    }
}
