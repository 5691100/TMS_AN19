package Lesson6.HW;

public class HW_1 {
    public static void main(String[] args) {
        Comp comp1 = new Comp(100, "HP");

        Comp comp2 = new Comp(200,"Dell", new RAM("Samsung", 256),
                new HDD("Kingstone", 512, "Portable"));

        comp1.displayInfo();
        comp2.displayInfo();


    }
}
