package Lesson8.HW_Figure;

class Triangle extends Figure {

    Double a;
    Double b;
    Double c;

    @Override
    public Double area() {
        Double p = a+b+c;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    @Override
    public Double perimetr() {
        return (a+b+c);
    }

    public Triangle(Double a, Double b, Double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

}