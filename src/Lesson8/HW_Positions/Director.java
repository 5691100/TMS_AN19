package Lesson8.HW_Positions;

public class Director implements PrintPosition {
    String name;
    String position;

    public Director(String name, String position) {
        this.name = name;
        this.position = position;
    }

    @Override
    public void printPosition() {
        System.out.println("Position: " + position);

    }
}
