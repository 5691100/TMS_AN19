package Lesson9.HW.Parking;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Parking {
    List<Car> cars = new ArrayList<>();

    public Parking() {
    }

    public void setCars(Car... car) {
        cars.addAll(Arrays.asList(car));
    }

    public String checkCar(String vin) throws NullPointerException {
        Car existingCar = null;
        for (Car car : cars) {
            if (car.getVin().equals(vin)) {
                existingCar = car;
                break;
            }
        }
        if (existingCar == null) {
            throw new NullPointerException("Wrong vin1!");
        }
        return existingCar.getNameCar();
    }

    public int countByYears(int years) {
        int today = LocalDate.now().getYear();
        int counter = 0;
        for (Car car: cars) {
            if ((today - car.getManufactureDate().getYear()) > years) {
                counter++;
            }
        }
        return counter;
    }

}
