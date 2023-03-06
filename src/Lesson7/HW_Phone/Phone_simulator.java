package Lesson7.HW_Phone;

public class Phone_simulator {
    public static void main(String[] args) {
        Phone iphone = new Phone(291111111, "Iphone 14", 5.7);
        Phone samsung = new Phone(292222222, "Samsung S20", 6.5);
        Phone xiaomi = new Phone(293333333, "Xiaomi Note 10", 5.9);

        iphone.printModel();
        samsung.printModel();
        xiaomi.printModel();

        String name1 = "Peter";
        String name2 = "John";
        String name3 = "Bob";
        int number = 294444444;

        iphone.receiveCall(name1);
        samsung.getNumber();
        samsung.receiveCall(name2);
        samsung.receiveCall(name2, number);
        xiaomi.receiveCall(name3);

        iphone.sendMessage(295555555);
        samsung.sendMessage(number);

    }
}
