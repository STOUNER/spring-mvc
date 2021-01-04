package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {
    public void addCar(Car car);

    public List<Car> getAllCar();
}
