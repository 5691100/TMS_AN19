package Lesson9.HW.Parking;

import java.time.LocalDate;

public class Car {
    private String nameCar;
    private String vin;
    private LocalDate manufactureDate;

    public Car(String nameCar, String vin, LocalDate manufactureDate) {
        this.nameCar = nameCar;
        this.vin = vin;
        this.manufactureDate = manufactureDate;
    }

    public String getNameCar() {
        return nameCar;
    }

    public void setNameCar(String nameCar) {
        this.nameCar = nameCar;
    }

    public String getVin() {
        return vin;
    }
    public void setVin(String vin) {
        this.vin = vin;
    }
    public LocalDate getManufactureDate() {
        return manufactureDate;
    }
    public void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }
}
