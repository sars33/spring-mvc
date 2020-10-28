package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UserServiceImp implements UserService {

    @Override
    public List<Car> getcars() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Bmw", "300ci", "300"));
        cars.add(new Car("Honda", "Pilot", "SE"));
        cars.add(new Car("Toyota", "Rav4", "SE"));
        cars.add(new Car("Ford", "Focus", "SE"));
        cars.add(new Car("Hyundai", "Elantra", "LE"));

        return cars;
    }

    @Override
    public List<Car> countCars(Long count) {
        List<Car> carList = getcars();
        List<Car> listOfCars = carList.stream().limit(count).collect(Collectors.toList());
        return listOfCars;

    }
}
