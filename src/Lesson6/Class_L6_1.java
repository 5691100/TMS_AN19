package Lesson6;

public class Class_L6_1 {
    public static void main(String[] args) {
        Student[] students  = new Student[14];
        for (int i=0; i<14; i++) {
            students[i] = new Student("Name"+(i+1),i+1,i+1);
            students[i].displayInfo();
        }

    }
}
