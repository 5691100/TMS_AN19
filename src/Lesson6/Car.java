package Lesson6;

import java.util.Objects;

public class Car
{
    String vin;
    float engineCapacity;
    String brand;

    public Car(String vin, float engineCapacity, String brand) {
        this.vin = vin;
        this.engineCapacity = engineCapacity;
        this.brand = brand;
    }


    void drive(String name, int speed) {
        System.out.println("Car " + vin + " is driving with driver " + name + " with speed " + speed);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Float.compare(car.engineCapacity, engineCapacity) == 0 && vin.equals(car.vin) && brand.equals(car.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vin, engineCapacity, brand);
    }
}
