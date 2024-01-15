package service;

import model.Car;

import java.util.ArrayList;
import java.util.List;

public class TabService {
private int id = 1;

public List listCars(String count) {
    List<Car> cars = new ArrayList<>();
    cars.add(new Car(id++, "Toyota", "Corolla"));
    cars.add(new Car(id++, "Nissan", "Primera"));
    cars.add(new Car(id++, "Audi", "Q7"));
    cars.add(new Car(id++, "Porsche", "Panamera"));
    cars.add(new Car(id++, "Lexus", "LX570"));
    List<Car> cars2 = cars.subList(0, Integer.parseInt(count) > 5 ? 5 : Integer.parseInt(count));
    return cars2;
}
}
