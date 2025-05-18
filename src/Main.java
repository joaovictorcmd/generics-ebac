import entities.Car;
import entities.Garage;
import entities.SUV;
import entities.Sedan;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Car car1 = new Sedan("Toyota Corolla", "Prata", 2022);
        Car car2 = new Sedan("Honda Civic", "Preto", 2021);

        Car car3 = new SUV("Jeep Compass", "Branco", 2023);
        Car car4 = new SUV("Hyundai Creta", "Azul", 2022);


        Garage garage = new Garage();

        garage.addCar(car1);
        garage.addCar(car2);
        garage.addCar(car3);
        garage.addCar(car4);

        garage.listCars();
    }
}