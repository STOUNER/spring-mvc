package web.dao;

import web.model.Car;

import java.util.List;

public interface CarDao {
    public void addCar(Car car);

    public List<Car> listCar();
}
