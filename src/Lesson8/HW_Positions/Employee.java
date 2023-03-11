package Lesson8.HW_Positions;

public class Employee implements PrintPosition {

    String name;
    String position;

    public Employee(String name, String position) {
        this.name = name;
        this.position = position;
    }

    @Override
    public void printPosition() {
        System.out.println("Position: " + position);

    }
}
