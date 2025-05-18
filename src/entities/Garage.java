package entities;

import java.util.ArrayList;
import java.util.List;

public class Garage<T extends Car> {

    private List<T> cars = new ArrayList<>();

    public void addCar(T car) {
        cars.add(car);
    }

    public void removeCar(T car) {
        cars.remove(car);
    }

    public void listCars() {
        for (T car : cars) {
            System.out.println(car);
        }
    }
}
