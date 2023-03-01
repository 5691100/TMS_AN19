package Lesson6.HW;

import java.util.Arrays;

public class Comp {
    int cost;
    String model;
    RAM ram;
    HDD hdd;
    public Comp(int cost, String model) {
        this.cost = cost;
        this.model = model;
        this.ram = new RAM();
        this.hdd = new HDD();
    }
    public Comp(int cost, String model, RAM ram, HDD hdd) {
        this.cost = cost;
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;
    }
    void displayInfo () {
        System.out.printf("Cost: %s\tModel: %s\nRAM: Name: %s\tCapacity: %s\nHDD: Name: %s\tCapacity: %d\tType: %s\n",
                cost, model, ram.name, ram.capacity, hdd.name, hdd.capacity, hdd.type);
        }

}
