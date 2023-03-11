package Lesson8.HW_Positions;

public class Accountant implements PrintPosition {
    String name;
    String position;

    public Accountant(String name, String position) {
        this.name = name;
        this.position = position;
    }

    @Override
    public void printPosition() {
        System.out.println("Position: " + position);

    }
}
