package Lesson11.Example.Class2;

public class AmountToSum {
    private int studentsAmount;
    private float mark;

    public AmountToSum() {
    }

    public AmountToSum(int studentsAmount, float mark) {
        this.studentsAmount = studentsAmount;
        this.mark = mark;
    }

    public int getStudentsAmount() {
        return studentsAmount;
    }

    public void setStudentsAmount(int studentsAmount) {
        this.studentsAmount = studentsAmount;
    }

    public float getMark() {
        return mark;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }
}
