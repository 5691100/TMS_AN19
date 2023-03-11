package Lesson8.HW_Positions;

public class Main {
    public static void main(String[] args) {
        PrintPosition[] person = new PrintPosition[5];
        person[0] = new Director("Tom", "Director");
        person[1] = new Accountant("Bill", "Accountant");
        person[2] = new Accountant("Jim", "Employee");
        person[3] = new Accountant("Ben", "Employee");
        person[4] = new Accountant("Dan", "Employee");

        for (PrintPosition p: person) {
            p.printPosition();
        }



    }
}
