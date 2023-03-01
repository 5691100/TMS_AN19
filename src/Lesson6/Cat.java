package Lesson6;

public class Cat {
    String name;
    int age;
    int saturation;

    public Cat(String name, int age, int saturation) {
        this.name = name;
        this.age = age;
        this.saturation = saturation;
    }

    public boolean feedCat (int saturation) {
        return saturation >= this.saturation;
    }
}
