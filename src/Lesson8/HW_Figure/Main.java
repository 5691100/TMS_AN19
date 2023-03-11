package Lesson8.HW_Figure;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[5];
        figures[0] = new Triangle(3.0,4.0,6.0);
        figures[1] = new Rectangle(4.0,8.0);
        figures[2] = new Round(3.0);
        figures[3] = new Triangle(1.0,2.0,3.0);
        figures[4] = new Rectangle(4.5,3.4);

        for (int i = 0; i < 5; i++) {
            System.out.print("Area of the figure " + (i+1)+": " + figures[i].area()+"    ");
            System.out.println("Perimeter of the figure " + (i+1) + ": " + figures[i].perimetr());
        }
    }
}
