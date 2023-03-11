package Lesson8.HW_Figure;

public class Round extends Figure {

    Double r;

    public Round(Double r) {
        this.r = r;
    }

    @Override
    Double area() {
        return Math.PI*r*r;
    }

    @Override
    Double perimetr() {
        return 2*Math.PI*r;
    }
}
