package Lesson8.HW_Figure;

public class Rectangle extends Figure
{
    Double a;
    Double b;

    public Rectangle(Double a, Double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public Double area() {
        return a*b;
    }

    @Override
    public Double perimetr() {
        return 2*(a+b);
    }
}
