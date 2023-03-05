package Lesson7.HW_Phone;

public class Phone {
    private int number;
    private String model;
    private Double weight;

    public Phone (int number, String model, Double weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    public void printModel() {
        System.out.println("Number: " +number + "   Model: " + model + "    Weight: " + weight);
    }

    public void receiveCall (String name) {
        System.out.println("Call: " + name);
    }

    public void getNumber () {
        System.out.println("Number: " + number);
    }

    public void receiveCall (String name, int number) {
        System.out.println("Name: " + name + "  Number: " + number);
    }

    public void sendMessage (int number) {
        System.out.println("Message sent to number: " + number);
    }


}

