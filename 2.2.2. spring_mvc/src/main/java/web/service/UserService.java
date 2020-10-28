package web.service;

import web.model.Car;

import java.util.List;

public interface UserService {
    List<Car> getcars();

    List<Car> countCars(Long count);
}